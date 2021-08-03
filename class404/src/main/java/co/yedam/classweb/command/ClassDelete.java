package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassDelete implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 강좌 삭제
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		HttpSession session = request.getSession();
		String message = "";
		String clTeacher = (String)session.getAttribute("name");
		
		vo = dao.clSelectByTeacher(clTeacher);
		int clId = vo.getClId();
		
		int n = dao.classDelete(clId);
		
		if (n != 0) {
			message = "강좌를 삭제하였습니다!";
		} else {
			message = "삭제에 실패했습니다.";
		}
		
		request.setAttribute("message", message);
		
		return "home/deleteMessage";
	}

}
