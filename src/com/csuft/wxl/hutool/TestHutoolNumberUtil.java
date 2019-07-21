package com.csuft.wxl.hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.NumberUtil;

public class TestHutoolNumberUtil {
	public static void main(String[] args) {
		//精确计算
//		double result1=(1.2-0.4);//浮点运算无法得到精确结果
//		double result2 = NumberUtil.sub(1.2, 0.4);//可以得到精确结果
//		System.out.println(result1);
//		System.out.println(result2);
		//四舍五入
//		double a = 100.123;
//        double b = 100.125;
//        double result1= NumberUtil.round(a, 2).doubleValue();//对a作四舍五入取两位小数
//        double result2= NumberUtil.round(b, 2).doubleValue();
//		System.out.println(result1);
//		System.out.println(result2);
		//数字格式化
//		String str = NumberUtil.decimalFormat("00.000",Math.PI);
//      0 -> 取一位整数
//      0.00 -> 取一位整数和两位小数
//      00.000 -> 取两位整数和三位小数
//      # -> 取所有整数部分
//      #.##% -> 以百分比方式计数，并取两位小数
//      #.#####E0 -> 显示为科学计数法，并取五位小数
//      ,### -> 每三位以逗号进行分隔，例如：299,792,458
//      光速大小为每秒,###米 -> 将格式嵌入文本
//		System.out.println(str);
		//数字判断
//		 String s1 = "3.1415926";
//		 int n = 11;
//		 System.out.println(NumberUtil.isNumber(s1));//字符串中是否是数字
//		 System.out.println(NumberUtil.isInteger(s1));//字符传中的数是否是整数
//		 System.out.println(NumberUtil.isDouble(s1));//字符串是否是双精度数
//		 System.out.println(NumberUtil.isPrimes(n));//字符串是否是质数
		 //随机数
//		int numbers[] = NumberUtil.generateRandomNumber(1,1000,10);//最小是1，最大是1000，总长度是10的不重复随机数组
//		String str[]=Convert.toStrArray(numbers);
//		for (String string : str) {
//			System.out.println(string);
//		}
		//整数列表
//		int numbers[] = NumberUtil.range(0, 100, 10);//从零开始，步长为10，直到100，
//		String str[]=Convert.toStrArray(numbers);
//		for (String string : str) {
//			System.out.println(string);
//		}
		//其他相关数学运算
//		System.out.println(NumberUtil.factorial(3));//3的阶乘
//		NumberUtil.sqrt(9);//9的平方
//		NumberUtil.divisor(9,6);//9和6的最大共约束
//		NumberUtil.multiple(9,6);//9和6的最小公倍数
//		NumberUtil.getBinaryStr(9);//获得9的二进制字符串
//		NumberUtil.decimalFormatMoney(123456789);//获得金额形式的字符串
		
		
		
	}
}
