package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 클래스 한건 조회
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		
		int n = Integer.valueOf(request.getParameter("clId"));
		vo = dao.classSelectOne(n);
		request.setAttribute("list", vo);
		
		return "home/classSelect";
	}

}
