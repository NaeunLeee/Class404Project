package co.yedam.classweb.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.command.AuthorUpdate;
import co.yedam.classweb.command.BoardAdd;
import co.yedam.classweb.command.BoardList;
import co.yedam.classweb.command.BoardSelect;
import co.yedam.classweb.command.BoardUpdateForm;
import co.yedam.classweb.command.ClassApply;
import co.yedam.classweb.command.ClassApplyConfirm;
import co.yedam.classweb.command.ClassApplyForm;
import co.yedam.classweb.command.ClassDelete;
import co.yedam.classweb.command.ClassInsert;
import co.yedam.classweb.command.ClassInsertForm;
import co.yedam.classweb.command.ClassList;
import co.yedam.classweb.command.ClassSelect;
import co.yedam.classweb.command.ClassUpdate;
import co.yedam.classweb.command.ClassUpdateForm;
import co.yedam.classweb.command.DeleteBoard;
import co.yedam.classweb.command.Home;
import co.yedam.classweb.command.InsertBoard;
import co.yedam.classweb.command.Login;
import co.yedam.classweb.command.LoginForm;
import co.yedam.classweb.command.Logout;
import co.yedam.classweb.command.MemberManagement;
import co.yedam.classweb.command.MemberUpdate;
import co.yedam.classweb.command.MyPage;
import co.yedam.classweb.command.MyPageError;
import co.yedam.classweb.command.MyPageUpdate;
import co.yedam.classweb.command.Signup;
import co.yedam.classweb.command.SignupForm;
import co.yedam.classweb.command.TeacherAdd;
import co.yedam.classweb.command.TeacherInsert;
import co.yedam.classweb.command.TeacherList;
import co.yedam.classweb.command.TeacherSelect;
import co.yedam.classweb.command.Test01;
import co.yedam.classweb.command.UpdateBoard;
import co.yedam.classweb.common.Command;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();

	public FrontController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new Home());
		map.put("/test01.do", new Test01());
		
		// 로그인
		map.put("/loginForm.do", new LoginForm());
		map.put("/login.do", new Login());
		map.put("/logout.do", new Logout());
		
		// 클래스 조회
		map.put("/classList.do", new ClassList());
		map.put("/classSelect.do", new ClassSelect());
		
		// 공지사항 조회
		map.put("/boardList.do", new BoardList());
		map.put("/boardSelect.do", new BoardSelect());
		map.put("/boardUpdateForm.do", new BoardUpdateForm());
		map.put("/updateBoard.do", new UpdateBoard());
		map.put("/deleteBoard.do", new DeleteBoard());
		map.put("/boardAdd.do", new BoardAdd());
		map.put("/insertBoard.do", new InsertBoard());
		
		// 회원가입
		map.put("/signupForm.do", new SignupForm());
		map.put("/signup.do", new Signup());
		
		// 마이페이지
		map.put("/myPage.do", new MyPage());
		map.put("/myPageUpdate.do", new MyPageUpdate());
		map.put("/myPageError.do", new MyPageError());
		
		// 수강신청
		map.put("/classApply.do", new ClassApply());
		map.put("/classApplyForm.do", new ClassApplyForm());
		map.put("/classApplyConfirm.do", new ClassApplyConfirm());
		
		// 관리자 회원관리
		map.put("/memberUpdate.do", new MemberUpdate());
		map.put("/memberManagement.do", new MemberManagement());
		map.put("/authorUpdate.do", new AuthorUpdate());
		
		// 강사신청
		map.put("/teacherList.do", new TeacherList());
		map.put("/teacherSelect.do", new TeacherSelect());
		map.put("/teacherInsert.do", new TeacherInsert());
		map.put("/teacherAdd.do", new TeacherAdd());
		
		// 강좌 등록, 수정, 삭제
		map.put("/classInsertForm.do", new ClassInsertForm());
		map.put("/classInsert.do", new ClassInsert());
		map.put("/classUpdateForm.do", new ClassUpdateForm());
		map.put("/classUpdate.do", new ClassUpdate());
		map.put("/classDelete.do", new ClassDelete());

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());

		Command command = map.get(page);
		String viewPage = command.execute(request, response);

//		if (!viewPage.endsWith(".do") && !viewPage.endsWith(".jsp") ) {
//			viewPage = viewPage + ".tiles";
//		} else if (viewPage.endsWith(".jsp")) { // 타일즈를 안 태울 거야
//			viewPage = "/WEB-INF/views/" + viewPage;
//		}
	if (!viewPage.endsWith(".do")) { // "home. do"
			if (!viewPage.endsWith(".jsp")) {
				viewPage = viewPage + ".tiles"; // "home/home"
			} else {
				viewPage = "/WEB-INF/views/" + viewPage; // "home/home.jsp"
			}
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);

	}

}
