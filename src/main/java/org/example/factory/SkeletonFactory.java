package org.example.factory;

import org.example.Enemy;
import org.example.enemies.Skeleton;

public class SkeletonFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Skeleton();
    }
}
