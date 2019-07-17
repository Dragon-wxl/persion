package com.csuft.wxl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.csuft.wxl.pojo.Level;

public interface LevelMap {
	@Select("select * from level")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="rank",property="rank"),
		@Result(column="define",property="define"),
		@Result(column="rank",property="salary",many=@Many(select="com.csuft.wxl.mapper.SalaryMap.selectSalaryPersionsRank"))
	})
	public List<Level> selectLevel();
}
