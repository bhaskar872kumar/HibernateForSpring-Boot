package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Embedded;

@Entity
public class Alien {
    @Id
    private int aid;

    @Embedded
    private AlienName name;

    private String color;

    // Getters and Setters
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public AlienName getName() {  // Correct return type
        return name;
    }

    public void setName(AlienName name) {  // Correct parameter type
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien: " + aid + " " + name.getFname() + " " + name.getMname() + " " + name.getLname() + " " + color;
    }
}
