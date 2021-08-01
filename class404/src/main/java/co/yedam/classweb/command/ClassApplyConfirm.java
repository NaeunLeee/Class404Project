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
		
		int n1 = clDao.classApply(clid);
		
		if (n1 == 404) {
			page = "home/classMaxError";
			
		} else if (n1 != 0 && n1 != 404) {
			int n2 = memDao.memberApply(clid, id);
			
			if (n2 != 0) {
				page = "home/classApplySuccess";
			} else {
				page = "home/classApplyFail";
			}
			
		} else {
			page = "home/classApplyFail";
		}
		
		return page;
	}

}
