package com.hackerearth.sutherland.games.service;

import com.hackerearth.sutherland.games.dao.GameDetailsManagerDao;
import com.hackerearth.sutherland.games.entity.Games;
import com.hackerearth.sutherland.games.model.GameDetailsResponse;
import com.hackerearth.sutherland.games.utils.ResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameDetailsManagerService {

    private Logger logger = LoggerFactory.getLogger(GameDetailsManagerService.class);

    @Autowired
    private GameDetailsManagerDao dao;

    @Autowired
    private ResponseUtils utils;

    public GameDetailsResponse updateGameDetails(Games gameRecord){
        return utils.formResponse( dao.createOrUpdateGameRecord(gameRecord));
    }

    public GameDetailsResponse getAllGames(){
        return utils.formResponse(dao.getAllGames());
    }

    public GameDetailsResponse getGamesByTitle(String gameTitle){
        return utils.formResponse(dao.getAllGamesByTitle(gameTitle));
    }

    public GameDetailsResponse getGamesByPlatform(String platform){
        return utils.formResponse(dao.getAllGamesByPlatform(platform));
    }

    public GameDetailsResponse getGamesByScore(float score){
        return utils.formResponse(dao.getAllGamesByScore(score));
    }

    public GameDetailsResponse getGamesByGenre(String genre){
        return utils.formResponse(dao.getAllGamesByGenre(genre));
    }

    public GameDetailsResponse getGamesByEditorsChoice(String choice){
        return utils.formResponse(dao.getAllGamesByEditorsChoice(choice));
    }

    public GameDetailsResponse getGamesByScoreAndGenre(float score, String genre){
        return utils.formResponse(dao.getAllGamesByScoreAndGenre(score, genre));
    }

    public GameDetailsResponse deleteGameById(int id){
        return utils.formResponse(dao.deleteGameById(id));
    }

    public GameDetailsResponse deleteAllGamesByTitle(String title){
        return utils.formResponse(dao.deleteGamesByTitle(title));
    }

}
