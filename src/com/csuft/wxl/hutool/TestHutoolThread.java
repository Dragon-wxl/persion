package com.csuft.wxl.hutool;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ArrayUtil;

public class TestHutoolThread {
	public static void main(String[] args) throws Exception {
		// 多线程工具
		System.out.println(ArrayUtil.join(ThreadUtil.getThreads(), "\r\n\t\t\t\t"));// 所有线程
		System.out.println(ThreadUtil.getMainThread());// 获得主线程
		ThreadUtil.sleep(2000);// 不用捕捉异常的sleep
		for (int i = 0; i < 10; i++) {
			Runnable r = new Runnable() {//很方便的通过线程池执行任务
				@Override
				public void run() {
					System.out.println("\t\t当前线程是：" + Thread.currentThread());
				}
			};
			ThreadUtil.execute(r);
		}

	}
}
