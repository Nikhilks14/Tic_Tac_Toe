package com.TicTacToe.exceptions;

public class InvalidPlayersSymbolException extends Exception {
    InvalidPlayersSymbolException(String message) {
        super(message);
    }
}