package com.csuft.wxl.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.csuft.wxl.pojo.Persion;

public interface PersionMap {
	// 增加一个persion
	@Insert("insert into persion (id,name,birthday,sex,department)"
			+ "				 value (#{id},#{name},#{birthday},#{sex},#{department})")
	public int addPersion(Persion persion);
	
	@Delete("delete from persion where id=#{id}")
	public int deletePersion(int id);
	
	//提供Map 根据id修改名字
	@Update("update persion set name=#{name} where id=#{id}")
	public int updatePersion(Map<String, Object> map);
	
	// 查询全部
	@Select("SELECT * FROM persion")
	public List<Persion> list();

}
