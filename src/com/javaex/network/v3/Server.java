package com.javaex.network.v3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		// 서버 소캣 생성
		ServerSocket serverSocket = null;
		
		try {
			// 바인드
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			// 시작 메시지 출력
			System.out.println("<서버 시작>");
			System.out.println("[연결을 기다립니다.]");
			
			// 연결을 기다려 봅니다 : 대기 상태
			Socket socket = serverSocket.accept();
			
			// 클라이언트 접속시 처리
			InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress(); 
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.println(socketAddress.getAddress() + ":" + socketAddress.getPort());
			
			// 클라이언트로부터 메시지 받기
			// InputStream 열기
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// Echo Back을 위한 스트림 열기
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			// 메시지 읽고 Echo Back
			String msg;
			while(true) {
				msg = br.readLine();
				
				if(msg == null) {
					System.out.println("[접속 종료 되었습니다.]");
					break;
				}
				System.out.println("Message : " + msg);
				// Echo Back
				System.out.println("Echo Back : " + msg);
				bw.write("[Echo] : " + msg);
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			br.close();
			
			// 후처리
			System.out.println("====================");
			System.out.println("<서버 종료>");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try { // 소캣이 null일 수 있기 때문에 try
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
