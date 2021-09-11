package DEA.problem1;

import java.math.BigDecimal;

public class Car extends Vehicle {
    public Car(String name, BigDecimal price) {
        this.setPrice(price);
        this.setName(name);
    }
}
