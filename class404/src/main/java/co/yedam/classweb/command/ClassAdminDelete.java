package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassAdminDelete implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 관리자가 클래스를 삭제
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		
		
		int clId = Integer.valueOf(request.getParameter("clId"));
		int n = dao.classDelete(clId);
		String message = "";
		
		if (n != 0) {
			message = "강좌를 삭제하였습니다!";
		} else {
			message = "삭제에 실패했습니다.";
		}
		
		request.setAttribute("message", message);
		
		return "home/deleteMessage";
	}

}
