package com.csuft.wxl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.csuft.wxl.pojo.Persion;
import com.csuft.wxl.pojo.Salary;

public interface SalaryMap {
	@Select("select * from salary")
	public List<Salary> selectSalary();
	
	@Select("select * from salary")
	@Results({ 
		@Result(id=true,property="id",column="id"),
		@Result(property="wage",column="wage"),
		@Result(property="department",column="department"),
		@Result(property = "persion",
        column = "department", many = @Many(select = "com.csuft.wxl.mapper.PersionMap.persionListById"))})
	public List<Salary> selectSalaryPersions();
	
	@Select("select * from salary where department=#{department}")
	@Results({ 
		@Result(id=true,property="id",column="id"),
		@Result(property="wage",column="wage"),
		@Result(property="department",column="department")})
	public List<Salary> selectSalaryPersionsByDepartment(String department);
}
