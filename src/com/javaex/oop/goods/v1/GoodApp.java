package com.javaex.oop.goods.v1;

public class GoodApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "Dell XPS";
		notebook.price = 2000000;
		
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 700000;
		
		Goods cup = new Goods(); // 레퍼런스 생성
		cup.name = "머그컵"; // 인스턴스 이름 변수 입력
		cup.price = 2000; // 인스턴스 가격 변수 입력
		
		System.out.printf("%s, %d원%n", notebook.name, notebook.price);
		
		System.out.printf("%s, %d원%n", camera.name, camera.price);
		
		System.out.printf("- 상품 이름 : \"%s\", 가격 : %d", cup.name, cup.price);

	}

}
