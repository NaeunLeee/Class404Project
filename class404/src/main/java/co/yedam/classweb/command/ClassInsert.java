package co.yedam.classweb.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 폼을 받아와 실제로 커밋을 해주는 클래스
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		HttpSession session = request.getSession();
		
		vo.setClTeacher((String)session.getAttribute("name"));
		vo.setClName(request.getParameter("clName"));
		vo.setClDate(Date.valueOf(request.getParameter("clDate")));
		vo.setClPlace(request.getParameter("clPlace"));
		vo.setClMax(Integer.valueOf(request.getParameter("clMax")));
		
		int n = dao.classInsert(vo);
		String message = "";
		
		if (n != 0) {
			message = "등록에 성공하였습니다!";
		} else {
			message = "등록에 실패했습니다.";
		}
		
		return "home/classInsertMessage";
	}

}
