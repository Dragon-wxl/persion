package com.csuft.wxl.servlet;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csuft.wxl.pojo.Persion;

import net.sf.json.JSONObject;


public class JsonSubmitServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			String data=request.getParameter("data");
			System.out.println("服务端接收到的数据："+data);
			JSONObject json=JSONObject.fromObject(data);
			System.out.println("转换为JSON对象："+json);
			Persion persion=(Persion)JSONObject.toBean(json,Persion.class);
			System.out.println("转换成persion对象："+persion);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
