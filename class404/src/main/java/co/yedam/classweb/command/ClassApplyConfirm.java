package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.serviceImpl.ClassServiceImpl;
import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;

public class ClassApplyConfirm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 수강신청 확정
		ClassService clDao = new ClassServiceImpl();
		MemberService memDao = new MemberServiceImpl();
		HttpSession session = request.getSession();
		
		int clid = Integer.valueOf(request.getParameter("clId"));
		String id = (String)session.getAttribute("id");
		String page = "";
		
		int n = clDao.classApply(clid, id);
		
		String message = "";
		
		if (n == 404) {
			message = "여석이 없습니다.";
			page = "home/classApplyMessage";
		} else if (n!=0 && n!=404) {
			message = "수강신청에 성공하였습니다!";
			page = "home/classApplySuccess";
		} else {
			message = "수강신청에 실패하였습니다.";
			page = "home/classApplyMessage";
		}
		
		request.setAttribute("message", message);
		
		return page;
	}

}
