package net.proselyte.headfirst.factory.simple_factory;

public class ClamPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("ClamPizza prepared");
    }

    @Override
    void bake() {
        System.out.println("ClamPizza baked");
    }

    @Override
    void cut() {
        System.out.println("ClamPizza cut");
    }

    @Override
    void box() {
        System.out.println("ClamPizza boxed");
    }
}
