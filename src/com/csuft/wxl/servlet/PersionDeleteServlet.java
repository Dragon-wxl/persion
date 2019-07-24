package com.csuft.wxl.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.Session;


public class PersionDeleteServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		//获取参数
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		SqlSession se=Session.getSession();
		try {
			int a=se.delete("deleteOnePersion",String.valueOf(id));
			if (!(a==0)) {
				se.commit();
				response.sendRedirect("persionList");
			}else {
				request.getRequestDispatcher("fail2.html").forward(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		int a=11;
		String seString=String.valueOf(a);
		System.out.println(seString);
	}
}
