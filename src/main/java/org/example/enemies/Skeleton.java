package org.example.enemies;

import org.example.Enemy;

public class Skeleton implements Enemy {
    @Override
    public void attack() {
        System.out.println("El esqueleto dispara flechas al jugador");
    }

    @Override
    public void jump() {
        System.out.println("El esqueleto salta un metro");
    }

    @Override
    public void move() {
        System.out.println("El esqueleto se aleja del jugador");
    }

    @Override
    public void die() {
        System.out.println("El esqueleto deja caer huesos y flechas");
    }
}
