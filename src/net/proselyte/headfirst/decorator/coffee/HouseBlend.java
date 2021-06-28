package net.proselyte.headfirst.decorator.coffee;

import net.proselyte.headfirst.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
