package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.common.Command;

public class BoardSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 공지사항 한건 조회
		
		
		return "home/boardSelect";
	}

}
