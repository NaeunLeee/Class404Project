package co.yedam.classweb.classes.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.DAO;

public class ClassServiceImpl implements ClassService {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<ClassVO> classSelectList() {
		List<ClassVO> list = new ArrayList<ClassVO>();
		ClassVO vo;
		String sql = "select * from class";
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new ClassVO();
				vo.setClId(rs.getInt("clid"));
				vo.setClName(rs.getString("clname"));
				vo.setClTeacher(rs.getString("clteacher"));
				vo.setClDate(rs.getDate("cldate"));
				vo.setClPlace(rs.getString("clplace"));
				vo.setClMax(rs.getInt("clmax"));
				vo.setClStudent(rs.getInt("clstudent"));
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
	public ClassVO classSelectOne(ClassVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int classApply(ClassVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int classInsert(ClassVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int classUpdate(ClassVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int classDelete(ClassVO vo) {
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
