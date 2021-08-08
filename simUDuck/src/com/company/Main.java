package com.company;

import Ducks.MallardDuck;
import Ducks.RedHeadDuck;

public class Main {

    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.swim();

        System.out.println();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.quack();
        mallardDuck.swim();
    }
}
