package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.classweb.common.Command;

public class Logout implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃

		HttpSession session = request.getSession();
		String message = session.getAttribute("name") + "님 정상 로그아웃 되었습니다. ";
		session.invalidate(); // 세션을 완전히 없앰 = invalidate() , remove는 안에 값만 지움
		
		// remove라고 사용해서 지우면 id는 살아있슴
		//session.removeAttribute("name");
		//session.removeAttribute("author");
		
		request.setAttribute("message", message);
		
		
		return "home/logout";
	}

}
