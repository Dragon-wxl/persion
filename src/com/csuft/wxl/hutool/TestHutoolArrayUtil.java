package com.csuft.wxl.hutool;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.Null;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.lang.Filter;
import cn.hutool.core.util.ArrayUtil;

public class TestHutoolArrayUtil {

	public static void main(String[] args) {
		// 为空判断
//    	 int [] a = null;
//         int [] b = new int[5];
//         int [] c = new int[] {10,11,12};
//         System.out.println(ArrayUtil.isEmpty(a));//空位null，返回true
//         System.out.println(ArrayUtil.isEmpty(b));
//         System.out.println(ArrayUtil.isEmpty(c));
		// 调整数组大小
//		Integer[] a = new Integer[] { 10, 11, 12 };
//		Integer[] b = ArrayUtil.resize(a, 5);//取数组a构建长度位5的数组
////		System.out.println(a.length);
////		System.out.println(b.length);
//		for (Integer integer : b) {
//			System.out.println(integer);
//		}
		// 合并数组
//		Integer [] a = {1,2,3};
//        Integer [] b = {10,11,12};
//        Integer [] c = ArrayUtil.addAll(a,b);
//        for (Integer integer : c) {
//			System.out.println(integer);
//		}

		// 克隆数组，赋值只是将变量进行指向
//		Integer[] a= new Integer[] {10,1,0}; 
//		Integer[] b=ArrayUtil.clone(a);
//		b[2]=5;
//		for (Integer integer : a) {
//			System.out.println(integer);
//		}
		// 生成有序数组
//		int[] a=ArrayUtil.range(0,100,10);//生成整形数组从0开始，100结束，步长位10
//		for (int i : a) {
//			System.out.println(i);
//		}
		// 数组过滤，构建规则满足条件为真，保留，传入参数和一个类型条件的接口
//		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		Integer[] b = ArrayUtil.filter(a, new Filter<Integer>() {
//			@Override
//			public boolean accept(Integer t) {
//				if (0 == t % 3)
//					return true;
//				return false;
//			}
//		});
//		System.out.println(a.length);
//		for (Integer integer : b) {
//			System.out.println(integer);
//		}
		// 转换为Map,长度按照短的一方
//		Integer a[] = {1,2,3,4};
//        String c[] = {"a","b","c"};
//        Map<String,Integer> m = ArrayUtil.zip(c, a);
//        System.out.println(m.size());
		// 是否包含元素
//		Integer a[] = {1,2,3};
//		System.out.println(ArrayUtil.contains(a, 4));//判断第二个参数是否在a中
		// 数组的装箱拆箱,将int数组装箱成Integer，和相反
//		int a[] = {1,2,3};
//		Integer b[] = ArrayUtil.wrap(a);
//        int c[] = ArrayUtil.unWrap(b);
//        System.out.println("字符串："+ArrayUtil.toString(a));//数组转换为字符串
//        System.out.println(ArrayUtil.join(a,"-" ));//替换默认的，号显示，使用-号作为分隔
		// 拆分,Convert.toStr()只适用于一维数组，
		byte[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[][] b = ArrayUtil.split(a, 2);//以子单元长度为二进行划分，不足的元素添零
		for (byte[] cs : b) {
			System.out.println(Convert.toStr(b));
		}

	}
}
