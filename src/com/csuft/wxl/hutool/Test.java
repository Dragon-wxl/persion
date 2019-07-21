package com.csuft.wxl.hutool;

import com.csuft.wxl.pojo.Persion;

import cn.hutool.core.util.ReflectUtil;

public class Test {
	public static void main(String[] args) {
		Persion persion=new Persion();
		//设置属性
        ReflectUtil.setFieldValue(persion, "name", "花花世界");
//        System.out.println("设置属性:"+persion.getName());
        //调用方法
        ReflectUtil.invoke(persion, "setName", "盖伦");
        System.out.println(persion.getName());
        
	}
}
