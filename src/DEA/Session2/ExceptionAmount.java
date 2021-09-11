package DEA.Session2;

import java.util.Optional;

public class ExceptionAmount {
    private String currency;
    private int amount;

    private Optional<Student> belongToStudent = Optional.empty();

    public ExceptionAmount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;

    }

    public void add(ExceptionAmount that) throws CurrenciesDoNotMatchException {

        if (!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies Don't Match " + this.currency + " & " + that.currency);
        }

        this.amount = this.amount + that.amount;

        Student student = belongToStudent.orElse(new Student(1, "Default Student"));
        System.out.println(student);

//        if (belongToStudent.isPresent()) {
//            Student student = belongToStudent.get();
//            System.out.println(student);
//        }
    }

    public String toString() {
        return amount + " " + currency;
    }
}


class CurrenciesDoNotMatchException extends Exception {
    private String exceptionCode;
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

class ThrowingExceptionRunner {

    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        ExceptionAmount amount1 = new ExceptionAmount("USD", 10);
        ExceptionAmount amount2 = new ExceptionAmount("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);


    }
}

