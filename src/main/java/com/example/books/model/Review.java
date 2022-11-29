package com.example.books.model;


public class Review {

    private int id;
    private String name;
    private String comment;
    private int score;

    public Review(int id, String name, String comment, int score) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}