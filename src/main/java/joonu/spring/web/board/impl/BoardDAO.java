package joonu.spring.web.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import joonu.spring.web.board.BoardVO;
import joonu.spring.web.common.JDBCUtil;

//@Repository("boardDAO")
public class BoardDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private final String BOARD_INSERT = "insert into myboard(seq, title, writer, content)"
			+ "values((select nvl(max(seq), 0) + 1 from myboard), ?, ?, ?)";
	private final String BOARD_UPDATE = "update myboard set title=?,"
			+ "content=? where seq=?";
	private final String BOARD_DELETE = "delete myboard where seq=?";
	private final String BOARD_GET = "select * from myboard where seq=?";
	private final String BOARD_LIST = "select * from myboard order by seq desc";
	
	public void insertBoard(BoardVO vo) {
		System.out.println("JDBC 로 insertBoard() 기능 처리");
		
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, con);
		}
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("JDBC로 updateBoard() 기능 처리");
		
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getSeq());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, con);
		}
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("JDBC 로 deleteBoard() 기능 처리");
		
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, vo.getSeq());
			pstmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, con);
		}
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("JDBC 로 getBoard() 기능 처리");
		
		BoardVO board = null;
		
		try {
			con = JDBCUtil.getConnection();
			System.out.println("연결성공");
			pstmt = con.prepareStatement(BOARD_GET);
			pstmt.setInt(1, vo.getSeq());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, con);
		}
		return board;
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("JDBC로 getBoardList() 기능처리");
		List<BoardVO> boardList = new ArrayList<BoardVO>();
		
		try {
			con = JDBCUtil.getConnection();
			pstmt = con.prepareStatement(BOARD_LIST);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				
				boardList.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, con);
		}
		
		return boardList;
	}
}





























