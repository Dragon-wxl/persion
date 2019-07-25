package com.csuft.wxl.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 通过request.getParameter 根据name取出对应的账号和密码
		// 单值获取
//		request.setCharacterEncoding("UTF-8");
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//		System.out.println("name:" + name);
//		System.out.println("password:" + password);
//
//		String html = null;
//		response.setCharacterEncoding("UTF-8");
//		if ("root".equals(name) && "123".equals(password))
//			request.getRequestDispatcher("succeed.html").forward(request, response);
//		else
//			response.sendRedirect("fail.html");
		// 输出html
//		PrintWriter pw = response.getWriter();
//		pw.println(html);

		// 多选框获取
//		String[] hobits = request.getParameterValues("game");
//		System.out.println(hobits);
//		try {
//			System.out.println(Arrays.asList(hobits));
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//			System.out.println("null");
//		}
//		Map<String, String[]> parameters = request.getParameterMap();
//		Set<String> paramNames = parameters.keySet();
//		for (String param : paramNames) {
//			String[] value = parameters.get(param);
//			try {
//				System.out.println(param + ":" + Arrays.asList(value));
//			} catch (NullPointerException e) {
//				// TODO: handle exception
//				System.out.println("null");
//			}
//
//		}
//		String[] value = parameters.get("name");
//		int i = 1;
//		for (String string : value) {
//			System.out.println(i);
//			i++;
//			System.out.println("[" + string + "]");
//			if (string.equals("")) {
//				System.out.println("null");
//			}
//		}
		//获取头文件
//		Enumeration<String> headerNames = request.getHeaderNames();
//		while (headerNames.hasMoreElements()) {
//			String header = headerNames.nextElement();
//			String value1 = request.getHeader(header);
//			System.out.printf("%s\t%s%n", header, value1);
//		}
//		try
//
//		{
//			response.getWriter().println("<h1>Hello Servlet!</h1>");
//			response.getWriter().println(new Date().toLocaleString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if (name.equals("root")&&password.equals("1234")) {
			request.getSession().setAttribute("account", name);
			  response.sendRedirect("index.html");
		}else {
			response.sendRedirect("fail.html");
		}
		
	}
}
