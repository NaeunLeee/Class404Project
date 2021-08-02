package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession();
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		String page = "";
		
		if (vo.getName() != null) {
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("id", vo.getId());
			page = "home/home";
		} else {
			String message = "존재하지 않는 아이디/패스워드 입니다.";
			request.setAttribute("message", message);
			page = "home/loginForm.jsp";
		}
		return page;
		
	}

}
