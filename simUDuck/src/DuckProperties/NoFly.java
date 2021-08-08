package DuckProperties;

import DuckPropertiesInterface.Flyable;

public class NoFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Doesn't Flyyyyyy");
    }
}
