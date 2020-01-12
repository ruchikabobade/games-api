package com.hackerearth.sutherland.games.entity;

import javax.persistence.*;

@Entity
@Table(name = "GAMES")
public class Games {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PLATFORM")
    private String platform;

    @Column(name = "SCORE")
    private float score;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "EDITORS_CHOICE")
    private String choice;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public float getScore() {
        return score;
    }

    public String getChoice() {
        return choice;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

