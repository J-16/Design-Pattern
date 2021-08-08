package duck;

public abstract class Duck {

    //QUACK AND FLY ARE MOVED TO INTERFACE AS NOT ALL DUCKS QUACKS AND FLIES.

    public void swim(){
        System.out.println("Swimming");
    }
    public abstract void display();
}
