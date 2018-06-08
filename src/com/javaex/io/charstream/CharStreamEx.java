package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "char.txt";
	
	public static void main(String[] args) {
		
		try {
			// 파일 라이터 열기
			Writer fwriter = new FileWriter(filename);
			fwriter.write("Bit Computer\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2018.05");
			fwriter.flush();
			fwriter.close();
			
			// 파일 리더 열기
			Reader freader = new FileReader(filename);
			
			int data = 0;
			while((data = freader.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			freader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 받을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}

}
