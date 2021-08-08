package Materials;

import DuckProperties.NoFly;
import DuckProperties.noQuack;
import duck.Duck;

public class decoyDuck extends Duck{

    public decoyDuck(){
        super(new NoFly(),new noQuack());
    }

    @Override
    public void display() {
        System.out.println("Looks like decoy Duck");
    }

}
