package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;
import co.yedam.classweb.teacher.service.TeacherService;
import co.yedam.classweb.teacher.serviceImpl.TeacherServiceImpl;
import co.yedam.classweb.teacher.vo.TeacherVO;

public class AuthorUpdate implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 권한 수정

		MemberService dao = new MemberServiceImpl();
		TeacherService tdao = new TeacherServiceImpl();
		TeacherVO tvo = new TeacherVO();
		MemberVO vo = new MemberVO();

		String page = "";

		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		int n = dao.memberAuthorUpdate(vo);

		if (n != 0) {
			tvo.setId(request.getParameter("id"));
			tvo.setName(request.getParameter("name"));
			int e = tdao.teacherDelete(tvo);
			if (e != 0) {
				page = "home/authorUpdate";
			} else {
				page = "home/myPageError";
			}
		} else {
			page = "home/myPageError";
		}

		return page;
	}

}
