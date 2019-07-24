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

public class PersionAddServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			String sex = request.getParameter("sex");
			String department = request.getParameter("department");
			System.out.println(name);
			System.out.println(birthday);
			System.out.println(sex);
			System.out.println(department);
			Persion persion = new Persion();
			persion.setName(name);
			persion.setBirthday(birthday);
			persion.setSex(Integer.valueOf(sex));
			persion.setDepartment(department);
			SqlSession se=Session.getSession();
			int a=se.insert("insertOnePersion",persion);
			se.commit();
			se.close();
			response.setCharacterEncoding("UTF-8");
			try {response.setCharacterEncoding("UTF-8");
			request.getRequestDispatcher("persionList").forward(request, response);
			} catch (IOException | ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
	}
}
