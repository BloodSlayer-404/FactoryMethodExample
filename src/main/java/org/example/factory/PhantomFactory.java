package org.example.factory;

import org.example.Enemy;
import org.example.enemies.Phantom;

public class PhantomFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Phantom();
    }
}
