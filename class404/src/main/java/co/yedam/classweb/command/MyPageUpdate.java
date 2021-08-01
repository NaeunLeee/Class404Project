package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class MyPageUpdate implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 마이페이지 수정업데이트 
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		String page = "";
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAge(Integer.valueOf(request.getParameter("age")));
		int n = dao.memberUpdate(vo);
		
		if(n != 0) {
			page = "myPage.do";
		}else {
			page = "home/myPageError";
		}
		
		return page;
	}

}
