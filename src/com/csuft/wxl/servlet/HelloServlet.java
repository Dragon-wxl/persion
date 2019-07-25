package com.csuft.wxl.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		String userName = (String) request.getSession().getAttribute("account");
		response.setContentType("text/html;charset=UTF-8");
		if (null == userName) {
			String state = "您未登录，请登录";
			response.sendRedirect("login.html");
			return ;
		}else {
			String state = "您已经登录:"+userName;
			request.getSession().setAttribute("account", null);
			response.getWriter().print(state);
		}
	}
}
