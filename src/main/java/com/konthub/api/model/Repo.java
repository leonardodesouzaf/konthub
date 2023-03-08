package com.konthub.api.model;

public class Repo {
    
    private String name;
    private String owner;
    private String url;
    private String description;

    public Repo(String name, String owner, String url, String description) {
        this.name = name;
        this.owner = owner;
        this.url = url;
        this.description = description;
    }

}
