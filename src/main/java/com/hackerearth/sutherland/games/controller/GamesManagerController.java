package com.hackerearth.sutherland.games.controller;

import com.hackerearth.sutherland.games.entity.Games;
import com.hackerearth.sutherland.games.model.GameDetailsResponse;
import com.hackerearth.sutherland.games.service.GameDetailsManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GamesManagerController {
    private Logger logger = LoggerFactory.getLogger(GamesManagerController.class);

    @Autowired
    private GameDetailsManagerService service;

    @RequestMapping(value = "/api/createGame", method = RequestMethod.POST)
    public GameDetailsResponse createGameRecord(
            @RequestBody Games game
    ) {
        return service.updateGameDetails(game);
    }

    @RequestMapping(value = "/api/getGames", method = RequestMethod.GET)
    public GameDetailsResponse getAllGames() {
        return service.getAllGames();
    }

    @RequestMapping(value = "/api/getGamesByTitle", method = RequestMethod.GET)
    public GameDetailsResponse getAllGamesByTitle(
            @RequestParam(required = true, value = "title", defaultValue = "0") String title
    ) {
        return service.getGamesByTitle(title);
    }

    @RequestMapping(value = "/api/getGamesByScore", method = RequestMethod.GET)
    public GameDetailsResponse getAllGamesByScore(
            @RequestParam(required = true, value = "score", defaultValue = "0") float score
    ) {
        return service.getGamesByScore(score);
    }

    @RequestMapping(value = "/api/getGamesByPlatform", method = RequestMethod.GET)
    public GameDetailsResponse getAllGamesByPlatform(
            @RequestParam(required = true, value = "platform", defaultValue = "0") String platform
    ) {
        return service.getGamesByPlatform(platform);
    }

    @RequestMapping(value = "/api/getGamesByGenre", method = RequestMethod.GET)
    public GameDetailsResponse getAllGamesByGenre(
            @RequestParam(required = true, value = "genre", defaultValue = "0") String genre
    ) {
        return service.getGamesByGenre(genre);
    }

    @RequestMapping(value = "/api/getGamesByEditorsChoice", method = RequestMethod.GET)
    public GameDetailsResponse getAllGamesByEditorsChoice(
            @RequestParam(required = true, value = "choice", defaultValue = "0") String choice
    ) {
        return service.getGamesByEditorsChoice(choice);
    }

    @RequestMapping(value = "/api/getGamesByScoreAndGenre", method = RequestMethod.GET)
    public GameDetailsResponse getAllGamesByScoreAndGenre(
            @RequestParam(required = true, value = "score", defaultValue = "0") float score,
            @RequestParam(required = true, value = "genre", defaultValue = "0") String genre
    ) {
        return service.getGamesByScoreAndGenre(score, genre);
    }

    @RequestMapping(value = "/api/updateGame", method = RequestMethod.PUT)
    public GameDetailsResponse updateGameDetails(
            @RequestBody Games game
            ) {
        return service.updateGameDetails(game);
    }

    @RequestMapping(value = "/api/deleteGame/{id}", method = RequestMethod.DELETE)
    public GameDetailsResponse deleteGameRecord(
            @PathVariable(value = "id") int id
    ) {
        return service.deleteGameById(id);
    }

    @RequestMapping(value = "/api/deleteAllGameByTitle", method = RequestMethod.DELETE)
    public GameDetailsResponse deleteGamesByTitle(
            @RequestParam(required = true, value = "title", defaultValue = "0") String title
    ) {
        return service.deleteAllGamesByTitle(title);
    }

}
