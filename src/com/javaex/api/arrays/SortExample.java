package com.javaex.api.arrays;

import java.util.Arrays;

public class SortExample {

	public static void main(String[] args) {
		int[] scores = {89, 20, 55, 81, 90, 77, 41};
		System.out.println(Arrays.toString(scores));
		
		Arrays.sort(scores); 
		System.out.println(Arrays.toString(scores));

	}

}
