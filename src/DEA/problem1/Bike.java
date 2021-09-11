package DEA.problem1;

import java.math.BigDecimal;

public class Bike extends Vehicle {
    public Bike(String name, BigDecimal price) {
        this.setPrice(price);
        this.setName(name);
    }
}
