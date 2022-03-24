<%--
  Created by IntelliJ IDEA.
  User: junu
  Date: 2022/03/24
  Time: 6:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="joonu.spring.web.board.impl.BoardDAO"%>
<%@ page import="joonu.spring.web.board.BoardVO"%>
<%
    // 1. 사용자 입력 정보 추출 request.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String writer = request.getParameter("writer"); String content = request.getParameter("content");
    // 2. 데이터베이스 연동 처리
    BoardVO vo = new BoardVO();
    vo.setTitle(title);
    vo.setWriter(writer);
    vo.setContent(content);

    BoardDAO boardDAO = new BoardDAO();
    boardDAO.insertBoard(vo);
    // 3. 화면 네비게이션 response.sendRedirect("getBoardList.jsp");

%>
