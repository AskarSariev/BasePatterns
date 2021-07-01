package net.proselyte.headfirst.factory.simple_factory;

public class PepperoniPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("PepperoniPizza prepared");
    }

    @Override
    void bake() {
        System.out.println("PepperoniPizza baked");
    }

    @Override
    void cut() {
        System.out.println("PepperoniPizza cut");
    }

    @Override
    void box() {
        System.out.println("PepperoniPizza boxed");
    }
}
