package com.TicTacToe.Models;
import java.util.ArrayList;
import java.util.List;
public class Board {

    private List<List<cell>> board;

    public Board(int dimension){
        this.board = new ArrayList<>();
        for(int i=0; i<dimension; i++){
            this.board.add(new ArrayList<>());
            for (int j=0; j<dimension; j++){
                this.board.get(i).add(new Cell(i,j));
            }
        }
    }


    public List<List<cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<cell>> board) {
        this.board = board;
    }


}
