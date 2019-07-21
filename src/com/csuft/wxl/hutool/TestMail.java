package com.csuft.wxl.hutool;

import cn.hutool.core.date.DateUtil;
import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

public class TestMail {
	private MailAccount account;

	public void prepareMailAccount() {
		
		
		
		account = new MailAccount();
		account.setHost("smtp.qq.com");
		account.setPort(465);
		//ttwutcydssdaebde
		account.setAuth(true);
		account.setSslEnable(true);
		account.setFrom("*****@qq.com"); // 假邮箱，请自己申请真实邮箱
		account.setUser("-****"); // 假邮箱，请自己申请真实邮箱
		account.setPass("************"); // 假密码，请自己申请真实邮箱
	}

//	 @Comment("发送普通文本")
	public void test1() {
		// 因为账号密码不对，所以不能正确发送
		 MailUtil.send(account,"*****@qq.com", "hutool 测试邮件" + DateUtil.now(), "测试内容",
		 false);
	}

//	    @Test
//	    @Comment("发送html邮件")
	public void test2() {
		// 因为账号密码不对，所以不能正确发送
		// MailUtil.send(account,"test@163.com", "hutool 测试邮件" + DateUtil.now(),
		// "<p>测试内容</p>", true);
	}

//	    @Test
//	    @Comment("发送带附件的邮件")
	public void test3() {

		// 因为账号密码不对，所以不能正确发送
//		MailUtil.send(account, "test@163.com", "hutool 测试邮件" + DateUtil.now(), "<p>测试内容</p>", true,
//				FileUtil.file("d:/test.txt"));
	}
	public static void main(String[] args) {
		TestMail testMail=new TestMail();
		testMail.test1();
		System.out.println("发送");
	}
}
