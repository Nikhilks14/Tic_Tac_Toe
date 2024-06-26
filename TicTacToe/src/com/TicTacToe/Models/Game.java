package com.TicTacToe.Models;

import java.util.List;
public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }


    // We need use Builder patter to build the game ----->>>>>>>>>

    public static class Builder{
        //private Board board;
        //private GameStatus gameStatus;
        //private int nextPlayerIndex;

        private  int dimension;
        private List<Player> players;

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }


    }







}