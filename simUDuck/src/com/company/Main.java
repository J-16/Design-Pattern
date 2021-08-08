package com.company;

import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Materials.RubberDuck;
import Materials.decoyDuck;

public class Main {

    public static void main(String[] args) {

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.fly();

        System.out.println();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
        redHeadDuck.fly();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();

        System.out.println();
        decoyDuck decoyDuck = new decoyDuck();
        decoyDuck.display();
        decoyDuck.quack();
        decoyDuck.swim();
        decoyDuck.fly();

    }
}
