package net.proselyte.headfirst.factory.simple_factory;

public class VeggiePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("VeggiePizza prepared");
    }

    @Override
    void bake() {
        System.out.println("VeggiePizza baked");
    }

    @Override
    void cut() {
        System.out.println("VeggiePizza cut");
    }

    @Override
    void box() {
        System.out.println("VeggiePizza boxed");
    }
}
