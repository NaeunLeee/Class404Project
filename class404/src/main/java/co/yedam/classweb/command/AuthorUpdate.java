package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class AuthorUpdate implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 권한 수정
		
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		String page = "";
		
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		int n = dao.memberAuthorUpdate(vo);
		
		if (n != 0 ) {
			page = "home/authorUpdate";
		}else {
			page = "home/myPageError";
		}
		
		return page;
	}

}
