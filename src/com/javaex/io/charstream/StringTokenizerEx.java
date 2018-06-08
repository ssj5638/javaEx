package com.javaex.io.charstream;

import java.io.*;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "thieves.txt";
	
	public static void main(String[] args) {
		
		try {
			// 스트림 열기
			Reader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			
			String thief;
			
			while((thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief, " ");
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
