package co.yedam.classweb.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.board.service.BoardService;
import co.yedam.classweb.board.serviceImpl.BoardServiceImpl;
import co.yedam.classweb.board.vo.BoardVO;
import co.yedam.classweb.common.Command;

public class BoardList implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// 공지사항
				BoardService boardDao = new BoardServiceImpl();
				List<BoardVO> list = new ArrayList<BoardVO>();
				list = boardDao.boardSelectList();
				request.setAttribute("list", list);
				
				return "home/boardList";
	}

}
