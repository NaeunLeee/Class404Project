package co.yedam.classweb.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassAdminUpdate implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 관리자가 클래스를 수정
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		
		int clId = Integer.valueOf(request.getParameter("clId"));
		
		vo.setClName(request.getParameter("clName"));
		vo.setClDate(Date.valueOf(request.getParameter("clDate")));
		vo.setClPlace(request.getParameter("clPlace"));
		vo.setClMax(Integer.valueOf(request.getParameter("clMax")));
		vo.setClDetail(request.getParameter("clDetail"));
		
		int n = dao.classUpdate(vo, clId);
		String message = "";
		
		if (n != 0) {
			message = "수정에 성공하였습니다!";
		} else {
			message = "수정에 실패했습니다.";
		}
		
		
		request.setAttribute("message", message);
		
		return "home/updateMessage";
	}

}
