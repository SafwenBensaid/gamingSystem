/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safwenBensaid
 */

public class TennisGame {

    public static String closedSetsDetails = "";
    public static String gameStaus = "0-0";
    public static String matchScore = "(0-0)";
    public static String matchStaus = "in progress";

    public TennisGame() {
    }
    
    public TennisGame(String closedSetsDetails, String gameStaus, String matchScore, String matchStaus) {
    }
    
    public static String getMatchScore() {
        return matchScore;
    }

    public static void setMatchScore(String matchScore) {
        TennisGame.matchScore = matchScore;
    }

    public static String getMatchStaus() {
        return matchStaus;
    }

    public static void setMatchStaus(String matchStaus) {
        TennisGame.matchStaus = matchStaus;
    }

    public static String getGameStaus() {
        return gameStaus;
    }

    public static void setGameStaus(String gameStaus) {
        TennisGame.gameStaus = gameStaus;
    }

    public static void marquePoint(TennisPlayer tennisPlayer) {
        tennisPlayer.setPoints(tennisPlayer.getPoints() + 1);
    }

    public static void gagnerGame(TennisPlayer winnerPlayer, TennisPlayer loserPlayer) {
        winnerPlayer.setPoints(0);
        loserPlayer.setPoints(0);
        winnerPlayer.setGames(winnerPlayer.getGames() + 1);
    }

    public static void gagnerSet(TennisPlayer winnerPlayer, TennisPlayer loserPlayer, String gainedSetDetails) {
        winnerPlayer.setGames(0);
        loserPlayer.setGames(0);
        winnerPlayer.setSets(winnerPlayer.getSets() + 1);
        closedSetsDetails = gainedSetDetails;
        //if a player wins 3 sets -> player win the match 
        if (winnerPlayer.getSets() == 3) {
            setMatchStaus(winnerPlayer.getName() + " wins the match!");   
        }
    }

    public static void getScore(TennisPlayer Player1, TennisPlayer Player2) {
        int maxGainedSets = Integer.max(Player1.getSets(), Player2.getSets());
        String currentScore = "";
        if (closedSetsDetails.isEmpty()) {
            currentScore = "(" + Player1.getGames() + "-" + Player2.getGames() + ")";
        } else if (maxGainedSets <= 3) {
            currentScore = closedSetsDetails + "(" + Player1.getGames() + "-" + Player2.getGames() + ")"; 
        } 
        int maxGanedGames = Integer.max(Player1.getGames(), Player2.getGames());
        int gamesDiff = Player1.getGames() - Player2.getGames();
        if (maxGanedGames >= 6 && Math.abs(gamesDiff) >= 2) {
            if (gamesDiff > 0) {
                gagnerSet(Player1, Player2, currentScore);
            } else {
                gagnerSet(Player2, Player1, currentScore);
            }
        }
        setMatchScore(currentScore);
    }

    public static void getCurrentGameStatus(TennisPlayer Player1, TennisPlayer Player2) {
        String gameStatus = "";
        int tempGameStatus = 0;
        if (Player1.getPoints() == Player2.getPoints()) {
            switch (Player1.getPoints()) {
                case 0:
                    gameStatus = "0-0";
                    break;
                case 1:
                    gameStatus = "15-15";
                    break;
                case 2:
                    gameStatus = "30-30";
                    break;
                default:
                    gameStatus = "Deuce";
                    break;
            }
        } else if (Player1.getPoints() >= 4 || Player2.getPoints() >= 4) {
            int pointsDiff = Player1.getPoints() - Player2.getPoints();
            if (pointsDiff == 1) {
                gameStatus = "Advantage for " + Player1.getName();
            } else if  (pointsDiff == -1){
                gameStatus = "Advantage for " + Player2.getName();
            }else if (pointsDiff >= 2) {
                gameStatus = Player1.getName()+ " wins the game";
                gagnerGame(Player1, Player2);
            } else {
                gameStatus = Player2.getName()+ " wins the game";
                gagnerGame(Player2, Player1);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempGameStatus = Player1.getPoints();
                } else {
                    gameStatus += "-";
                    tempGameStatus = Player2.getPoints();
                }
                switch (tempGameStatus) {
                    case 0:
                        gameStatus += "0";
                        break;
                    case 1:
                        gameStatus += "15";
                        break;
                    case 2:
                        gameStatus += "30";
                        break;
                    case 3:
                        gameStatus += "40";
                        break;
                }
            }
        }
        setGameStaus(gameStatus);
    }
}
