package joonu.spring.web.impl;

import java.util.List;

import joonu.spring.web.board.impl.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import joonu.spring.web.board.BoardService;
import joonu.spring.web.board.BoardVO;

//@Service("boardService")
public class BoardServiceImpl implements BoardService{

//	@Autowired
	private BoardDAO boardDAO;
//	private LogAdvice log;
//	private Log4jAdvice log;
//	
//	public BoardServiceImpl() {
//		log = new Log4jAdvice();
//	}
	
	
	public void insertBoard(BoardVO vo) {
//		log.printLogging();
//		if(vo.getSeq() == 0) {// 임의로 예외적용
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoard(vo);
	}

	
	public void updateBoard(BoardVO vo) {
//		log.printLogging();
		boardDAO.updateBoard(vo);
	}

	
	public void deleteBoard(BoardVO vo) {
//		log.printLogging();
		boardDAO.deleteBoard(vo);
	}

	
	public BoardVO getBoard(BoardVO vo) {
//		log.printLogging();
		return boardDAO.getBoard(vo);
	}

	
	public List<BoardVO> getBoardList(BoardVO vo) {
//		log.printLogging();
		return boardDAO.getBoardList(vo);
	}
	
	
	
}
