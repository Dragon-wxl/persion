package com.csuft.wxl.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.Session;
import com.csuft.wxl.pojo.Persion;

public class PersionEditServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		StringBuffer sb = new StringBuffer();
		// h5到body
		sb.append("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n" + "<!-- boostrap4 -->\r\n"
				+ "<link rel=\"stylesheet\" type=\"text/css\"\r\n"
				+ "	href=\"bootstrap-4.3.1/css/bootstrap.min.css\">\r\n"
				+ "<script src=\"bootstrap-4.3.1/jquery-3.3.1.slim.min.js\"></script>\r\n"
				+ "<script src=\"bootstrap-4.3.1/popper.min.js\"></script>\r\n"
				+ "<script src=\"bootstrap-4.3.1/js/bootstrap.min.js\"></script>\r\n" + "</head>\r\n" + "<body>");
		SqlSession se = Session.getSession();
		String id = request.getParameter("id");
		Persion persion = (Persion) se.selectOne("selectOne", id);
		String sex = null;
		if (persion.getSex() == 1) {
			sex = "男";
		} else if (persion.getSex() == 2) {
			sex = "女";
		}
		sb.append("<div class=\"container\">\r\n" + "		<br> <br> <br>\r\n"
				+ "		<form onSubmit=\"return verify();\" action=\"updatePersion\"\r\n"
				+ "			class=\"form-group\" method=\"post\">\r\n" + "			<table>\r\n"
				+ "				<tr>\r\n"
				+ "					<td><label for=\"name\" class=\"col-sm-2 col-form-label\"\r\n"
				+ "						style=\"text-align: end\">name:</label></td>\r\n"
				+ "					<td><input type=\"text\" value=\"" + persion.getName() + "\" readonly\r\n"
				+ "						class=\"form-control\" name=\"name\" value=\"\"></td>\r\n"
				+ "					<td>&nbsp;修改为：</td>\r\n"
				+ "					<td><input type=\"text\" class=\"form-control\" name=\"alter_name\"></td>\r\n"
				+ "				</tr>\r\n" + "				<tr>\r\n"
				+ "					<td><label for=\"birthday\" class=\"col-sm-2 col-form-label\"\r\n"
				+ "						style=\"text-align: end\">birthday:</label></td>\r\n"
				+ "					<td><input type=\"text\" value=\"" + persion.getBirthday() + "\" readonly\r\n"
				+ "						class=\"form-control\" name=\"birthday\"></td>\r\n"
				+ "					<td>&nbsp;修改为：</td>\r\n"
				+ "					<td><input type=\"date\" class=\"form-control\" \r\n"
				+ "						name=\"alter_birthday\"></td>\r\n" + "\r\n" + "				</tr>\r\n"
				+ "				<tr>\r\n"
				+ "					<td><label for=\"sex\" class=\"col-sm-2 col-form-label\"\r\n"
				+ "						style=\"text-align: end\">sex:</label></td>\r\n"
				+ "					<td><input type=\"text\" class=\"form-control\" value=\"" + sex + "\" readonly\r\n"
				+ "						name=\"sex\"></td>\r\n"
				+ "					<td>&nbsp;修改为：</td>\r\n"
				+ "					<td><select class=\"form-control\" name=\"alter_sex\">\r\n"
				+ "							<option value=\"1\">男</option>\r\n"
				+ "							<option value=\"2\">女</option>\r\n" + "					</select></td>\r\n"
				+ "				</tr>\r\n" + "				<tr>\r\n"
				+ "					<td><label for=\"department\" class=\"col-sm-2 col-form-label\"\r\n"
				+ "						style=\"text-align: end\">department:</label></td>\r\n"
				+ "					<td><input type=\"text\" class=\"form-control\" value=\"" + persion.getDepartment()
				+ "\" readonly\r\n" + "						name=\"department\"></td>\r\n"
				+ "					<td>&nbsp;修改为：</td>\r\n"
				+ "					<td><select class=\"form-control\" name=\"alter_department\">\r\n"
				+ "							<option value=\"人事行政部\">人事行政部</option>\r\n"
				+ "							<option value=\"市场部\">市场部</option>\r\n"
				+ "							<option value=\"总经理\">总经理</option>\r\n"
				+ "							<option value=\"技术一部\">技术一部</option>\r\n"
				+ "							<option value=\"技术三部\">技术三部</option>\r\n"
				+ "							<option value=\"技术二部\">技术二部</option>\r\n"
				+ "							<option value=\"技术部\">技术部</option>\r\n"
				+ "							<option value=\"财务部\">财务部</option>\r\n"
				+ "					</select></td>\r\n" + "				</tr>\r\n" + "				<tr>\r\n"
				+ "					<td><input type=\"text\" style=\"display:none\" name=\"id\" value=\""
				+ persion.getId() + "\"/></td>\r\n" + "					<td></td>\r\n"
				+ "					<td></td>\r\n"
				+ "					<td><label class=\"col-sm-2 col-form-label\"\r\n"
				+ "						style=\"text-align: end\"></label> <input type=\"submit\" value=\"更新\"\r\n"
				+ "						class=\"btn btn-primary col-sm-4\"></td>\r\n" + "				</tr>\r\n"
				+ "			</table>\r\n" + "		</form>\r\n" + "	</div>\r\n"
				+ "	<script src=\"bootstrap-4.3.1/jquery.min.js\"></script>\r\n"
				+ "		<script type=\"text/javascript\">\r\n" + "		function verify() {\r\n"
				+ "        var name = $(\"*[name='alter_name']\").val();\r\n"
				+ "        var sex = $(\"*[name='alter_sex']\").val();\r\n"
				+ "        var birthday = $(\"*[name='alter_birthday']\").val();\r\n"
				+ "		var department = $(\"*[name='alter_department']\").val();\r\n"
				+ "        if (name==null||name==\"\") {\r\n" + "            alert('请输入name');\r\n"
				+ "            return false;\r\n" + "        }\r\n" + "        if(birthday==''|| name==null){\r\n"
				+ "            alert('请补birthday');\r\n" + "            return false;\r\n" + "        }\r\n"
				+ "		}\r\n" + "		</script>\r\n" + "\r\n" + "</body>\r\n" + "</html>");
		response.setCharacterEncoding("UTF-8");
		try {
			response.getWriter().print(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}
}
