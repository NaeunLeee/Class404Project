package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class MemberUpdate implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원 정보를 실제로 수정하여 커밋하는 클래스
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		String message = "";
		String id = (String)request.getParameter("formerId");
		
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setAge(Integer.valueOf(request.getParameter("age")));
		vo.setAuthor(request.getParameter("author"));
		
		int n = dao.memUpdateByAdmin(id, vo);
		
		if (n != 0) {
			message = "수정에 성공하였습니다!";
		} else {
			message = "수정에 실패했습니다.";
		}
		
		request.setAttribute("message", message);
		
		return "home/memUpdateMessage";
	}

}
