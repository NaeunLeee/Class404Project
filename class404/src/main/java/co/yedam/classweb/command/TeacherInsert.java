package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.teacher.service.TeacherService;
import co.yedam.classweb.teacher.serviceImpl.TeacherServiceImpl;
import co.yedam.classweb.teacher.vo.TeacherVO;

public class TeacherInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 강사신청 등록
		
		TeacherService dao = new TeacherServiceImpl();
		TeacherVO vo = new TeacherVO();
		String page = "";
		
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setField(request.getParameter("field"));
		vo.setLicense(request.getParameter("license"));
		vo.setCareer(request.getParameter("career"));
		int n = dao.teacherInsert(vo);
		
		if (n != 0) {
			page = "home/teacherInsert";
		} else {
			page = "home/myPageError";
		}
		
		
		
		return page;
	}

}
