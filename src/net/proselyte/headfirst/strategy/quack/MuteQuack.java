package net.proselyte.headfirst.strategy.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence!");
    }
}
