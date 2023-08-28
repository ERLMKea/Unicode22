package com.example.unicode22.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Unicode {

    @Id
    private int unicode;
    private char charx;
    private String description;

    public int getUnicode() {
        return unicode;
    }

    public char getCharx() {
        return charx;
    }

    public void setCharx(char charx) {
        this.charx = charx;
        this.unicode = charx;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
        this.charx = (char) unicode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
