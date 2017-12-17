/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author safwenBensaid
 */
public class TennisPlayer {

    private String name;
    private int points;
    private int games;
    private int sets;

    public TennisPlayer() {
    }

    public TennisPlayer(String name, int points, int games, int sets) {
        this.name = name;
        this.points = points;
        this.games = games;
        this.sets = sets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }
}
