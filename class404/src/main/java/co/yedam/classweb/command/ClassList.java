package co.yedam.classweb.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.Command;

public class ClassList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 강좌 목록 조회
		ClassService classDao = new ClassServiceImpl();
		List<ClassVO> list = new ArrayList<ClassVO>();
		list = classDao.classSelectList();
		request.setAttribute("list", list);
		
		return "home/classList";
	}

}
