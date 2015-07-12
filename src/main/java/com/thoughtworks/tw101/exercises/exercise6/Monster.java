package com.thoughtworks.tw101.exercises.exercise6;

public interface Monster {
    void takeDamage(int damage);
    String name();
    int currentHitPoints();
    void reportStatus();
}
