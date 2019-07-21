package com.csuft.wxl.hutool;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.comparator.PinyinComparator;
import cn.hutool.core.comparator.PropertyComparator;

/**
 * 
 * @author wxljllm
 *
 */
public class TestHutoolCollectionUtil {
	
	public static void main(String[] args) throws Exception{
		//属性比较器
//		List<Persion> persions=GetCsv.getPersions();
//		CollectionUtil.sort(persions,new PropertyComparator<Persion>("id"));
//		System.out.println(CollectionUtil.join(persions, "\n"));
		//拼音比较器
		List<String> names = new ArrayList<>();
        names.add("令狐冲");
        names.add("陈家洛");
        names.add("石破天");
        names.add("胡一刀");
        System.out.println(CollectionUtil.join(names, ","));
        CollectionUtil.sort(names,new PinyinComparator());//根据拼音的排序
        System.out.println(CollectionUtil.join(names, ","));
        
	}
}
