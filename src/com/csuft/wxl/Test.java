package com.csuft.wxl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.pojo.Salary;

public class Test {
	public static void main(String[] args) {
		Persion persion = new Persion(3, "世界", "1990-1-1", 0, "开发部");
		SqlSession se = Session.getSession();
//		int a = 0;
//		try {
////			a = se.delete("deleteOnePersion", "2");
//			se.commit();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println(a);
//查询一个
//		Persion persion2 = se.selectOne("selectOne", "3");
//		persion2.setName("张三");
//		int a = se.update("updateOnePersion", persion2);
//		se.commit();
//		System.out.println(a + "影响");

//		查询
//		List<Persion> list = se.selectList("selectAll");
//		for (Persion persion3 : list) {
//			System.out.println(persion3);
//		}
//		
		//模糊查询
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "张");
		List<Persion> list2=se.selectList("selectVagueName", map);
		for (Persion persion4 : list2) {
			System.out.println("查询"+persion4.toString());
		}

		// 多条件查询
		// 使用Map进行输入
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("name", "张三");
//		params.put("department", "生产部");
//		List<Persion> persions5 = se.selectList("selectNameDepartment", params);
//		for (Persion persion6 : persions5) {
//			System.out.println(persion6);
//		}
		// 两表联合查询 一对多的查询一sqlary为主
//		List<Salary> cs = se.selectList("selectPersionWage");
//        for (Salary c : cs) {
//        	List<Persion> persions=c.getPersion();
//        	for (Persion pe : persions) {
//				System.out.println(c.getId()+" "+c.getDepartment()+" "+c.getWage()+" "+pe);
//			}
//        }
//        se.commit();
//        se.close();

		// 两表联合查询 一对多的查询一persion为主
//		List<Persion> cs = se.selectList("selectPersionWage2");
//        for (Persion c : cs) {
//        	System.out.println(c);
//        }
//        se.commit();
//        se.close();

		// 三表连接
//		List<Persion> persions=se.selectList("selectPersionWageLevel");
//		for (Persion persion2 : persions) {
//			System.out.println(persion2);
//		}

		// Mybatis 动态sql if标签 查询所有或模糊查询
		// 有sql标签的时候是有Map
		// 使用while
		// map里的value使用字符串
//		List<Persion> persions=se.selectList("selectIfname");
//		Map<String, Object> map=new HashMap<String, Object>();
//		map.put("name", "小张");
//		map.put("id", "2");
//		map.put("id", "1");
//		List<Persion> persions1=se.selectList("selectIfname",map);
//		for (Persion persion2 : persions) {
//			System.out.println(persion2);
//		}
//		for (Persion persion2 : persions1) {
//			System.out.println("条件查询："+persion2);
//		}

		// Map传入
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", "20");
//		map.put("birthday", "1995-1-1");
//		map.put("department", "技术三部");
//		map.put("name", "小郑");
//		int a = se.update("updateOnePersionWhileId", map);
//		System.out.println("受影响行数" + a);
//		se.commit();
		// 查看修改

		// foreach标签
//		List<String> list = new ArrayList<>();
//		list.add("11");
//		list.add("12");
//		list.add("13");
//		List<Persion> persions = se.selectList("selectForeach", list);
//		for (Persion persion2 : persions) {
//			System.out.println(persion2);
//		}

//		List<Persion> persions1 = se.selectList("selectIfname");
//		for (Persion persion2 : persions1) {
//			System.out.println(persion2);
//		}
		se.close();
	}
}
