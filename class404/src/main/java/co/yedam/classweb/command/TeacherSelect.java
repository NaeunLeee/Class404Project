package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.teacher.service.TeacherService;
import co.yedam.classweb.teacher.serviceImpl.TeacherServiceImpl;
import co.yedam.classweb.teacher.vo.TeacherVO;

public class TeacherSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 강사신청 상세보기
		TeacherService dao = new TeacherServiceImpl();
		TeacherVO vo = new TeacherVO();
		System.out.println(request.getParameter("id"));
		
		vo.setId(request.getParameter("id"));
		vo = dao.teacherSelect(vo);
		
		request.setAttribute("vo", vo);
		
		return "home/teacherSelect";
	}

}
