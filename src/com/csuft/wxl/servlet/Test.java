package com.csuft.wxl.servlet;

import cn.hutool.core.text.UnicodeUtil;

public class Test {
	public static void main(String[] args) {
		String a="喜欢一个人";
		String bString=UnicodeUtil.toUnicode(a);
		System.out.println(bString);

	}
}
