package com.csuft.wxl.hutool;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;

public class TestQRcode {
	public static void main(String[] args) {
		String string = "http://how2j.cn";
	    String path = "d:/qrcode.jpg";
	    QrCodeUtil.generate(string, 300, 300, FileUtil.file(path));
	    System.out.println("字符串:"+string+" 二维码图片:"+path);
	     
	    string =  QrCodeUtil.decode(FileUtil.file(path));
	    System.out.println("二维码图片:"+path+" 二维码图片:"+string);
	}
}
