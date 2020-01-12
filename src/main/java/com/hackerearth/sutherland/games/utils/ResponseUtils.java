package com.hackerearth.sutherland.games.utils;

import com.hackerearth.sutherland.games.entity.Games;
import com.hackerearth.sutherland.games.model.Data;
import com.hackerearth.sutherland.games.model.GameDetailsResponse;
import com.hackerearth.sutherland.games.model.RepositoryResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResponseUtils {

    public GameDetailsResponse formResponse(RepositoryResponse repositoryResponse){
        Data data = new Data();
        GameDetailsResponse response = new GameDetailsResponse();
        response.setCode(repositoryResponse.getCode());
        response.setMessage(repositoryResponse.getMessage());

        if(repositoryResponse.getGameRecord() != null){
            List<Games> gameRecords = new ArrayList<>();
            gameRecords.add(repositoryResponse.getGameRecord());
            data.setGamesList(gameRecords);
        }
        response.setData(data);
        return response;
    }

    public GameDetailsResponse formResponse(List<Games> games){
        Data data = new Data();
        data.setGamesList(games);
        GameDetailsResponse response = new GameDetailsResponse();
        response.setCode(200);
        response.setMessage("Success");
        response.setData(data);
        return response;
    }
}
