package org.example;

import org.example.factory.*;

public class Main {
    public static void main(String[] args) {
        EnemyFactory factory;
        Enemy enemy;

        factory = new ZombieFactory();
        enemy = factory.createEnemy();

        enemy.attack();
        enemy.jump();
        enemy.move();
        enemy.die();

        System.out.println("\n");
        factory = new SkeletonFactory();
        enemy = factory.createEnemy();

        enemy.attack();
        enemy.jump();
        enemy.move();
        enemy.die();

        System.out.println("\n");
        factory = new SpiderFactory();
        enemy = factory.createEnemy();

        enemy.attack();
        enemy.jump();
        enemy.move();
        enemy.die();

        System.out.println("\n");
        factory = new PhantomFactory();
        enemy = factory.createEnemy();

        enemy.attack();
        enemy.jump();
        enemy.move();
        enemy.die();

    }
}