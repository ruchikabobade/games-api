package com.hackerearth.sutherland.games.model;


import com.hackerearth.sutherland.games.entity.Games;

public class RepositoryResponse {
    private int code = 0;
    private String message = "";
    private Games game = null;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Games getGameRecord() {
        return game;
    }

    public void setGameRecord(Games game) {
        this.game = game;
    }
}
