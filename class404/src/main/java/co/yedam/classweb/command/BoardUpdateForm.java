package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.board.service.BoardService;
import co.yedam.classweb.board.serviceImpl.BoardServiceImpl;
import co.yedam.classweb.board.vo.BoardVO;
import co.yedam.classweb.common.Command;

public class BoardUpdateForm implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 공지사항 입력폼		
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setbId(Integer.valueOf(request.getParameter("bId")));
		vo = dao.boardSelect(vo);
		request.setAttribute("board", vo);
		
		return "home/boardUpdateForm";
	}

}
