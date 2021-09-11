package DEA.problem1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String name;
    private BigDecimal price;
    List<Person> people = new ArrayList<>();

    public void addObserver(Person person) {
        this.people.add(person);
    }

    public void removeObserver(Person person) {
        this.people.remove(person);
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
        for (Person person : this.people) {
            person.update(this);
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
