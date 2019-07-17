package com.csuft.wxl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.mapper.PersionMap;
import com.csuft.wxl.pojo.Persion;

public class NoteTest {
	public static void main(String[] args) {
		SqlSession se = (SqlSession) SessionNote.getSession();
		PersionMap persionMap = se.getMapper(PersionMap.class);

		// 增
//		Persion persion = new Persion(21, "小灰灰", "1999-1-1", 1, "总经理");
//		int a = persionMap.addPersion(persion);
//		System.out.println(a);
		
		//删
//		int a = persionMap.deletePersion(21);
//		System.out.println(a);
		
		//改
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", "21");
		map.put("name", "小小灰");
		int a=persionMap.updatePersion(map);
		System.out.println("受影响的行数："+a);
		
		//	查
		List<Persion> list = persionMap.list();
		for (Persion persion2 : list) {
			System.out.println(persion2);
		}
		se.commit();
		se.close();
	}
}
