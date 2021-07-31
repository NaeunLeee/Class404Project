package co.yedam.classweb.board.service;

import java.util.List;

import co.yedam.classweb.board.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> boardSelectList();
	
	BoardVO boardSelect(BoardVO vo);
	
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	

}
