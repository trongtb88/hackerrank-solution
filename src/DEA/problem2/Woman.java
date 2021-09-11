package DEA.problem2;

import java.util.Comparator;
import java.util.Random;

public class Woman implements Comparable<Woman> {

    private Integer age;
    public Woman(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + age;
        return hash;
    }

    @Override
    public boolean equals(Object woman) {
        return this.age == ((Woman)woman).age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Woman o) {
        return this.getAge().compareTo(o.getAge());
    }
}
