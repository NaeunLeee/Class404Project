package co.yedam.classweb.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.command.BoardList;
import co.yedam.classweb.command.ClassApply;
import co.yedam.classweb.command.ClassApplyConfirm;
import co.yedam.classweb.command.ClassApplyForm;
import co.yedam.classweb.command.ClassList;
import co.yedam.classweb.command.ClassSelect;
import co.yedam.classweb.command.Home;
import co.yedam.classweb.command.Login;
import co.yedam.classweb.command.Test01;
import co.yedam.classweb.command.LoginForm;
import co.yedam.classweb.command.Logout;
import co.yedam.classweb.command.MyPage;
import co.yedam.classweb.command.MyPageError;
import co.yedam.classweb.command.MyPageUpdate;
import co.yedam.classweb.command.Signup;
import co.yedam.classweb.command.SignupForm;
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
