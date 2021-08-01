package co.yedam.classweb.classes.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.classweb.classes.service.ClassService;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.DataSource;

public class ClassServiceImpl implements ClassService {
	
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	// 클래스 목록 조회
	public List<ClassVO> classSelectList() {
		List<ClassVO> list = new ArrayList<ClassVO>();
		ClassVO vo;
		String sql = "select * from class";
		
		try {
			conn = dataSource.getConnection();
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

	// 클래스 한건 조회
	public ClassVO classSelectOne(int no) {
		String sql = "select * from class where clid = ?";
		ClassVO vo = new ClassVO();
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				vo = new ClassVO();
				vo.setClId(no);
				vo.setClName(rs.getString("clname"));
				vo.setClTeacher(rs.getString("clteacher"));
				vo.setClDate(rs.getDate("cldate"));
				vo.setClPlace(rs.getString("clplace"));
				vo.setClMax(rs.getInt("clmax"));
				vo.setClStudent(rs.getInt("clstudent"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return vo;
	}

	// 수강신청
//	public int classApply(int clid) {
//		int n = 0;
//		String sql1 = "select clmax, clstudent from class where clid = ?";
//		PreparedStatement psmt1;
//		PreparedStatement psmt2;
//		
//		try {
//			conn = dataSource.getConnection();
//			psmt1 = conn.prepareStatement(sql1);
//			psmt1.setInt(1, clid);
//			
//			rs = psmt1.executeQuery();
//			while (rs.next()) {
//				int clmax = rs.getInt("clmax");
//				int clstudent = rs.getInt("clstudent");
//				
//				// 현재 수강신청인원이 최대인원을 넘지 않을때만 수강신청 가능
//				if (clstudent<clmax) {
//					String sql2 = "update class set clstudent = clstudent + 1 where clid = ?";
//					psmt2 = conn.prepareStatement(sql2);
//					psmt2.setInt(1, clid);
//					n = psmt2.executeUpdate();
//				} else {
//					// 최대인원을 넘으면 n을 마이너스로 돌려줘서 다른 클래스에서 써먹을수있도록
//					n = -1;
//				}
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close();
//		}
//		return n;
//	}

	public int classApply(int clid) {
		int n = 0;
		PreparedStatement psmt1;
		PreparedStatement psmt2;
		PreparedStatement psmt3;
		
		try {
			conn = dataSource.getConnection();
			String sql1 = "select clmax, clstudent from class where clid = ?";
			psmt1 = conn.prepareStatement(sql1);
			psmt1.setInt(1, clid);
			rs = psmt1.executeQuery();
			
			while (rs.next()) {
				int clmax = rs.getInt("clmax");
				int clstudent = rs.getInt("clstudent");
				
				// 현재 수강신청인원이 최대인원을 넘지 않을때만 수강신청 가능
				if (clstudent<clmax) {
					String sql2 = "select count(*) from member where clid = ?";
					psmt2 = conn.prepareStatement(sql2);
					psmt2.setInt(1, clid);
					rs = psmt2.executeQuery();
					clstudent = rs.getInt("count(*)");
					
					while (rs.next()) {
						String sql3 = "update class set clstudent = ? where clid = ?";
						psmt3 = conn.prepareStatement(sql3);
						psmt3.setInt(1, clstudent);
						psmt3.setInt(2, clid);
						n = psmt3.executeUpdate();
					}
				} else {
					// 최대인원을 넘으면 n을 마이너스로 돌려줘서 다른 클래스에서 써먹을수있도록
					n = 404;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}
	
	// 클래스 등록
	public int classInsert(ClassVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 클래스 수정
	public int classUpdate(ClassVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 클래스 삭제
	public int classDelete(ClassVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	// 연결 해제
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
