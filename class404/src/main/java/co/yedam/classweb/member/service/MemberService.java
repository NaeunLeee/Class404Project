package co.yedam.classweb.member.service;

import java.util.List;

import co.yedam.classweb.member.vo.MemberVO;

public interface MemberService {

	List<MemberVO> memberSelectList();
	MemberVO memSelectById(String id);
	MemberVO memberSelect(MemberVO vo);
	MemberVO memberLogin(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memUpdateByAdmin(String id, MemberVO vo);
	int memberAuthorUpdate(MemberVO vo);
	
}
