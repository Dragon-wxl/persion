package com.csuft.wxl.hutool;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.RandomUtil;

public class TestHutoolRandomUtil {

	public static void main(String[] args) {
		// 随机数
		// 集合
		List<String> ls = new ArrayList<String>();
		ls.add("你好");
		ls.add("你不好");
		ls.add("不你很好");
		int a = RandomUtil.randomInt(1, 10);// 在1到10的范围类取一个随机数
//		System.out.println(a);
		byte[] b = RandomUtil.randomBytes(2);// 获取长度为2的字节数组
//		System.out.println(Convert.toStr(b));
		String a1 = RandomUtil.randomEle(ls);// 随机获取集合ls中的元素
//		System.out.println(a1);
		String a3 = RandomUtil.randomString(10);
//		System.out.println(a3);//随机获取一个字符串（数字和字母构成）长度为10
		String a4 = RandomUtil.randomStringUpper(10);
//		System.out.println(a4);//随机获得一个字符串，字母大写（数字字母构成）长度为10
		String a5 = RandomUtil.randomNumbers(10);
//		System.out.println(a5);//随机获得数字字符串
		String a6 = RandomUtil.randomUUID();// 通用唯一识别码
//		System.out.println(a6);
		String a7 = RandomUtil.simpleUUID();// 简单识别码
		System.out.println(a7);

	}
}
