package co.yedam.classweb.classes.serviceImpl;

import java.sql.Connection;
import java.sql.Date;
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
	
	// 강사 이름으로 조회
	public ClassVO clSelectByTeacher(String clName) {
		ClassVO vo = new ClassVO();
		String sql = "select * from class where clteacher = ?";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, clName);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				vo = new ClassVO();
				vo.setClId(rs.getInt("clid"));
				vo.setClName(rs.getString("clname"));
				vo.setClTeacher(clName);
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
	public int classApply(int clid, String id) {
		int n = 0;
		String sql1 = "select clmax, clstudent from class where clid = ?";
		String sql2 = "update member set clid = ? where id = ?";
		PreparedStatement psmt1;
		PreparedStatement psmt2;

		try {
			conn = dataSource.getConnection();
			psmt1 = conn.prepareStatement(sql1);
			psmt1.setInt(1, clid);
			rs = psmt1.executeQuery();

			while (rs.next()) {
				int clmax = rs.getInt("clmax");
				int clstudent = rs.getInt("clstudent");

				// 현재 수강신청인원이 최대인원 보다 작을 때만 수강신청 가능
				if (clstudent < clmax) {
					psmt2 = conn.prepareStatement(sql2);
					psmt2.setInt(1, clid);
					psmt2.setString(2, id);
					n = psmt2.executeUpdate();
					classRefresh();
				} else {
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

	// 클래스 인원 새로고침
	public void classRefresh() {
		PreparedStatement psmt1;
		PreparedStatement psmt2;
		PreparedStatement psmt3;
		ResultSet rs1;
		ResultSet rs2;

		String sql1 = "select clid from class";
		String sql2 = "select count(*) from member where clid = ?";
		String sql3 = "update class set clstudent = ? where clid = ?";

		try {
			conn = dataSource.getConnection();
			psmt1 = conn.prepareStatement(sql1);
			rs1 = psmt1.executeQuery();

			while (rs1.next()) {
				int clid = rs1.getInt("clid");
				psmt2 = conn.prepareStatement(sql2);
				psmt2.setInt(1, clid);
				rs2 = psmt2.executeQuery();

				while (rs2.next()) {
					int cnt = rs2.getInt("count(*)");
					psmt3 = conn.prepareStatement(sql3);
					psmt3.setInt(1, cnt);
					psmt3.setInt(2, clid);
					psmt3.executeUpdate();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 클래스 등록
	public int classInsert(ClassVO vo) {
		int n = 0;
		String sql = "insert into class (clid, clname, clteacher, cldate, clplace, clmax, clstudent) "
				+ " values (CL_SEQ.nextval, ?, ?, ?, ?, ?, ?)";

		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getClName());
			psmt.setString(2, vo.getClTeacher());
			psmt.setDate(3, vo.getClDate());
			psmt.setString(4, vo.getClPlace());
			psmt.setInt(5, vo.getClMax());
			psmt.setInt(6, vo.getClStudent());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return n;
	}

	// 클래스 수정
	public int classUpdate(ClassVO vo) {
		int n = 0;
		String sql = "update class set clname = ?, clteacher = ?, clplace = ?, clmax = ? where clid = ?";

		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getClName());
			psmt.setString(2, vo.getClTeacher());
			psmt.setString(3, vo.getClPlace());
			psmt.setInt(4, vo.getClMax());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return n;
	}

	// 클래스 삭제
	public int classDelete(ClassVO vo) {
		int n = 0;
		String sql = "delete from class where clid = ?";

		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getClId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return n;
	}

	// 연결 해제
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
