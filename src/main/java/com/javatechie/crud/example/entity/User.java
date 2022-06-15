package com.javatechie.crud.example.entity;

public class User {

    // Adding user entity class for next feature.
    //just to test commmit msg

    String name ;
    int id;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
