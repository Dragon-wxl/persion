package com.csuft.wxl.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.Session;
import com.csuft.wxl.pojo.Persion;

public class PersionListServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			StringBuffer sb = new StringBuffer();
			sb.append("<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n"
					+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n"
					+ "<title>Insert title here</title>\r\n" + "</head>\r\n" + "<body>");
			sb.append("<h1>Hello Servlet!</h1>");
			sb.append(new Date().toLocaleString());
			PersionListServlet persionList = new PersionListServlet();
			StringBuffer stringBuffer = persionList.get();
			sb.append(stringBuffer.toString());
			sb.append("</body>\r\n" + "</html>");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().print(sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public StringBuffer get() {
		//使用xml的 方式查询
		SqlSession se = Session.getSession();
		List<Persion> persions = se.selectList("Ifname");
		StringBuffer sb = new StringBuffer();
		sb.append(
				"<table  border=\"1\" style=\"width: 50%;margin:auto ;border: 2px solid black; border-collapse:collapse\" >");
		for (Persion persion : persions) {
			sb.append("<tr>\r\n" + "			<td>" + persion.getId() + "</td>\r\n" + "			<td>"
					+ persion.getName() + "</td>\r\n" + "			<td>" + persion.getBirthday() + "</td>\r\n"
					+ "			<td name=\"sex\">" + persion.getSex() + "</td>\r\n" + "			<td>"
					+ persion.getDepartment() + "</td><td><a href=\"/persion/deletePersion?id="+persion.getId()+"\" name=\""+persion.getId()+"\">删除</a></td>"
							+ "<td><a href=\"/persion/editPersion?id="+persion.getId()+"\" name=\"\"+persion.getId()+\"\">编辑</a></td>\r\n" + "		</tr>");
		}
		sb.append("</table>" + "<script src=\"bootstrap-4.3.1\\jquery.min.js\"></script>\r\n" + "<script>\r\n"
				+ "var i=	$(\"td[name='sex']\").text();\r\n" + "j=1;\r\n" + "for(j=0;j<i.length;j++){\r\n"
				+ "	if(i[j]==1){\r\n" + "	document.getElementsByName(\"sex\")[j].innerHTML=\"男\"\r\n"
				+ "}else if(i[j]==2){\r\n" + "	document.getElementsByName(\"sex\")[j].innerHTML=\"女\"\r\n" + "}\r\n"
				+ "}\r\n" + "</script>");
		return sb;
	}

	public static void main(String[] args) {
		PersionListServlet persionList = new PersionListServlet();
		StringBuffer stringBuffer = persionList.get();
		System.out.println(stringBuffer.toString());
	}
}
