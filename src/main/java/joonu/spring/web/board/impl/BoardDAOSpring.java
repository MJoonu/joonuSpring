package joonu.spring.web.board.impl;

import joonu.spring.web.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOSpring {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String BOARD_INSERT = "insert into myboard(seq, title, writer, content)"
            + "values((select nvl(max(seq), 0) + 1 from myboard), ?, ?, ?)";
//    private final String BOARD_INSERT =
//        "insert into myboard(seq, title, writer, content) values(?, ?, ?, ?)"; // 1000번 글 등록 실험
    private final String BOARD_UPDATE = "update myboard set title=?,"
            + "content=? where seq=?";
    private final String BOARD_DELETE = "delete myboard where seq=?";
    private final String BOARD_GET = "select * from myboard where seq=?";
    private final String BOARD_LIST = "select * from myboard order by seq desc";

    public void insertBoard(BoardVO vo){
        System.out.println("spring JDBC 로 insertBoard() 기능 처리");
        jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
//        jdbcTemplate.update(BOARD_INSERT, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent()); // 1000번글 등록 실험
    }
    public void updateBoard(BoardVO vo){
        System.out.println("spring JDBC 로 updateBoard() 기능 처리");
        jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
    }
    public void deleteBoard(BoardVO vo){
        System.out.println("spring JDBC 로 deleteBoard() 기능 처리");
        jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
    }
    public BoardVO getBoard(BoardVO vo){
        System.out.println("spring JDBC 로 getBoard() 기능 처리");
        Object[] args = {vo.getSeq()};
        return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
    }
    public List<BoardVO> getBoardList(BoardVO vo){
        System.out.println("spring JDBC 로 getBoardlist() 기능 처리");
        return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
    }

}
