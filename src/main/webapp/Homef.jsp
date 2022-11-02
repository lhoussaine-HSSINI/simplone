<%@ page import="MVC.Dao_op.adminDao" %>
<%@ page import="MVC.Model.ApprenanteEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: fahof
  Date: 11/2/2022
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>
<form action="add_class" method="post">
    <label> select one classroom </label>
    <select class="custom-select" name="class">
        <option value="java 1">java 1</option>
        <option value="java 2">java 2</option>
    </select>

    <label> select one apprenant </label>
    <label>
        <select class="custom-select" name="id_apprenante">
            <%
                adminDao admin_operation_a = new adminDao();
                List<ApprenanteEntity> list_apprenante = admin_operation_a.getAllapprenanate();
                for(ApprenanteEntity a : list_apprenante) {
            %>
            <option value="<%=a.getIdApprenante()%>"><%=a.getNom()%></option>
            <%}%>
        </select>
    </label>

    <input type="submit" value="add">
</form>
</body>
</html>
