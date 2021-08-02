package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class MemberDelete implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원 삭제
		MemberService dao = new MemberServiceImpl();
		
		String message = "";
		String id = request.getParameter("id");
		int n = dao.memberDelete(id);
		
		if (n != 0) {
			message = "회원을 삭제하였습니다.";
		} else {
			message = "삭제에 실패했습니다.";
		}
		
		request.setAttribute("message", message);
		
		return "home/memberDeleteMessage";
	}

}
