<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hu
  Date: 2020/7/5
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表</title>
</head>
<body>
<div>
    <table border="1">
        <c:if test="${empty userList}">
            <tr><td align="center">0 record!</td></tr>
        </c:if>
        <c:if test="${not empty userList}">
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>身份证号码</td>
                <td>年龄</td>
                <td>创建时间</td>
                <td>时间</td>
            </tr>
            <br>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.bh}</td>
                    <td>${user.xm}</td>
                    <td>${user.sfzhm}</td>
                    <td>${user.nl}</td>
                    <td>${user.cjsj}</td>
                    <td>${user.xgsj}</td>
                    <td><a href="http://localhost:8080/homework/demo/deleteUserByBh?bh=${user.bh}">删除</a></td>
                    <td><a href="http://localhost:8080/homework/orders/selectOrderByUser?bh=${user.bh}">显示订单</a></td>
                </tr>
                <br>
            </c:forEach>
        </c:if>
    </table>
</div>
</body>
</html>
