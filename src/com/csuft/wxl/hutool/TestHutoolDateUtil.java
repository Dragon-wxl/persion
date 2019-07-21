package com.csuft.wxl.hutool;

import java.util.Date;
import java.util.List;

import cn.hutool.core.date.BetweenFormater.Level;
import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

public class TestHutoolDateUtil {

	public static void main(String[] args) {
		// 解析时间
//		String dataStr = "2012-12-12 12:12:12";
//		Date date = DateUtil.parse(dataStr);
//		System.out.println(date);

		// 进制,判断字符串是否为16进制
//		String s10="12";
//		
//		System.out.println(HexUtil.isHexNumber(s16));

		// 字符串的十六进制编码转换
//		String s10="12";
//		String s16="0x12";
//		System.out.println(HexUtil.encodeHexStr(s10));
//		System.out.println(HexUtil.decodeHexStr(HexUtil.encodeHexStr(s10)));

		// 颜色对象
//		Color color1 = Color.red;
//		String s1 = HexUtil.encodeColor(color1);
//		String s2 = "#112233";
//		Color color2 = HexUtil.decodeColor(s2);
//		System.out.println("颜色对象1\t"+color1+"\t字符串\t"+s1);
//		System.out.println("字符串\t"+s2+"\t颜色对象2\t"+color2);

		// 转义和反转义
//		String s1 = "<script>location.href='http://how2j.cn';</script>";
//		String s2 = EscapeUtil.escapeHtml4(s1);
//		String s3 = EscapeUtil.unescapeHtml4(s2);
//		System.out.println("原数据\t"+s1+"\t转义后\t"+s2);
//		System.out.println("转义后\t"+s2+"\t原数据\t"+s3);

		// 各种hash算法
//		String s = "hello world";
//        int number = 12;
//        long hash1 = HashUtil.additiveHash(s, Integer.MAX_VALUE);
//        long hash2 = HashUtil.rotatingHash(s, Integer.MAX_VALUE);
//        long hash3 = HashUtil.oneByOneHash(s);
//        long hash4 = HashUtil.bernstein(s);
////      long hash5 = HashUtil.universal(s); 怎么调用？站长不会调用。。。颜面~~~
////      long hash6 = HashUtil.zobrist(s);
//        long hash7 = HashUtil.fnvHash(s);
//        long hash8 = HashUtil.intHash(number);
//        long hash9 = HashUtil.rsHash(s);
//        long hash10 = HashUtil.jsHash(s);
//        long hash11 = HashUtil.pjwHash(s);
//        long hash12 = HashUtil.elfHash(s);
//        long hash13 = HashUtil.bkdrHash(s);
//        long hash14 = HashUtil.sdbmHash(s);
//        long hash15 = HashUtil.djbHash(s);
//        long hash16 = HashUtil.dekHash(s);
//        long hash17 = HashUtil.apHash(s);
//        long hash18 = HashUtil.tianlHash(s);
//        long hash19 = HashUtil.javaDefaultHash(s);
//        long hash20 = HashUtil.mixHash(s);     
//        p2("原数据",s, "加法算法对应的哈希值", hash1);
//        p2("原数据",s, "旋转算法对应的哈希值", hash2);
//        p2("原数据",s, "一次一个算法对应的哈希值", hash3);
//        p2("原数据",s, "Bernstein's算法对应的哈希值", hash4);
////      p2("原数据",s, " Universal 算法对应的哈希值", hash5);
////      p2("原数据",s, " Zobrist 算法对应的哈希值", hash6);
//        p2("原数据",s, " 改进的32位FNV 算法对应的哈希值", hash7);
//        p2("原数据",s, "Thomas Wang的整数算法对应的哈希值", hash8);
//        p2("原数据",s, "RS算法对应的哈希值", hash9);
//        p2("原数据",s, "JS算法对应的哈希值", hash10);
//        p2("原数据",s, "PJ算法对应的哈希值", hash11);
//        p2("原数据",s, "ELF算法对应的哈希值", hash12);
//        p2("原数据",s, "BKDR算法对应的哈希值", hash13);
//        p2("原数据",s, "SDBM算法对应的哈希值", hash14);
//        p2("原数据",s, "DJB算法对应的哈希值", hash15);
//        p2("原数据",s, "DEK算法对应的哈希值", hash16);
//        p2("原数据",s, "AP算法对应的哈希值", hash17);
//        p2("原数据",s, "TianL算法对应的哈希值", hash18);
//        p2("原数据",s, "JAVA自己带算法对应的哈希值", hash19);
//        p2("原数据",s, "混合算法对应的哈希值", hash20);

//        String url1 = "how2j.cn";
//        String url2 = "http://how2j.cn/k/tmall_springboot/tmall_springboot-1799/1799.html";
//        String urla =URLUtil.formatUrl(url1);
//        String urlb = URLUtil.encode(url2);
//        String urlc = URLUtil.decode(urlb);
//        String urld = URLUtil.getPath(url2);
//         
//        p1("原数据",url1, "格式化之后",urla);
//        p1("原数据",url2, "编码数据",urlb);
//        p1("编码数据",urlb, "解码数据",urlc);
//        p1("原数据",url2, "对应路径路径",urld);

//		//Base32-Base63工具
//		String charset = "utf-8";
//        String content = "hello world";
//        p3("原字符串",content);
//        String code32= Base32.encode(content, charset);
//        content = Base32.decodeStr(code32,charset);
//        p3("32位编码后",code32);
//        p3("32位解码",content);
//        String code64= Base64.encode(content, charset);
//        content = Base64.decodeStr(code64,charset);
//        p3("64位编码后",code64);
//        p3("64位解码",content);

		// unicode
//		String charset = "utf-8";
//		String content = "hello world,你好世界";
//		p3("原字符串", content);
//		String unicode = UnicodeUtil.toUnicode(content);
//		content = UnicodeUtil.toString(unicode);
//		p3("获取unicode", unicode);
//		p3("转会原字符串", content);

		// 转换字符串
//		int a = 1;
//		String aStr = Convert.toStr(a);
//		System.out.println(aStr);
//		int[] b = { 1, 2, 3, 4, 5 };
//		String bStr = Convert.toStr(b);
//		p(bStr);
//		Object c = null;
//		String cStr = Convert.toStr(c, "空字符串(默认值)");
//		p(cStr);
		// 字符串数组或字符数组转换为数组
//		char[] a = { '1', '2', '3', '4' };
//		Integer[] b = Convert.toIntArray(a);
//		p(b);
		// 数组和集合的互转
//		String[] a = { "1", "2", "3", "4" };
//		List<String> l = (List<String>) Convert.toList(a);
//        String[] b= Convert.toStrArray(l);
//        p(l);
//        p(b);
		// 全角和半角，全角中文；半角英文
//		 String a = "123456789";//半角
//	        String b = Convert.toSBC(a);//半角a转全角b
//	        String c = Convert.toDBC(b);//全骄b转半角c
//	        p("全角："+b);p("半角："+c);
		// 编码转换
//		 String a = "how2j的Hutool教程";
//	        //转换后result为乱码
//	        String b = Convert.convertCharset(a, CharsetUtil.UTF_8, CharsetUtil.ISO_8859_1);
//	        String c = Convert.convertCharset(b, CharsetUtil.ISO_8859_1, "UTF-8");
//	        p(b);
//	        p(c);
		// 数字转为金额
//		double  a= 1234567123456.12;
//        String b = Convert.digitToChinese(a);
//        p(b);
		// 原始类和包装类的转换
//		Class<?> wrapClass = Integer.class;
//        Class<?> unWraped = Convert.unWrap(wrapClass);
//        Class<?> primitiveClass = long.class;
//        Class<?> wraped = Convert.wrap(primitiveClass);
//        System.out.println(wrapClass);
//        System.out.println(unWraped);
//        System.out.println(primitiveClass);
//        System.out.println(wraped);

		// 日期工具,解析的部分为字符串转换，未解析的地方置零
//		Date d;
//		String str = "12:12:12";// 不能输入1，而要输入01
//		d = DateUtil.parse(str);
//		System.out.println(d);// 只是时，分，秒改变，
//		String str2 = "2012/12/12";
//		d = DateUtil.parse(str2);
//		System.out.println(d);
//		String str3 = "2012-12-12 12:12";
//		d = DateUtil.parse(str3);
//		System.out.println(d);
//		String str4 = "2012-12-12 12:12:12";
//		d = DateUtil.parse(str4);
//		System.out.println(d);
		// 日期转字符串
//		Date d=new Date();
//		String str=DateUtil.format(d, "yyyy/MM/dd");
//		p(str);
//		String formatDate = DateUtil.formatDate(d);//常用的日期字符串格式
//		p(formatDate);
//        String formatDateTime = DateUtil.formatDateTime(d);//显示全部日期
//        p(formatDateTime);
//        String formatTime1= DateUtil.formatTime(d);//显示小时部分
//        p(formatTime1);
//		// 获取部分时间
//		Date d = new Date();
//		int year = DateUtil.year(d);
//		int month = DateUtil.month(d);// 获得月份的枚举
//		Enum months= DateUtil.monthEnum(d);
//		Enum weeks= DateUtil.dayOfWeekEnum(d);//获得星期的枚举
//		System.out.println(months);
//		System.out.println(weeks);
//		//一天的开始和结束
//		Date beginOfDay = DateUtil.beginOfDay(d);
//		System.out.println(beginOfDay);//一天的开始
//		Date endOfDay = DateUtil.endOfDay(d);
//		System.out.println(endOfDay);//一天的结束
//		// 日期的偏移
//		Date date=new Date();
//		Date d1 = DateUtil.offset(date,DateField.DAY_OF_MONTH,7);//日偏移2
//		Date d2 = DateUtil.offsetDay(date, 13);//日偏移13
//		Date d3= DateUtil.offsetHour(date, -3);//时偏移-3
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		// 偏移的简化用法
//		Date date = new Date();
//		Date d1 = DateUtil.yesterday();//昨天
//		Date d2 = DateUtil.tomorrow();//明天
//		Date d3 = DateUtil.lastWeek();//上周
//		Date d4 = DateUtil.nextWeek();//下周
//		Date d5 = DateUtil.lastMonth();//上个月
//		Date d6 = DateUtil.nextMonth();//下个月
		// 时间差
//		Date date=new Date();
//		Date date1=DateUtil.offsetDay(date, 0);
//        Date date2 =DateUtil.offsetDay(date1, 2);
//        long between=DateUtil.between(date1, date2,DateUnit.MS);
		// 格式化时间差
//		long between = System.currentTimeMillis();
//        String s4 = DateUtil.formatBetween(between, Level.MILLSECOND);//毫秒换算到？天？小时？分？秒？毫秒
//        String s0 = DateUtil.formatBetween(between, Level.HOUR);//毫秒换算到？天？小时
//        System.out.println(s0);
		// 性能统计
//		int loopcount = 100;
//		TimeInterval timer = DateUtil.timer();
//		for (int i = 0; i < loopcount; i++) {
//			try {
//				Thread.sleep(1);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		long interval1 = timer.interval();
//		System.out.println(interval1);
////        forloop(loopcount);
//		long interval2 = timer.intervalRestart();
//		for (int i = 0; i < loopcount; i++) {
//			try {
//				Thread.sleep(1);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		long interval3 = timer.interval();
//		System.out.println(interval3);
//	}
//
//	public static void p(List<String> s1) {
//		for (String object : s1) {
//			System.out.println(object);
//		}
	}

	public static void p(String str) {
		System.out.println(str);
	}

	public static void p(String[] s1) {
		for (String integer : s1) {
			System.out.print(integer + " ");
		}
	}

	public static void p(Integer[] s1) {
		for (Integer integer : s1) {
			System.out.print(integer + " ");
		}
	}

	public static void p3(String s1, String s2) {
		System.out.println(s1 + " " + s2 + " ");
	}

	public static void p1(String s1, String s2, String s3, String s4) {
		System.out.println(s1 + " " + s2 + " " + s3 + "\t" + s4);
	}

	public static void p2(String s1, String s2, String s3, long s4) {
		System.out.println(s1 + s2 + " " + s3 + "\t" + s4);
	}

}
