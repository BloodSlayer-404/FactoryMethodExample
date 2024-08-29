package org.example.factory;

import org.example.Enemy;
import org.example.enemies.Zombie;

public class ZombieFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Zombie();
    }
}
