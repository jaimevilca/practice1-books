package com.example.books.model;

public class Book {

    private int id;
    private String title;
    private String resume;
    private String editorial;
    private Integer year;

    public Book(int id, String title, String resume, String editorial, Integer year) {
        this.id = id;
        this.title = title;
        this.resume = resume;
        this.editorial = editorial;
        this.year = year;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTitle() {
        return title;
    }

    public String getResume() {
        return resume;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getId() {
        return id;
    }
}