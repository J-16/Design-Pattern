package Ducks;

import DuckProperties.Fly;
import DuckProperties.Quack;
import duck.Duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        super(new Fly(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Looks like real RedHeadDuck");
    }
}
