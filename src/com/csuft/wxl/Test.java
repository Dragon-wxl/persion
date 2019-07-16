package com.csuft.wxl;

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
//		List<Persion> list2=se.selectList("selectVagueName", "张");
//		for (Persion persion4 : list2) {
//			System.out.println("查询"+persion4.toString());
//		}

		// 多条件查询
		//使用Map进行输入
//		Map<String, Object> params = new HashMap<String, Object>();
//		params.put("name", "张三");
//		params.put("department", "生产部");
//		List<Persion> persions5 = se.selectList("selectNameDepartment", params);
//		for (Persion persion6 : persions5) {
//			System.out.println(persion6);
//		}
		//两表联合查询 一对多的查询一sqlary为主
//		List<Salary> cs = se.selectList("selectPersionWage");
//        for (Salary c : cs) {
//        	List<Persion> persions=c.getPersion();
//        	for (Persion pe : persions) {
//				System.out.println(c.getId()+" "+c.getDepartment()+" "+c.getWage()+" "+pe);
//			}
//        }
//        se.commit();
//        se.close();

		//两表联合查询 一对多的查询一persion为主
//		List<Persion> cs = se.selectList("selectPersionWage2");
//        for (Persion c : cs) {
//        	System.out.println(c);
//        }
//        se.commit();
//        se.close();
		
		//三表连接
		List<Persion> persions=se.selectList("selectPersionWageLevel");
		for (Persion persion2 : persions) {
			System.out.println(persion2);
		}

	}
}
