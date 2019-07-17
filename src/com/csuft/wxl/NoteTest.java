package com.csuft.wxl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.mapper.PersionMap;
import com.csuft.wxl.mapper.SalaryMap;
import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.pojo.Salary;

public class NoteTest {
	public static void main(String[] args) {
		SqlSession se = (SqlSession) SessionNote.getSession();
		PersionMap persionMap = se.getMapper(PersionMap.class);
		SalaryMap salaryMap=se.getMapper(SalaryMap.class);

		// 增
//		Persion persion = new Persion(21, "小灰灰", "1999-1-1", 1, "总经理");
//		int a = persionMap.addPersion(persion);
//		System.out.println(a);
		
		//删
//		int a = persionMap.deletePersion(21);
//		System.out.println(a);
		
		//改
//		Map<String, Object> map=new HashMap<String, Object>();
//		map.put("id", "21");
//		map.put("name", "小小灰");
//		int a=persionMap.updatePersion(map);
//		System.out.println("受影响的行数："+a);
		
		//	查
//		List<Persion> list = persionMap.list();
//		for (Persion persion2 : list) {
//			System.out.println(persion2);
//		}
//		se.commit();
//		se.close();
	
	//从salary的一对多查询
//		SalaryMap salaryMap=se.getMapper(SalaryMap.class);
//		List<Salary> list=(List<Salary>) salaryMap.selectSalaryPersions();
//		for (Salary salary : list) {
//			System.out.println(salary.getDepartment());
//			List<Persion> persions=salary.getPersion();
//			for (Persion salary2 : persions) {
//				System.out.println("\t"+salary2);
//			}
//		}
		
		//从persion的多对一查询
		List<Persion> persions=persionMap.persionSalaryList();
		for (Persion persion : persions) {
			System.out.println(persion);
		}
	}
}
