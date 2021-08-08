package com.company;

import Ducks.MallardDuck;
import Ducks.RedHeadDuck;
import Materials.RubberDuck;
import Materials.decoyDuck;

public class Main {

    public static void main(String[] args) {

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        System.out.println("Red Head Duck can Do all these");
        redHeadDuck.quack();
        redHeadDuck.swim();
        redHeadDuck.fly();

        System.out.println();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        System.out.println("Mallard Duck can Do all these");
        mallardDuck.quack();
        mallardDuck.swim();
        redHeadDuck.fly();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        System.out.println("Rubber Duck can Do all these");
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();

        System.out.println();

        decoyDuck decoyDuck = new decoyDuck();
        decoyDuck.display();
        System.out.println("Decoy Duck can Do all these");
        decoyDuck.quack();
        decoyDuck.swim();
        decoyDuck.fly();

    }
}
