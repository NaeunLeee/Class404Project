package co.yedam.classweb.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.classweb.board.service.BoardService;
import co.yedam.classweb.board.serviceImpl.BoardServiceImpl;
import co.yedam.classweb.board.vo.BoardVO;
import co.yedam.classweb.common.Command;

public class InsertBoard implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 게시글 등록
				BoardService dao = new BoardServiceImpl();
				BoardVO vo = new BoardVO();
				vo.setbWriter(request.getParameter("bWriter"));
				vo.setbTitle(request.getParameter("bTitle"));
				vo.setbContent(request.getParameter("bContent"));
				vo.setbDate(Date.valueOf(request.getParameter("bDate")));
				int n = dao.boardInsert(vo);
				String page="";
				if (n != 0) {
					page="boardList.do";
				}else {
					page="home/myPageError";
				}
				
				return page;
	}

}
