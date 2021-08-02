package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class MemberUpdateForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원 정보 수정 폼을 뿌려주는 클래스
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		String id = (String)request.getAttribute("id");
		vo = dao.memSelectById(id);
		
		request.setAttribute("list", vo);
		
		return "home/memberUpdateForm";
	}

}
