package DuckProperties;

import DuckPropertiesInterface.Flyable;

public class Fly implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flyyyyyy");
    }
}
