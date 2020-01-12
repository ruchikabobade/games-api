package com.hackerearth.sutherland.games.model;


import com.hackerearth.sutherland.games.entity.Games;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<Games> gamesList = new ArrayList<>();


    public void setGamesList(List<Games> gamesList) {
        this.gamesList = gamesList;
    }

    public List<Games> getGamesList() {
        return gamesList;
    }
}
