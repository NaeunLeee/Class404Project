package co.yedam.classweb.command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.board.service.BoardService;
import co.yedam.classweb.board.serviceImpl.BoardServiceImpl;
import co.yedam.classweb.board.vo.BoardVO;
import co.yedam.classweb.common.Command;

public class BoardSelect implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 공지사항 한건 조회
		BoardService boardDao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setbId(Integer.valueOf(request.getParameter("bId")));
		vo = boardDao.boardSelect(vo);
		request.setAttribute("board", vo);
		
		
		return "home/boardSelect";
	}

}
