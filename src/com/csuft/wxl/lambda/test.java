package com.csuft.wxl.lambda;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		String n = "世界";
		Hello hello = (String Str) -> filter1("我的" + Str);
		filter(n, hello);
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a=(int)(Math.random()*5+1);
		}
		
		
		b.stream().sorted().forEach(i->System.out.print(i+"\t"));
		
		
		
		
		
	}

	public static void filter(String str, Hello he) {
		System.out.println(he.hello(str) + "，你好");
	}

	public static String filter1(String str) {
		return str;
	}
}
