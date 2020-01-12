package com.hackerearth.sutherland.games.dao;

import com.hackerearth.sutherland.games.entity.Games;
import com.hackerearth.sutherland.games.model.RepositoryResponse;
import com.hackerearth.sutherland.games.repository.GameDetailsManagerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameDetailsManagerDao {

    private Logger logger = LoggerFactory.getLogger(GameDetailsManagerDao.class);

    @Autowired
    private GameDetailsManagerRepository repository;

    public RepositoryResponse createOrUpdateGameRecord(Games gameRecord){
        RepositoryResponse response = new RepositoryResponse();
        try {
            Games transactionRecord = repository.save(gameRecord);
            response.setCode(200);
            response.setMessage("Success");
            response.setGameRecord(transactionRecord);
        } catch(Exception e){
            response.setCode(500);
            response.setMessage(e.getMessage());
        }
        return response;
    }

    public List<Games> getAllGames(){
        return repository.findAll();
    }

    public List<Games> getAllGamesByTitle(String gameTitle){
        return repository.findByTitle(gameTitle);
    }

    public List<Games> getAllGamesByScore(float score){
        return repository.findByScore(score);
    }

    public List<Games> getAllGamesByPlatform(String platform){
        return repository.findByPlatform(platform);
    }

    public List<Games> getAllGamesByGenre(String genre){
        return repository.findByGenre(genre);
    }

    public List<Games> getAllGamesByEditorsChoice(String choice){
        return repository.findByChoice(choice);
    }

    public List<Games> getAllGamesByScoreAndGenre(float score, String genre){
        return repository.findByScoreAndGenre(score, genre);
    }

    public RepositoryResponse deleteGameById(int id){
        RepositoryResponse response = new RepositoryResponse();

        try {
            repository.deleteById(id);
            response.setCode(200);
            response.setMessage("Success");
        } catch(Exception e){
            response.setCode(500);
            response.setMessage(e.getMessage());
        }
        return response;
    }

    public RepositoryResponse deleteGamesByTitle(String title){
        RepositoryResponse response = new RepositoryResponse();

        try {
            List<Games> gamesList = repository.findByTitle(title);
            for(Games game: gamesList){
                repository.delete(game);
            }
            response.setCode(200);
            response.setMessage("Success");
        } catch(Exception e){
            response.setCode(500);
            response.setMessage(e.getMessage());
        }
        return response;
    }

}
