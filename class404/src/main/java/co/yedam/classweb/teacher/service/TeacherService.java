package co.yedam.classweb.teacher.service;

import java.util.List;

import co.yedam.classweb.teacher.vo.TeacherVO;

public interface TeacherService {
	
	List<TeacherVO> teacherSelectList();
	
	TeacherVO teacherSelect(TeacherVO vo);
	
	int teacherInsert(TeacherVO vo);
	int teacherDelete(TeacherVO vo);
	int teacherUpdate(TeacherVO vo);

}
