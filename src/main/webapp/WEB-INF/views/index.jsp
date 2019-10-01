<%--
  Created by IntelliJ IDEA.
  User: tuphong
  Date: 10/1/19
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <h1>Calculator</h1>
  <body>
  <form id="calculator" method="post" action="calculate">
    <input type="text" placeholder="0" name="firstOperand" value="${firstOperand}"><br>
    <input type="text" placeholder="0" name="secondOperand" value="${secondOperand}"><br>
      <select name="operator">
        <option name="addition" value="+">Addition</option>
        <option name="subtraction" value="-">Subtraction</option>
        <option name="multiplication" value="*">Multiplication</option>
        <option name="division" value="/">Division</option>
      </select>
    <input type="submit" value="Calculator">
    <br>
    <span>Result ${operator}:${result}</span>
  </form>
  </body>
</html>
