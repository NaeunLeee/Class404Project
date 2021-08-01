package co.yedam.classweb.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.board.service.BoardService;
import co.yedam.classweb.board.serviceImpl.BoardServiceImpl;
import co.yedam.classweb.board.vo.BoardVO;
import co.yedam.classweb.common.Command;

public class UpdateBoard implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 수정폼
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		vo.setbTitle(request.getParameter("bTitle"));
		vo.setbContent(request.getParameter("bContent"));
		vo.setbId(Integer.valueOf(request.getParameter("bId")));
		int n = dao.boardUpdate(vo);
		String page="";
		if (n != 0) {
			page="boardList.do";
		}else {
			page="home/myPageError";
		}
		
		return page;
	}

}
