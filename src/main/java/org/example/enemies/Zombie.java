package org.example.enemies;

import org.example.Enemy;

public class Zombie implements Enemy {
    @Override
    public void attack() {
        System.out.println("El zombie ataca mordiendo al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El zombie salta un metro");
    }

    @Override
    public void move() {
        System.out.println("El zombie camina hacia el jugador");
    }

    @Override
    public void die() {
        System.out.println("El zombie deja caer carne podrida");
    }
}
