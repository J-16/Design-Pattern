package Materials;

import DuckProperties.Flyable;
import DuckProperties.Quackable;
import duck.Duck;

public class decoyDuck extends Duck implements Quackable, Flyable {

    @Override
    public void display() {
        System.out.println("Looks like decoy Duck");
    }

    public void quack() {
        System.out.println("Doesn't quack");
    }

    @Override
    public void fly() {
        System.out.println("Doesn't Fly");
    }
}
