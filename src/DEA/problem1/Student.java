package DEA.problem1;

import java.util.ArrayList;
import java.util.List;

public class Student implements Person {
    private List<Vehicle> list = new ArrayList<>();
    @Override
    public void update(Vehicle vehicle) {
        System.out.println("Change price of Vehicle " + vehicle.getName() + " to " + vehicle.getPrice());
    }

    @Override
    public void bookMark(Vehicle vehicle) {
        System.out.println("Student bookmark vehicle " + vehicle.getName() );
        list.add(vehicle);
        vehicle.addObserver(this);
    }

    @Override
    public void unBookMark(Vehicle vehicle) {
        System.out.println("Student un-bookmark vehicle " + vehicle.getName() );
        list.remove(vehicle);
        vehicle.removeObserver(this);
    }
}
