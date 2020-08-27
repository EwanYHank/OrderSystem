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
    <title>Title</title>
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
<%--    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>--%>
    <script>
        const vm = new Vue({
            el: '#app',
            data: {orders : ${orderList}}
        })
    </script>
</head>
<body>
<div>
    <p>Welcome <strong>${user.xm}</strong></p>
    <a href="http://localhost:8080/homework/demo/goToChangePassword?bh=${user.bh}">修改密码</a>
    <a href="http://localhost:8080/homework/demo/showAllUsers">显示所有用户</a>
    <br>
</div>
<hr>
<div>
    <table border="1" id="app">

<%--        <c:if test="${empty orderList}">--%>
<%--            <tr><td align="center">0 record!</td></tr>--%>
<%--        </c:if>--%>
<%--        <c:if test="${not empty orderList}">--%>
            <tr>
                <td>编号</td>
                <td>商品名称</td>
                <td>金额</td>
                <td>数量</td>
                <td>创建时间</td>
                <td>时间</td>
            </tr>
            <br>
            <tr v-for="item in orders">
                <td>{{ item.bh }}</td>
                <td>{{ item.spmc }}</td>
                <td>{{ item.je }}</td>
                <td>{{ item.sl }}</td>
                <td>{{ item.cjsj }}</td>
                <td>{{ item.xgsj }}</td>
            </tr>
<%--            <c:forEach items="${orderList}" var="item">--%>
<%--                <tr>--%>
<%--                    <td>${item.bh}</td>--%>
<%--                    <td>${item.spmc}</td>--%>
<%--                    <td>${item.je}</td>--%>
<%--                    <td>${item.sl}</td>--%>
<%--                    <td>${item.cjsj}</td>--%>
<%--                    <td>${item.xgsj}</td>--%>
<%--                    <td>--%>
<%--                    <a href="http://localhost:8080/homework/orders/deleteOrderByBh?user_bh=${user.bh}&order_bh=${item.bh}">删除订单</a>--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--                <br>--%>
<%--            </c:forEach>--%>
<%--        </c:if>--%>
    </table>
</div>
<script src="https://unpkg.com/vue"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    // const url = ""
    // const vm = new Vue({
    //     el: '#app',
    //     data: {
    //         result: {}
    //     },
    //     mounted() {
    //         axios.get(url).then(response => {
    //             this.result = response.data
    //         })
    //     }
    //
    // })
</script>
</body>
</html>
