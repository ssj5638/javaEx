package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx { // leaf와 leaves 문자가 몇개 있는지 확인하는 테스트
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String source = dirName + "last-leaf.txt";
	static String target = dirName + "last-leaf-filered.txt";
	
	public static void main(String[] args) {
		try {
			
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			// 보조 스트림 열기
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				if ((line.toLowerCase().contains("leaf")) || (line.toLowerCase().contains("leaves"))) {
					bw.write(line);
					bw.write("\r\n");
				}
			}
			
			System.out.println("필터링 완료");
			
			br.close();
			bw.close();
			
		} catch(FileNotFoundException e) {
			
		} catch(IOException e) {
			
		}
	

	}

}
