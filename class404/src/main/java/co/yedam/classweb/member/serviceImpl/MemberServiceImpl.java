package co.yedam.classweb.member.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.classweb.common.DataSource;
import co.yedam.classweb.member.service.MemberService;
import co.yedam.classweb.member.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	// 회원 목록 조회
	public List<MemberVO> memberSelectList() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql = "select * from member";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setHobby(rs.getString("hobby"));
				vo.setAuthor(rs.getString("author"));
				vo.setState(rs.getString("state"));
				vo.setClId(rs.getInt("clid"));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}

	// 회원 한명 조회
	public MemberVO memberSelect(MemberVO vo) {
		String sql = "select * from member where id = ?";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setHobby(rs.getString("hobby"));
				vo.setAuthor(rs.getString("author"));
				vo.setState(rs.getString("state"));
				vo.setClId(rs.getInt("clid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	// 로그인
	public MemberVO memberLogin(MemberVO vo) {
		
		String sql = "select name, author from member where id = ? and password = ? and state = 'Y'";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			rs = psmt.executeQuery();
			if (rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setAuthor(rs.getString("author"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	// 회원가입
	public int memberInsert(MemberVO vo) {
		String sql = "INSERT into member(id,password,name,age,hobby)"
				+ " VALUES(?,?,?,?,?) ";
		int n = 0;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getHobby());
	//		psmt.setString(6, vo.getAuthor());
	//		psmt.setString(7, vo.getState());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	// 회원 삭제
	public int memberDelete(MemberVO vo) {
		
		String sql = "delete from member where id = ?";
		int n = 0;
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return n;
	}

	// 회원 정보 수정
	public int memberUpdate(MemberVO vo) {
		// TODO 마이페이지 수정
		String sql = "update member set password = ? , age = ? , name= ? where id = ?";
		int n = 0;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getPassword());
			psmt.setInt(2, vo.getAge());
			psmt.setString(3, vo.getName());
			psmt.setString(4, vo.getId());
			n = psmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return n;
		
	}

	// 커넥션 종료
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
