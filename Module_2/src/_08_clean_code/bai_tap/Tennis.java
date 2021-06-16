package _08_clean_code.bai_tap;

public class Tennis {
    public static String resultScore = "";

    public static String getScore(String playerOne, String playerTwo, int scoreOne, int scoreTwo) {
        if (scoreOne == scoreTwo) {
            equalScore(scoreOne);
        } else if (scoreOne >= 4 || scoreTwo >= 4) {
            finishMatch(scoreOne, scoreTwo);
        } else {
            inMatch(scoreOne, scoreTwo);
        }
        return resultScore;
    }

    public static void equalScore(int scorePoint) {
        switch (scorePoint) {
            case 0:
                resultScore = "Love-All";
                break;
            case 1:
                resultScore = "Fifteen-All";
                break;
            case 2:
                resultScore = "Thirty-All";
                break;
            case 3:
                resultScore = "Forty-All";
                break;
            default:
                resultScore = "Deuce";
                break;
        }
    }

    public static void finishMatch(int scoreOne, int scoreTwo) {
        int minusResult = scoreOne - scoreTwo;
        switch (minusResult){
            case 1:
                resultScore = "Advantage player1";
                break;
            case -1:
                resultScore = "Advantage player2";
                break;
            case 2,3,4:
                resultScore = "Win for player1";
                break;
            case -2,-3,-4:
                resultScore = "Win for player2";
                break;
        }
    }

    public static void inMatch(int scoreOne, int scoreTwo) {
        int point = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) point = scoreOne;
            else {
                resultScore += "-";
                point = scoreTwo;
            }
            switch (point) {
                case 0:
                    resultScore += "Love";
                    break;
                case 1:
                    resultScore += "Fifteen";
                    break;
                case 2:
                    resultScore += "Thirty";
                    break;
                case 3:
                    resultScore += "Forty";
                    break;
            }
        }
    }

}


