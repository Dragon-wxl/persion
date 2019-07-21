package com.csuft.wxl.hutool;

import java.awt.Image;
import java.io.File;

import cn.hutool.core.swing.ClipboardUtil;
import cn.hutool.core.util.ImageUtil;
import cn.hutool.core.util.RuntimeUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.system.SystemUtil;
/**
 * 运行时工具
 * 粘贴板
 * 系统属性工具
 * @author wxljllm
 *
 */
public class TestHutoolClipboardUtilAndRuntimeUtilAndSystenUtil {
	public static void main(String[] args) {
		//粘贴板 文字粘贴
//		String s1 = "你好世界";
//        ClipboardUtil.setStr(s1);
//        String s2 = ClipboardUtil.getStr();
//        System.out.println(s2);
		 //注意此文件是否真的存在
//        String imagePath = "d:/asd.png";
//      Image img =ImageUtil.read(imagePath);
//      ClipboardUtil.setImage(img);
//      img = ClipboardUtil.getImage();
//      System.out.println(img);
		
		//RuntimeUtil使用,应该可以执行cmd的相关操作
//		String s =RuntimeUtil.execForStr("notepad");
//				System.out.println(s);
		
		//系统属性工具
//		System.out.println(StrUtil.trim(SystemUtil.getJvmSpecInfo().toString()));//java虚拟机规范
//		System.out.println(StrUtil.trim(SystemUtil.getJvmInfo().toString()));//当前虚拟机信息
//		System.out.println(StrUtil.trim(SystemUtil.getJavaSpecInfo().toString()));//java规范
//		System.out.println(StrUtil.trim(SystemUtil.getJavaInfo().toString()));//当前java信息
//		System.out.println(StrUtil.trim(SystemUtil.getJavaRuntimeInfo().toString()));//java运行时信息
//		System.out.println(StrUtil.trim(SystemUtil.getOsInfo().toString()));//操作系统的信息
//		System.out.println(StrUtil.trim(SystemUtil.getUserInfo().toString()));//用户信息
//		System.out.println(StrUtil.trim(SystemUtil.getHostInfo().toString()));//主机信息
//		System.out.println(StrUtil.trim(SystemUtil.getRuntimeInfo().toString()));//内存信息
		
	}
}
