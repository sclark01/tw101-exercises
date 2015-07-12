package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int damage;
    private String name;

    public Troll(int damage, String name){
        this.damage = damage;
        this.name = name;
    }

    @Override
    public void takeDamage(int damage) {
        this.damage += damage / 2;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int currentHitPoints() {
        return damage;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + this.name() + " Hits: " + this.currentHitPoints());
    }
}
