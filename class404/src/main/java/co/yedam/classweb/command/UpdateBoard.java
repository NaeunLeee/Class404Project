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
		// 게시판을 실제로 수정하여 커밋하는 클래스
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();
		
		vo.setbTitle(request.getParameter("bTitle"));
		vo.setbContent(request.getParameter("bContent"));
		vo.setbId(Integer.valueOf(request.getParameter("bId")));
		int n = dao.boardUpdate(vo);
		
		String message = "";
		
		if (n != 0) {
			message = "수정에 성공했습니다!";
		}else {
			message = "수정에 실패했습니다.";
		}
		
		request.setAttribute("message", message);
		
		return "home/updateMessage";
	}

}
