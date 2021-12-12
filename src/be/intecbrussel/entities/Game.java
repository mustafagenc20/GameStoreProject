package be.intecbrussel.entities;

public class Game implements Entity{

    private int gameId;
    private String nameOfGame;
    private double unitPrice;

    public Game() {
    }

    public Game(int gameId, String nameOfGame, double unitPrice) {
        this.gameId = gameId;
        this.nameOfGame = nameOfGame;
        this.unitPrice = unitPrice;
    }

    public int getGameId() {
        return gameId;
    }

    public Game setGameId(int gameId) {
        this.gameId = gameId;
        return this;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public Game setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
        return this;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Game setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
}
