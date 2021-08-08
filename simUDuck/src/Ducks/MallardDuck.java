package Ducks;

import DuckProperties.Flyable;
import DuckProperties.Quackable;
import duck.Duck;

public class MallardDuck extends Duck implements Flyable, Quackable {

    public void display(){
        System.out.println("Looks like real MallarDuck");
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
