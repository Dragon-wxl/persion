package com.csuft.wxl.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

public class PersionDynaSql {
	public String list(Map<String, Object> map) {
		return new SQL() {
			{
				SELECT("*");
				FROM("persion");
				if (map.get("id")!=null) {
					WHERE("id = #{id}");
				}
			}
		}.toString();

	}

	public String get() {
		return new SQL().SELECT("*").FROM("persion").WHERE("id=#{id}").toString();
	}

	public String add() {
		return new SQL().INSERT_INTO("persion").VALUES("id", "#{id}").VALUES("name", "#{name}")
				.VALUES("birthday", "#{birthday}").VALUES("sex", "#{sex}").VALUES("department", "#{department}")
				.toString();
	}

	public String update() {
		return new SQL().UPDATE("persion").SET("name=#{name}").WHERE("id=#{id}").toString();
	}

	public String delete() {
		return new SQL().DELETE_FROM("persion").WHERE("id=#{id}").toString();
	}

	// 较复杂的
	private String selectPersonSql() {
		return new SQL() {
			{
				SELECT("P.ID, P.USERNAME, P.PASSWORD, P.FULL_NAME");
				SELECT("P.LAST_NAME, P.CREATED_ON, P.UPDATED_ON");
				FROM("PERSON P");
				FROM("ACCOUNT A");
				INNER_JOIN("DEPARTMENT D on D.ID = P.DEPARTMENT_ID");
				INNER_JOIN("COMPANY C on D.COMPANY_ID = C.ID");
				WHERE("P.ID = A.ID");
				WHERE("P.FIRST_NAME like ?");
				OR();
				WHERE("P.LAST_NAME like ?");
				GROUP_BY("P.ID");
				HAVING("P.LAST_NAME like ?");
				OR();
				HAVING("P.FIRST_NAME like ?");
				ORDER_BY("P.ID");
				ORDER_BY("P.FULL_NAME");
			}
		}.toString();
	}

	public static void main(String[] args) {
		PersionDynaSql persionDynaSql = new PersionDynaSql();
		SQL sql = new SQL();

		System.out.println(persionDynaSql.get());
	}
}
