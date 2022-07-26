package com.creational.simple.factory;

import java.time.LocalDateTime;

public abstract class Post {
    private long id;
    private String title;
    private String content;
    private LocalDateTime createdOn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getPublishOn() {
        return publishOn;
    }

    public void setPublishOn(LocalDateTime publishOn) {
        this.publishOn = publishOn;
    }

    private LocalDateTime publishOn;


}
