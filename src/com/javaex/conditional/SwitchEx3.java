package com.javaex.conditional;

public class SwitchEx3 {
	public static void main (String[] args) {
		
		String day = "Birthday";
		String act;
		
		switch(day) {
		case "Sunday":
			act = "휴식";
			break;
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			act = "열공";
			break;
		case "Friday":
			act = "열공 후 불금";
			break;
		case "Saturday":
			act = "방전";
			break;
		default:
			act = "여긴 어디?";
		}
		System.out.println(act);
		
	}
}
