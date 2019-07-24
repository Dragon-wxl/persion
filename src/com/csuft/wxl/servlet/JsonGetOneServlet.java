package com.csuft.wxl.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csuft.wxl.pojo.Persion;

import net.sf.json.JSONObject;


public class JsonGetOneServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		Persion persion=new Persion(10, "旺财", "1887-5-8", 1, "财务部");
		JSONObject json=new JSONObject();
		json.put("persion", JSONObject.fromObject(persion));
		response.setContentType("text/html;charset=utf-8");
		try {
			response.getWriter().print(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
