package net.proselyte.headfirst.decorator.condiments;

import net.proselyte.headfirst.decorator.Beverage;
import net.proselyte.headfirst.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
