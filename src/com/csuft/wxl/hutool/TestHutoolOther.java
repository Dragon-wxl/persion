package com.csuft.wxl.hutool;

import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.NetUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.ZipUtil;

public class TestHutoolOther {
	public static void main(String[] args) {
//		ipv4 和 long 互换
//		String ip = "220.181.57.216";
//		long value = 0L;//0L 是 长整型数值 0
//		value = NetUtil.ipv4ToLong(ip);
//		ip = NetUtil.longToIpv4(value);
//		p2("ip地址", ip, "对应的long", value);
//		p2("long值 ", value, "对应的ip", ip);

		// 判断端口和地址
//		int port1 = 80;
//		int port2 = 68000;
//		String ip1 = "220.181.57.216";
//		String ip2 = "192.168.0.8";
//		p2("端口号", port1, "是否已经被占用", !NetUtil.isUsableLocalPort(port1));
//		p2("端口号", port2, "是否一个有效的端口号", NetUtil.isValidPort(port2));
//		p2("ip地址", ip1, "是否是个内网地址", NetUtil.isInnerIP(ip1));
//		p2("ip地址", ip2, "是否是个内网地址", NetUtil.isInnerIP(ip2));

		// 其他相关操作
//		String ip = "220.181.57.216";
//        String host = "baidu.com";
//        p2("原ip",ip,"隐藏最后一位",NetUtil.hideIpPart(ip));
//        p2("域名",host,"对应的ip地址",NetUtil.getIpByHost(host));
//        p3("本机ip地址",NetUtil.localIpv4s());
//        p3("本机mac地址",NetUtil.getLocalMacAddress());

		// 压缩工具
		// 压缩字符串
//		String str = "hello!!!!!!!!!!!!!!!";
//		byte[] bs = ZipUtil.zlib(str, "utf-8", 4);
//		String str2 = ZipUtil.unZlib(bs, "utf-8");
//
//		p3("源字符串", str);
//		p3("长度是", str.length());
//		p3("zlib压缩后，长度是", bs.length);
//		p3("unzip后得到", str2);
		// 压缩文件
//		 System.out.println("\t因为是压缩文件，不好演示,主要就是使用 zip和unzip方法，很好用，都挨个试试就知道了");

		// 正则表达式
//		String content = "But just as he who called you is holy, so be holy in all you do; for it is written: “Be holy, because I am holy";
//        p3("字符串",content);
//        String regex = "\\w{5}";
//        p3(regex + " 表：","连续5个字母或者数字");
//        Object result = ReUtil.get(regex, content, 0);
//        p2("正则表达式",regex,"get 返回值", result);
//        result = ReUtil.contains(regex, content);
//        p2("正则表达式",regex,"contain 返回值", result);
//        result = ReUtil.count(regex, content);
//        p2("正则表达式",regex,"count 返回值", result);
//        result = ReUtil.delAll(regex, content);
//        p2("正则表达式",regex,"delAll 返回值", result);
//        result = ReUtil.delFirst(regex, content);
//        p2("正则表达式",regex,"delFirst 返回值", result);
//        result = ReUtil.delPre(regex, content);
//        p2("正则表达式",regex,"delPre 返回值", result);
//        result = ReUtil.findAll(regex, content,0);
//        p2("正则表达式",regex,"findAll 返回值", result);
		// 校验工具
		// 校验器
//		String email = "32we@qe.com";
//		boolean valid = Validator.isEmail(email);
//		p2("邮件地址", email, " 是否合法 ", valid);
		
		//身份证工具
		String id15 = "510108871125243";
        p3("15位身份证号码",id15);
        p3("判断是否有效",IdcardUtil.isValidCard(id15));
        p3("转换为18位身份证号码",IdcardUtil.convert15To18(id15));
        String id18 ="*******************";
//        String id18 =IdcardUtil.convert15To18(id15);
        p3("获取生日",IdcardUtil.getBirthByIdCard(id18));
        p3("获取年龄",IdcardUtil.getAgeByIdCard(id18));
        p3("获取出生年",IdcardUtil.getYearByIdCard(id18));
        p3("获取出生月",IdcardUtil.getMonthByIdCard(id18));
        p3("获取出生天",IdcardUtil.getDayByIdCard(id18));
        p3("获取性别",IdcardUtil.getGenderByIdCard(id18));
        p3("获取省份",IdcardUtil.getProvinceByIdCard(id18));
	}

	public static void p3(Object str2, Object str3) {
		System.out.println(str2 + ":" + str3);
	}

	public static void p2(Object str, Object str1, Object str2, Object str3) {
		System.out.println(str + ":" + str1 + "\t" + str2 + ":" + str3);
	}
}
