package com.csuft.wxl.hutool;

import cn.hutool.cache.Cache;
import cn.hutool.cache.CacheUtil;
import cn.hutool.cache.file.LFUFileCache;
import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.thread.ThreadUtil;

public class TestHutoolCacheUtil {
	public static void main(String[] args) {
		// 四种缓存策略
		// FIFOCache 先入先出，一旦缓存满了，先放进去的，先被清空
		// LFUCache 一旦缓存满了，用得最少的，先被清空 (命中低的数据被清空)
		// LRUCache least recently used 一旦缓存满了，最久没用的，先被清空 (旧数据被清空)
		// TimedCache 一旦时间到了，被清空 (考虑时效性)
		// WeakCache 一旦内存满了，要垃圾回收了，优先被清空 (内存占用重要性)
		// FileCach 把文件对象作为缓存，减少IO访问频率
		// FIFO 先进先出
//		 Cache<String,Integer> cache= CacheUtil.newFIFOCache(2);
//		 cache.put("key1",1 );
//	     cache.put("key2",2 );
//	     cache.put("key3",3 );
//	     System.out.println(CollectionUtil.join(cache, ","));//缓存队列2，3，其中换出1
		// LFUcache
//		 Cache<String,Integer> cache= CacheUtil.newLFUCache(2);
//		 cache.put("key1",1 );
//	     cache.put("key2",2 );
//		 cache.get("key1");//中间使用“key1”
//	     cache.put("key3",3 );
//	     System.out.println(CollectionUtil.join(cache, ","));//缓存队列1，3，其中换出2
		// LRU
//		Cache<String,Integer> cache= CacheUtil.newLRUCache(2);
//        cache.put("key1",1 );
//        cache.put("key2",2 );
//        cache.get("key1");//使用“key1”
//        cache.put("key3",3 );
//        System.out.println(CollectionUtil.join(cache, ","));//缓存队列1，3，其中换出2
		// TimedCache
//		Cache<String,Integer> cache= CacheUtil.newTimedCache(Integer.MAX_VALUE);
//        cache.put("key1",1, 1000 );//key1存在1秒
//        cache.put("key2",2,5000 );//key2存在5秒
//        ThreadUtil.sleep(3000);//延时3秒
//        System.out.println(CollectionUtil.join(cache, ","));//缓存队列3，其中清除1
		//WeakCache
		//WeekCache表示当垃圾回收发生的时候，不会阻挡回收器把它回收走。
		//请注意看描述：\"不会阻挡\", 就是说，垃圾回收真正要对它下手了，是可以下手的。
		//但是垃圾回收发生的时候，不一定会回收所有垃圾和 week引用。
		//正因为如此，不易观察到现象，而且不稳定，所以就不做演示了，免得误导
		//FileCach FileCache 也分 LFU, LRU 等，只是调用方式有所区别，并没有被放到 CacheUtil里，找了好一会儿才找到。。。，
		long capacity = 1024*1024*500; //最多500m, 太大了，内存吃不消，缓存就没法实施了
        long maxFileSize = 1024*1024*10; //最大10m, 文件小于这个就缓存，太大了也不缓存
        long timeout = 1000*60*60*24; //缓存一天，超过这个就自动从缓存里移除了
        LFUFileCache cache = new LFUFileCache(1024*1024*500, 500, 2000);
        //使用办法：
        //byte[] bytes = cache.getFileBytes("e:/project/hutool/img/logo.png");
	}

}
