package net.proselyte.headfirst.strategy.duck;

import net.proselyte.headfirst.strategy.fly.FlyWithWings;
import net.proselyte.headfirst.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
