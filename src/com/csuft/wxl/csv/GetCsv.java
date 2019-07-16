package com.csuft.wxl.csv;

import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import com.csuft.wxl.Session;
import com.csuft.wxl.pojo.Persion;
import com.csvreader.CsvReader;

public class GetCsv {
	public static void main(String[] args) throws Exception {
		CsvReader csvReader = new CsvReader("C:\\Users\\Administrator\\Desktop\\练习\\persion.csv", ',',
				Charset.forName("GBK"));
		csvReader.readHeaders();
		ArrayList<Persion> persionslist = new ArrayList<Persion>();

		while (csvReader.readRecord()) {
			Persion persion = new Persion();
			persion.setId(Integer.parseInt(csvReader.get(0)));
			persion.setName(csvReader.get(1));
			persion.setBirthday(csvReader.get(2));
			persion.setSex(Integer.parseInt(csvReader.get(3)));
			persion.setDepartment(csvReader.get(4));
			persionslist.add(persion);
		}
		SqlSession se = Session.getSession();
		int sum = 0;
		for (Persion persion : persionslist) {
			try {
				int a = se.insert("insertOnePersion", persion);
				sum+=a;
				se.commit();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		se.close();
		System.out.println(sum+"添加");
	}
}
