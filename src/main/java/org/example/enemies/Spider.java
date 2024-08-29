package org.example.enemies;

import org.example.Enemy;

public class Spider implements Enemy {
    @Override
    public void attack() {
        System.out.println("La araña ataca envenenando al jugador");
    }

    @Override
    public void jump() {
        System.out.println("La araña escala el obstaculo");
    }

    @Override
    public void move() {
        System.out.println("La araña corre con sus 8 patas hacia el jugador");
    }

    @Override
    public void die() {
        System.out.println("La araña deja caer hilo ");
    }
}
