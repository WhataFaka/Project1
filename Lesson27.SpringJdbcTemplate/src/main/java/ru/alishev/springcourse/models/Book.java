package ru.alishev.springcourse.models;

import javax.validation.constraints.*;

public class Book {
    private int bookId;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    private Integer personId;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 60, message = "Name should be between 2 and 30 characters")
    private String name;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String author;

    @Min(value = 1800, message = "Min year 1800")
    @Max(value = 2022, message = "Max year 2022")
    private int year;

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(int bookId, String name, String author, int year) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
