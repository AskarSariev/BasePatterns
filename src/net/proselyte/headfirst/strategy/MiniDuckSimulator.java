package net.proselyte.headfirst.strategy;

import net.proselyte.headfirst.strategy.duck.Duck;
import net.proselyte.headfirst.strategy.duck.MallardDuck;
import net.proselyte.headfirst.strategy.duck.ModelDuck;
import net.proselyte.headfirst.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("****************************************");
        // Pattern Strategy
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
