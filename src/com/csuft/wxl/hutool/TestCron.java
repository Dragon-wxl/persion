package com.csuft.wxl.hutool;

import java.util.Date;

import cn.hutool.cron.CronUtil;

public class TestCron {
	
	public static void main(String[] args) {
        CronUtil.setMatchSecond(true);
        CronUtil.start();
        CronUtil.schedule("0 * * * * ? *",new Runnable() {
            @Override
            public void run() {
            	Date date=new Date();
                System.out.println(date+ " 执行新任务");
                 
            }
        });
    }
}
