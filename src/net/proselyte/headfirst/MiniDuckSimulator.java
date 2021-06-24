package net.proselyte.headfirst;

import net.proselyte.headfirst.duck.Duck;
import net.proselyte.headfirst.duck.MallardDuck;
import net.proselyte.headfirst.duck.ModelDuck;
import net.proselyte.headfirst.fly.FlyRocketPowered;

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
