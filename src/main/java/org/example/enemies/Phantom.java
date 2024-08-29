package org.example.enemies;

import org.example.Enemy;

public class Phantom implements Enemy {
    @Override
    public void attack() {
        System.out.println("El fantasma ataca cayendo en picada hacia el jugador");
    }

    @Override
    public void jump() {
        System.out.println("El fantasma sube hacia el cielo");
    }

    @Override
    public void move() {
        System.out.println("El fantasma vuela");
    }

    @Override
    public void die() {
        System.out.println("El fantasma deja caer su membrana");
    }
}
