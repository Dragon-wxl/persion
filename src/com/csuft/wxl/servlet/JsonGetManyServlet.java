package com.csuft.wxl.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.Session;
import com.csuft.wxl.pojo.Persion;

import net.sf.json.JSONSerializer;


public class JsonGetManyServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		SqlSession se=Session.getSession();
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("start", 0);
		map.put("length", 25);
		List<Persion> list=se.selectList("selectLimitPersion",map);
		String json=JSONSerializer.toJSON(list).toString();
		response.setContentType("text/html;charset=utf-8");
		try {
			response.getWriter().print(json);
			se.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SqlSession se=Session.getSession();
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("start", 0);
		map.put("length", 25);
		List<Persion> list=se.selectList("selectLimitPersion",map);
		for (Persion persion : list) {
			System.out.println(persion);
		}
	}
}
