package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster{

    private int damage;
    private String name;

    public Orc(int damage, String name) {
        this.damage = damage;
        this.name = name;
    }

    @Override
    public void takeDamage(int damage) {
        this.damage += damage;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + this.name + " Hits: " + this.damage);
    }
}
