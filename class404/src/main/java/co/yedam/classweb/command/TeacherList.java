package co.yedam.classweb.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.teacher.service.TeacherService;
import co.yedam.classweb.teacher.serviceImpl.TeacherServiceImpl;
import co.yedam.classweb.teacher.vo.TeacherVO;

public class TeacherList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 강사신청
		TeacherService dao = new TeacherServiceImpl();
		List<TeacherVO> list = new ArrayList<TeacherVO>();
		list = dao.teacherSelectList();
		request.setAttribute("list", list);
		
		return "home/teacherList";
	}

}
