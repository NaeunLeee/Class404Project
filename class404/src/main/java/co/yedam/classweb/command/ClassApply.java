package co.yedam.classweb.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassApply implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 수강신청 전 목록 뿌려주는 클래스
		ClassService classDao = new ClassServiceImpl();
		List<ClassVO> list = new ArrayList<ClassVO>();
		list = classDao.classSelectList();
		request.setAttribute("list", list);
		
		return "home/classApply";
	}

}
