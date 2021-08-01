package co.yedam.classweb.command;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.serviceImpl.MemberServiceImpl;
import co.yedam.classweb.member.vo.MemberVO;

public class Signup implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		
		//String hobbies = request.getParameter("hobbies");
		
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String birthYear = request.getParameter("birth").substring(0, 4);
		int age = year - Integer.valueOf(birthYear) + 1;
		
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAge(age);
		vo.setHobby(request.getParameter("hobbies"));
		
		int n = dao.memberInsert(vo);
		String page = "";
		
		if (n != 0) {
			page = "home/signupSuccess";
		} else {
			page = "home/signupFail";
		}
		
		return page;
	}

}
