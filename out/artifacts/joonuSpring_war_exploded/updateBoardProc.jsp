<%--
  Created by IntelliJ IDEA.
  User: junu
  Date: 2022/03/24
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="joonu.spring.web.board.impl.BoardDAO"%>
<%@ page import="joonu.spring.web.board.BoardVO" %>
<%
        // 1. 사용자 입력 정보 추출 request.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        String content = request.getParameter("content"); String seq = request.getParameter("seq");
        // 2. 데이터베이스 연동 처리
        BoardVO vo = new BoardVO();
        vo.setTitle(title);
        vo.setContent(content);
        vo.setSeq(Integer.parseInt(seq));
        BoardDAO boardDAO = new BoardDAO();
        boardDAO.updateBoard(vo);
        // 3. 화면 네비게이션
        response.sendRedirect("getBoardList.jsp");

%>