<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*,com.csuft.wxl.pojo.*"%>
<%@ page import="com.csuft.wxl.pojo.*"%>
<!-- jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- boostrap4 -->
<link rel="stylesheet" type="text/css"
	href="bootstrap-4.3.1/css/bootstrap.min.css">
<script src="bootstrap-4.3.1/jquery-3.3.1.slim.min.js"></script>
<script src="bootstrap-4.3.1/popper.min.js"></script>
<script src="bootstrap-4.3.1/js/bootstrap.min.js"></script>
<body>
	<div class="container">
		<table class="table table-hover table-bordered">
			<thead>
				<tr>
					<th>id</th>
					<th>name</th>
					<th>birthday</th>
					<th>sex</th>
					<th>department</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="persion" varStatus="">
					<tr>
						<td>${persion.id}</td>
						<td>${persion.name}</td>
						<td>${persion.birthday}</td>
						<td name="sex">${persion.sex}</td>
						<td>${persion.department}</td>
						<td><a href="/persion/deletePersionJsp?id=${persion.id }"
							name="${persion.id}">删除</a></td>
						<td><a href="/persion/editPersionJsp?id=${persion.id }"
							name="${persion.id}">编辑</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<tr>
				<!-- href="/persion/deletePersion?id=2" name="2" -->
				<td colspan="7" align="center"><a href="?start=0">首页</a>&nbsp;&nbsp;&nbsp;<a
					href="?start=${pre}">上一页</a>&nbsp;&nbsp;&nbsp;<a
					href="?start=${next}">下一页</a>&nbsp;&nbsp;&nbsp;总计：${count} </td>
			</tr>
		</table>
	</div>
	<script src="bootstrap-4.3.1\jquery.min.js"></script>
	<script>
		var i = $("td[name='sex']").text();
		j = 1;
		for (j = 0; j < i.length; j++) {
			if (i[j] == 1) {
				document.getElementsByName("sex")[j].innerHTML = "男"
			} else if (i[j] == 2) {
				document.getElementsByName("sex")[j].innerHTML = "女"
			}
		}
	</script>

</body>
</html>