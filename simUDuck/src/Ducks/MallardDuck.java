package Ducks;

import DuckProperties.Fly;
import DuckProperties.Quack;
import duck.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        super(new Fly(), new Quack());
    }

    public void display(){
        System.out.println("Looks like real MallarDuck");
    }

}
