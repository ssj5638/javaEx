package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName = "D:\\javastudy\\files\\files\\";
	public static void main(String[] args) {

		// 파일 객체 
		File root = new File(dirName);
		// 파일의 실제 존재 여부 확인
		System.out.println(dirName + " : " + root.exists());
		// 파일의 정보를 출력
		printInfo(root);
		
		// 디렉토리 안쪽에 파일 만들기
		File file = new File(dirName + "myfile.txt"); // 파일 객체만 생성된 것이지 실제 파일이 생성된 것은 아님
		if(!file.exists()) { // 파일이 없으면 생성
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일을 만들지 못했습니다.");
			}
		}
		printInfo(root);
		
		// 파일 지우기
		file.delete();
		printInfo(root);
		
	}
	
	static void printInfo(File f) {
		System.out.println("==================");
		// 이 파일 객체가 디렉토리인지 확인
		if (f.isDirectory()) {
			System.out.println("Directory : " + f.getName());
			File[] files = f.listFiles();
			// 파일 리스트 출력
			for (File file:files) {
				System.out.print(file.isDirectory()? "d " : "f ");
				System.out.println(file.getName());
			}
		} else { // 디렉토리 아님
			System.out.println("File : " + f.getName());
		}
		System.out.println("==================");
	}

}