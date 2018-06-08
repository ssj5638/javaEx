package com.javaex.network.v3;

import java.net.InetAddress;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			// 현재 사용 컴퓨터의 IP주소 얻어오기
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP Address : " + local.getHostAddress());
			
			// www.google.com 의 서버 IP를 받아와 봅시다.
			String hostName = "www.naver.com";			
			InetAddress[] adrs = InetAddress.getAllByName(hostName);
			for (InetAddress remote : adrs) {
				System.out.println("www.naver.com IP Address : " + remote.getHostAddress());
			}
			
			
		} catch (java.net.UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
