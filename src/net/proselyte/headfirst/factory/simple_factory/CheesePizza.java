package net.proselyte.headfirst.factory.simple_factory;

public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("CheesePizza prepared");
    }

    @Override
    void bake() {
        System.out.println("CheesePizza baked");
    }

    @Override
    void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    void box() {
        System.out.println("CheesePizza boxed");
    }
}
