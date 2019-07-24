package com.csuft.wxl.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
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
}
