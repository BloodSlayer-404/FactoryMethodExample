package org.example.factory;

import org.example.Enemy;
import org.example.enemies.Spider;

public class SpiderFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Spider();
    }
}
