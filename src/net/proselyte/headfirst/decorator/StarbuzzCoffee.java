package net.proselyte.headfirst.decorator;

import net.proselyte.headfirst.decorator.coffee.Espresso;
import net.proselyte.headfirst.decorator.coffee.HouseBlend;
import net.proselyte.headfirst.decorator.condiments.Mocha;
import net.proselyte.headfirst.decorator.condiments.Soy;
import net.proselyte.headfirst.decorator.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " = $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " = $" + houseBlend.cost());
    }
}
