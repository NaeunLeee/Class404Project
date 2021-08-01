package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassApplyForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 수강신청 폼
		ClassService dao = new ClassServiceImpl();
		ClassVO vo = new ClassVO();
		// 먼저 클릭한 클래스의 세부 사항을 보여줌
		int n = Integer.valueOf(request.getParameter("clId"));
		vo = dao.classSelectOne(n);
		request.setAttribute("list", vo);
		
		return "home/classApplyForm";
	}

}
