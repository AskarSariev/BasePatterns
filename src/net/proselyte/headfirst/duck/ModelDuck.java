package net.proselyte.headfirst.duck;

import net.proselyte.headfirst.fly.FlyNoWay;
import net.proselyte.headfirst.quack.Quack;

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
