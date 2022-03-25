package joonu.spring.web.board;

import joonu.spring.web.board.impl.BoardDAO;
import joonu.spring.web.controller.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateBoardController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
        // 1. 사용자 입력 정보 추출
        // request.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String seq = request.getParameter("seq");
        // 2. 데이터베이스 연동 처리
        BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setContent(content);
        vo.setSeq(Integer.parseInt(seq));
        BoardDAO boardDAO = new BoardDAO();
        boardDAO.updateBoard(vo);
// 3. 화면 네비게이션
        return "getBoardList.do";
    }
}
