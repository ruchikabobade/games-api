package com.hackerearth.sutherland.games.repository;

import com.hackerearth.sutherland.games.entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameDetailsManagerRepository extends JpaRepository<Games, Integer> {

    public List<Games> findByTitle(@Param("title") String title);
    public List<Games> findByScore(@Param("score") float score);
    public List<Games> findByPlatform(@Param("platform") String platform);
    public List<Games> findByGenre(@Param("genre") String genre);
    public List<Games> findByChoice(@Param("choice") String choice);
    public List<Games> findByScoreAndGenre(@Param("score") float score,@Param("genre") String genre );


}
