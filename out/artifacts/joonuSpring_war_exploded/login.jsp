<%--
  Created by IntelliJ IDEA.
  User: junu
  Date: 2022/03/24
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>로그인</h1>
<hr>
<%--<form action="loginProc.jsp" method="post">--%>
<form action="login.do" method="post">
  <table border="1">
    <tr>
      <td>아이디</td>
      <td><input type="text" name="id" /></td>
    </tr>
    <tr>
      <td>비밀번호</td>
      <td><input type="password" name="password" /></td>
    </tr>
    <tr><td colspan="2"><input type="submit" value="로그인" /></td></tr>
  </table>
</form>
</body>
</html>
