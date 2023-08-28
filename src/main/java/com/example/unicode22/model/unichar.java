package com.example.unicode22.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


public class unichar {

    @Id
    private int id;
    private char character;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }
}
