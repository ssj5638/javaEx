package com.javaex.quiz.quiz02;

public class Quiz02_2 {

	public static void main(String[] args) {
		int balls = 136; // 보유하고 있는 공의 개수
		int cap = 10; // 하나의 상자당 담을 수 있는 공의 개수
		int result;
		
		result = balls % cap == 0 ? balls / cap : balls / cap + 1;
		System.out.println("총 " + result + "개의 박스가 필요하다.");
/*		
		result = balls / cap;
		result = result + (balls % cap > 0 ? 1 : 0);
		result += (balls % cap > 0 ? 1 : 0);
		System.out.println(result);
*/
	}

}
