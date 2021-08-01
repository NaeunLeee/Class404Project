package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class MyPage implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 마이페이지 폼을 가지고옴
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		HttpSession session = request.getSession();
		Object id = session.getAttribute("id");
		String page = "";
		// vo.setId(id);
		vo = dao.memberSelect(vo);
		
		request.setAttribute("member", vo);
		page = "home/myPage";
		return page;
	}

}
