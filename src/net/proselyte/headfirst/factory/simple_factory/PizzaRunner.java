package net.proselyte.headfirst.factory.simple_factory;

public class PizzaRunner {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        simplePizzaFactory.createPizza("cheese");

        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");
    }
}
