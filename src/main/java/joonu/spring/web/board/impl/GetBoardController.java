package joonu.spring.web.board.impl;

import joonu.spring.web.board.BoardVO;
import joonu.spring.web.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetBoardController implements Controller {

    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("글 상세보기 처리");

        //1. 검색할 게시클 번호 추출
        String seq = request.getParameter("seq");

        //2. 데이터베이스 연동 처리
        BoardVO vo = new BoardVO();
        vo.setSeq(Integer.parseInt(seq));
        BoardDAO boardDAO = new BoardDAO();
        BoardVO board = boardDAO.getBoard(vo);

        // 3. 응답 화면 구현
        HttpSession session = request.getSession();
        session.setAttribute("board", board);
        return "getBoard";
    }
}
