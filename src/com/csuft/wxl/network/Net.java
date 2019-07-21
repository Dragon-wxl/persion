package com.csuft.wxl.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net {
	public static String getIp() throws UnknownHostException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		return ip;
	}
}
