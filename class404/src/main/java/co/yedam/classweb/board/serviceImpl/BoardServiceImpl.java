package co.yedam.classweb.board.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.yedam.classweb.board.service.BoardService;
import co.yedam.classweb.board.vo.BoardVO;
import co.yedam.classweb.classes.vo.ClassVO;
import co.yedam.classweb.common.DataSource;

public class BoardServiceImpl implements BoardService {
	
	private DataSource dataSource = DataSource.getInstance();
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	@Override
	public List<BoardVO> boardSelectList() {
		List<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO vo;
		String sql = "select * from board";
		
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new BoardVO();
				vo.setbId(rs.getInt("bid"));
				vo.setbTitle(rs.getString("btitle"));
				vo.setbContent(rs.getString("bcontent"));
				vo.setbWriter(rs.getString("bwriter"));
				vo.setbDate(rs.getDate("bdate"));
				vo.setbHit(rs.getInt("bhit"));
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
	public BoardVO boardSelect(BoardVO vo) {
		// TODO 한행조회
		String sql = "select * from board where bid = ? ";
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getbId());
			rs = psmt.executeQuery();
			if (rs.next()) { // 한 행만 가지고 올꺼라서 while 안써도됨
				vo = new BoardVO();
				vo.setbId(rs.getInt("bid"));
				vo.setbTitle(rs.getNString("btitle"));
				vo.setbContent(rs.getString("bcontent"));
				vo.setbWriter(rs.getNString("bwriter"));
				vo.setbDate(rs.getDate("bdate"));
				vo.setbHit(rs.getInt("bhit"));

				hitUpdate(vo.getbId()); // 조회수 증가 메소드
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return vo;
	}
	
	private void hitUpdate(int id) {
		// TODO 조회수 증가 (읽고나면 조회수가 증가해있을꺼임)
		String sql = "update board set bhit = bhit + 1 where bid = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO 글 추가
				String sql = "insert into board(bid, btitle, bcontent, bwriter,bdate) " 
							 + "values (B_SEQ.nextval,?, ?, ?, ?)";
				int n = 0;
				try {
					conn = dataSource.getConnection();
					psmt = conn.prepareStatement(sql);
					psmt.setString(1, vo.getbTitle());
					psmt.setString(2, vo.getbContent());
					psmt.setString(3, vo.getbWriter());
					psmt.setDate(4, vo.getbDate());
					n = psmt.executeUpdate();

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close();
				}

				return n;
	}

	@Override
	public int boardUpdate(BoardVO vo) {
		String sql = "update board set btitle = ? , bcontent = ? where bid = ?";
		int n = 0;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getbTitle());
			psmt.setString(2, vo.getbContent());
			psmt.setInt(3, vo.getbId());
			n = psmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return n;
	}

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO 한 행 삭제하기
				String sql = "delete from board where bid = ?";
				int n = 0;
				try {
					conn = dataSource.getConnection();
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, vo.getbId());
					n = psmt.executeUpdate();

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close();
				}
				return n;
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
