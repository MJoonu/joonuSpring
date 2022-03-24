<%--
  Created by IntelliJ IDEA.
  User: junu
  Date: 2022/03/24
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="joonu.spring.web.board.impl.BoardDAO" %>
<%@ page import="joonu.spring.web.board.BoardVO" %>
<%@ page import="java.util.List" %>
<%
    //1. 사용자 입력 정보 추출 : 검색 기능은 추후 구현

    //2. 데이터베이스 연동 처리
    BoardVO vo = new BoardVO();
    BoardDAO boardDAO = new BoardDAO();
    List<BoardVO> boardList = boardDAO.getBoardList(vo);

    //3. 응답 화면 구성
%>
<html>
<head>
    <title>Board List</title>
</head>
<body>
<h1>글 목록</h1>
<h3>테스트 회원님 환영합니다.<a href="logoutProc.jsp">Log-Out</a></h3> <!-- 검색 시작 -->
<form action="getBoardList.jsp" method="post">
    <table border="1">
        <tr>
            <td>
                <select name="searchCondition">
                    <option value="TITLE">제목</option>
                    <option value="CONTENT">내용</option> </select>
                <input type="text" name="searchKeyword" /> <input type="submit" value="검색" />
            </td>
        </tr>
    </table>
</form><br/>
<!-- 검색 종료 -->
<table border="1">
    <tr>
        <th>번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>등록일</th>
        <th>조회수</th>
    </tr>
        <% for(BoardVO board: boardList){ %>
    <tr>
        <td>
            <%=board.getSeq() %>
        </td>
        <td>
            <a href="getBoard.jsp?seq=<%=board.getSeq() %>"><%=board.getTitle() %></a>
        </td>
        <td>
            <%=board.getWriter() %>
        </td>
        <td>
            <%=board.getRegDate() %>
        </td>
        <td>
            <%=board.getCnt() %>
        </td>
    </tr>
    <% } %>
</table><br>
<a href="insertBoard.jsp">새글 작성</a>
</body>
</html>
