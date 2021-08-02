package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassUpdateForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 클래스 수정 폼을 뿌려주는 클래스
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		HttpSession session = request.getSession();
		
		String clName = (String)session.getAttribute("name");
		vo = dao.clSelectByTeacher(clName);
		
		request.setAttribute("list", vo);
		
		return "home/classUpdateForm";
	}

}
