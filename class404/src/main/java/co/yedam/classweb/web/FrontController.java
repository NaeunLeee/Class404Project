package co.yedam.classweb.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.command.BoardList;
import co.yedam.classweb.command.ClassList;
import co.yedam.classweb.command.Home;
import co.yedam.classweb.command.Login;
import co.yedam.classweb.command.Test01;
import co.yedam.classweb.command.LoginForm;
import co.yedam.classweb.command.Logout;
import co.yedam.classweb.command.SignupForm;
import co.yedam.classweb.common.Command;

/**
 * Servlet implementation class FrontController
 */

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		map.put("/home.do", new Home());
		map.put("/test01.do", new Test01());
		map.put("/login.do", new Login());
		map.put("/logout.do", new Logout());
		map.put("/loginForm.do", new LoginForm());
		map.put("/classList.do", new ClassList());
		map.put("/boardList.do", new BoardList());
		map.put("/signupForm.do", new SignupForm());
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
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
