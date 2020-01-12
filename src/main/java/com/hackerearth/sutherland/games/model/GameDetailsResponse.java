package com.hackerearth.sutherland.games.model;

public class GameDetailsResponse {

    private int code = 0;
    private String message = "";
    private Data data = new Data();

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
