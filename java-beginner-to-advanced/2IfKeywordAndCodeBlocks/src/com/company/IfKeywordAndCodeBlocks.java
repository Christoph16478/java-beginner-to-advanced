package com.company;

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 4000;
	    int levelCompleted = 5;
	    int bonus = 100;

 	    if(score < 5000 && score > 1000){
			System.out.println("Your score is 5000");
		} else if (score < 1000){
			System.out.println("Your score was less than 1000");
		} else {
			System.out.println("This was executed as well.");
		}

		// This whole concept is called "scope"
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		// You can not access variables in the codeblock here outside of it. Recognize the error below.
		// int savedFinalScore = finalScore;

		// Print out a second score on the screen with the following
		// score set to 10000
		// levelCompleted set to 8
		// bonus set to 200
		// But make sure the first printout above still displays as well
		boolean newGameOver = true;
		int newScore = 10000;
		int newLevelCompleted = 8;
		int newBonus = 200;

		if(newGameOver) {
			int finalScore = newScore + (newLevelCompleted * newBonus);
			System.out.println("Your final score was " + finalScore);
		}
    }
}
