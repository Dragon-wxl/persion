package com.csuft.wxl.servlet.jsp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.Session;
import com.csuft.wxl.pojo.Persion;

public class PersionListServletJsp extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) {
		int start=0;
		int length=15;
		int next=0;
		int pre=0;
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			try {
				start=Integer.valueOf(request.getParameter("start"));
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
			SqlSession se=Session.getSession();
			
			int count=se.selectOne("selectCount");
			
			
			if(start<=0) {
				start=0;
				pre=0;
				next=start+length;
			}else if(start>=count-count%length) {
				start=count-count%length;
				pre=start-length;
				next=start;
			}else {
				pre=start-length;
				next=start+length;
			}
			
				
			
			
			
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("start", start);
			map.put("length",length);
			List<Persion> list=se.selectList("selectLimitPersion", map);
		
			
			se.commit();
			se.close();
			request.setAttribute("list", list);
			request.setAttribute("next", next);
			request.setAttribute("pre", pre);
			request.setAttribute("count", count);
			
			//服务端跳转
			request.getRequestDispatcher("persionPageList.jsp").forward(request, response);
		} catch (ServletException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		int start=0;
//		int length=15;
//		Map<String, Integer> map=new HashMap<String, Integer>();
//		map.put("start", start);
//		map.put("length",length);
//		SqlSession se=Session.getSession();
//		List<Persion> list11=se.selectList("selectLimitPersion", map);
//		List<Object> list=se.selectList("selectCount");
//		int list1=se.selectOne("selectCount");
//		se.commit();
//		se.close();
//		System.out.println(list.get(0));
//		System.out.println(list1);
		
		int start=0;
		int length=15;
		int next=0;
		int pre=0;
			start=start<0?0:start;
			
			pre=pre>0?start-length:0;
			
			SqlSession se=Session.getSession();
			Map<String, Integer> map=new HashMap<String, Integer>();
			map.put("start", start);
			map.put("length",length);
			int count=se.selectOne("selectCount");
			List<Persion> list=se.selectList("selectLimitPersion", map);
			se.commit();
			
			next=next<count?start+length:count-length;
			se.commit();
			se.close();
		System.out.println(count);
		System.out.println(next);
	}
}
