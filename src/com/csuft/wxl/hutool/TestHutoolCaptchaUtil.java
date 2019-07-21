package com.csuft.wxl.hutool;

import java.io.OutputStream;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.ShearCaptcha;
import cn.hutool.core.io.IoUtil;

public class TestHutoolCaptchaUtil {
	public static void main(String[] args) {
		//创建 线段干扰的验证码
//		int width = 200;
//        int height = 100;
//        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(width, height);
//        String path = "d:/captcha1.png";
//        captcha.write(path);
//        System.out.println(captcha.getCode());
        //创建 圆圈干扰的验证码
//		int width = 200;
//        int height = 100;
//        int codeCount = 5;
//        int circleCount = 40;
//        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(width, height,codeCount,circleCount);
//        String path = "d:/captcha2.png";
//        captcha.write(path);
//        System.out.println(captcha.getCode());
		//创建 扭曲线干扰的验证码
//		int width = 200;
//        int height = 100;
//        int codeCount = 5;
//        int thickness = 2;
//        ShearCaptcha captcha = CaptchaUtil.createShearCaptcha(width, height,codeCount,thickness);
//        String path = "d:/captcha3.png";
//        captcha.write(path);
//        System.out.println(captcha.getCode());
		//web 页面输出
		//junit 毕竟不是servlet 容器，拿不到 response对象， 这里是伪代码
        int width = 200;
        int height = 100;
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(width, height);
        OutputStream out = null;
//      out = HttpServletResponse.getOutputStream();
//      captcha.write(out);
        IoUtil.close(out);
		
	}
}
