package co.yedam.classweb.teacher.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.classweb.common.DataSource;
import co.yedam.classweb.teacher.service.TeacherService;
import co.yedam.classweb.teacher.vo.TeacherVO;

public class TeacherServiceImpl implements TeacherService {

	private DataSource dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	@Override
	public List<TeacherVO> teacherSelectList() {
		// 강사신청 목록
		List<TeacherVO> list = new ArrayList<TeacherVO>();
		TeacherVO vo;
		String sql = "select * from teacher";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new TeacherVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setLicense(rs.getString("license"));
				vo.setCareer(rs.getString("career"));
				vo.setField(rs.getString("field"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}

	@Override
	public TeacherVO teacherSelect(TeacherVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int teacherInsert(TeacherVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int teacherDelete(TeacherVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int teacherUpdate(TeacherVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private void close() {
		try {
			if (rs != null) rs.close();
			if (psmt != null) psmt.close();
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}