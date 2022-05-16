package _08_clean_code_refactoring.exercise;

public class TennisGame {
    public static final int ADVANTAGE1 = 1;
    public static final int ADVANTAGE2 = -1;
    public static final int WINCONDITION = 2;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {

        String score = "";
        if (scorePlayer1 == scorePlayer2) {
            score = checkCondition1(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = checkCondition2(scorePlayer1, scorePlayer2);
        } else {
            score = checkCondition3(scorePlayer1, scorePlayer2);
        }
        return score;
    }

    public static String checkCondition1(int scorePlayer1) {

        String score = "";
        switch (scorePlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String checkCondition2(int scorePlayer1, int scorePlayer2) {
        String score = "";
        int result = scorePlayer1 - scorePlayer2;
        if (result == ADVANTAGE1) {
            score = "Advantage player1";
        } else if (result == ADVANTAGE2) {
            score = "Advantage player2";
        } else if (result >= WINCONDITION) {
            score = "Win for player1";
        } else
            score = "Win for player2";

        return score;
    }

    public static String checkCondition3(int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1)
                tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}