package Materials;

import DuckProperties.NoFly;
import DuckProperties.noQuack;
import DuckPropertiesInterface.Flyable;
import DuckPropertiesInterface.Quackable;
import duck.Duck;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super(new NoFly(), new noQuack());
    }

    @Override
    public void display() {
        System.out.println("Looks like Rubber Duck");
    }

}
