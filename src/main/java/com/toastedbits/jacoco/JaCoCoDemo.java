package com.toastedbits.jacoco;

public class JaCoCoDemo {
	private static final int ANSWER = 42;
	private static final int WRONG_ANSWER = 314159;
	
	public int calculateAnswer(String question) {
		if(question.contains("life")) {
			return ANSWER;
		}
		else {
			return WRONG_ANSWER;
		}
	}
}