package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;

public class SignupForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "home/signupForm";
	}

}
