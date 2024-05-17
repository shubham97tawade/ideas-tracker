package com.shubham.ideastracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Idea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String tag;
    private String description;
    private Date date;

    public Idea(){
        super();
    }

    public Idea(String title, String tag, String description, Date date){
        this.title = title;
        this.tag = tag;
        this.description = description;
        this.date = date;
    }

    @Override
    public String toString(){
        return String.format("Idea[id=%d, title='%s', tag='%s', description='%s', date='%s]", id, title, tag, description, date);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTag() {
        return tag;
    }

    public void setTags(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
