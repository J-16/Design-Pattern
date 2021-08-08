package Materials;

import DuckProperties.Flyable;
import DuckProperties.Quackable;
import duck.Duck;

public class RubberDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Looks like Rubber Duck");
    }

    public void quack() {
        System.out.println("Doesn't quack");
    }

    @Override
    public void fly() {
        System.out.println("Doesn't Flyyyyy...");
    }
}
