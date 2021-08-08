package duck;

import DuckPropertiesInterface.Flyable;
import DuckPropertiesInterface.Quackable;

public abstract class Duck {

    //QUACK AND FLY ARE MOVED TO INTERFACE AS NOT ALL DUCKS QUACKS AND FLIES.
    Flyable flyable;
    Quackable quackable;

    public Duck(){ }

    public Duck(Flyable flyable, Quackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void fly(){
        flyable.fly();
    }

    public void quack(){
        quackable.quack();
    }

    public abstract void display();
}
