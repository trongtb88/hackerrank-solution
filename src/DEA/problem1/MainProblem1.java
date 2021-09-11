package DEA.problem1;

import java.math.BigDecimal;

public class MainProblem1 {
    public static void main(String [] args) {
        //Vehicle vehicle = new Bike("Bike 1", new BigDecimal(1000.45));
        Vehicle vehicle2 = new Bike("Bike 1", BigDecimal.valueOf(1000.45));
        Vehicle car = new Car("Kia Sorento", BigDecimal.valueOf(100000.45));

        Person student = new Student();
        student.bookMark(vehicle2);
        student.bookMark(car);
        vehicle2.setPrice( BigDecimal.valueOf(3000.45));
        vehicle2.setPrice( BigDecimal.valueOf(6000.45));
        student.unBookMark(vehicle2);
        vehicle2.setPrice( BigDecimal.valueOf(9000.45));
        car.setPrice(BigDecimal.valueOf(800000));
    }
}
