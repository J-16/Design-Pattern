package DuckProperties;

import DuckPropertiesInterface.Quackable;

public class noQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("No Quack!");
    }
}
