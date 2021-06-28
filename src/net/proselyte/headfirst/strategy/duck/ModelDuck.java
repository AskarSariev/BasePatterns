package net.proselyte.headfirst.strategy.duck;

import net.proselyte.headfirst.strategy.fly.FlyNoWay;
import net.proselyte.headfirst.strategy.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }
}
