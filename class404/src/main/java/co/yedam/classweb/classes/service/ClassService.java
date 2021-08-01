package co.yedam.classweb.classes.service;

import java.util.List;

import co.yedam.classweb.classes.vo.ClassVO;

public interface ClassService {
	
	// 강의 목록 전체 조회
	List<ClassVO> classSelectList();
	
	// 강의 한건 조회
	ClassVO classSelectOne(int no);
	
	// 수강 신청 
	int classApply(int clid, String id);
	
	// 강의 추가
	int classInsert(ClassVO vo);	
	
	// 강의 수정
	int classUpdate(ClassVO vo);
	
	// 강의 삭제
	int classDelete(ClassVO vo);
	
	// 수강신청인원 새로고침
	void classRefresh();
	
	
}
