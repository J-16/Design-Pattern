package Ducks;

import DuckProperties.Flyable;
import DuckProperties.Quackable;
import duck.Duck;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("Looks like real RedHeadDuck");
    }

    @Override
    public void fly() {
        System.out.println("Flyyy...");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
