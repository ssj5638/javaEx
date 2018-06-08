package com.javaex.api.objectclass.ex05;

import java.util.Arrays;

public class Scoreboard implements Cloneable{
	private int scores[];
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	
	public Scoreboard getClone() {
		Scoreboard clone = null;
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
	
	@Override
	public String toString() {
		String output = "Scoreboard(";
		
		for(int i =0; i < scores.length; i++) {
			output += scores[i];
			if(i < scores.length - 1) { // 마지막엔 ',' 안찍을거야
				output += ", ";
			}
		}
		output += ")";
		
		return output;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override	// 깊은 복제
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복제 시도
		Scoreboard clone = (Scoreboard)super.clone();
		// 내부 참조 객체 복제 시도
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}
	
	
}
