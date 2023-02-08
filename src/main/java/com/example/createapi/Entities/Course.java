package com.example.createapi.Entities;

public class Course {

    private long id;
    private String titile;
    private String description;

    // making a Constructor
    public Course(long id, String titile, String description) {
        this.id = id;
        this.titile = titile;
        this.description = description;
    }

    // getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // to string method
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", titile='" + titile + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public Course(){
        super();
        // default constructor
    }
}
