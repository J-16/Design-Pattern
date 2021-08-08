package DuckProperties;

import DuckPropertiesInterface.Quackable;

public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
