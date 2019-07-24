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

public class PersionUpdateServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		Persion persion = new Persion();
		try {
			request.setCharacterEncoding("UTF-8");
			persion.setId(Integer.valueOf(request.getParameter("id")));
			persion.setName(request.getParameter("alter_name"));
			persion.setBirthday(request.getParameter("alter_birthday"));
			persion.setSex(Integer.valueOf(request.getParameter("alter_sex")));
			persion.setDepartment(request.getParameter("alter_department"));
			System.out.println(persion);
			SqlSession se = Session.getSession();
			int a = se.update("updateOnePersionWhileId", persion);
			System.out.println("受影响行数：" + a);
			if (a != 0) {
				se.commit();
				try {
					response.setCharacterEncoding("UTF-8");
					se.close();
					request.getRequestDispatcher("persionList").forward(request, response);
				} catch (IOException | ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}
}
