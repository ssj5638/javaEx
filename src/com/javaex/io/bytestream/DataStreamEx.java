package com.javaex.io.bytestream;

import java.io.*;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "primitives.txt";
	
	public static void main(String[] args) {
		try {
			// 스트림을 열어봅시다.
			OutputStream fos = new FileOutputStream(filename);
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("김가네");
			dos.writeBoolean(false);
			dos.writeInt(58);
			dos.writeFloat(115.9f);
			
			dos.close();
			
			InputStream fis = new FileInputStream(filename);
			DataInputStream dis = new DataInputStream(fis);
			
			for (int i = 0; i < 2; i++) {
				// 주의 : 출력한 순서에 맞게 읽어와야 함
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
//				double d = dis.readDouble();
				
				System.out.printf("%s : %s : %d : %f%n", s, b, val, f);
			}
			
			dis.close();			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
