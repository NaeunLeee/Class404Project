package co.yedam.classweb.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassUpdate implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 클래스를 실제로 수정하여 커밋하는 클래스
		ClassService dao = new ClassServiceImpl();
		ClassVO vo1 = new ClassVO();
		ClassVO vo2 = new ClassVO();
		HttpSession session = request.getSession();
		String message = "";
		String clTeacher = (String)session.getAttribute("name");

		
		vo1.setClName(request.getParameter("clName"));
		vo1.setClPlace(request.getParameter("clPlace"));
		vo1.setClDate(Date.valueOf(request.getParameter("clDate")));
		vo1.setClMax(Integer.valueOf(request.getParameter("clMax")));
		
		vo2 = dao.clSelectByTeacher(clTeacher);
		int clId = vo2.getClId();
		
		int n = dao.classUpdate(vo1, clId);
		
		if (n != 0) {
			message = "수정에 성공하였습니다!";
		} else {
			message = "수정에 실패했습니다.";
		}
		
		request.setAttribute("message", message);		
		
		return "home/classUpdateMessage";
	}

}
