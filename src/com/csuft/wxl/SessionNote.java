package com.csuft.wxl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//单例，私有化，构造函数私有化，get私有
public class SessionNote {
	private static SqlSession session;

	private SessionNote() {
	}

	public static SqlSession getSession() {
		try {
			String resource = "mybatis-config-note.xml";
			InputStream inputStream;

			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session1 = sqlSessionFactory.openSession();
			session = session1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return session;
	}
}
