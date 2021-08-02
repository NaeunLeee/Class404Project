package co.yedam.classweb.member.service;

import java.util.List;

import co.yedam.classweb.member.vo.MemberVO;

public interface MemberService {

	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo);
	MemberVO memberLogin(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	
	int memberAuthorUpdate(MemberVO vo);
	
}
