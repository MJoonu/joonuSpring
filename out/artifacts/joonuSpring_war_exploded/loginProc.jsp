<%--
  Created by IntelliJ IDEA.
  User: junu
  Date: 2022/03/24
  Time: 5:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page import="joonu.spring.web.user.impl.UserDAO" %>
<%@ page import="joonu.spring.web.user.UserVO" %>

<%
    //1 사용자 입력 정보 추출
    String id = request.getParameter("id");
    String password = request.getParameter("password");

    //2 데이터베이스 연동 처리
    UserVO vo = new UserVO();
    vo.setId(id);
    vo.setPassword(password);

    UserDAO userDAO = new UserDAO();
    UserVO user = userDAO.getUser(vo);

    //3. 화면 네비게이션
    if (user != null) {
        response.sendRedirect("getBoardList.jsp");
    }else{
        response.sendRedirect("login.jsp");
    }
%>