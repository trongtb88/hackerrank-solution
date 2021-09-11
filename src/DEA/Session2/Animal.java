package DEA.Session2;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int id;
    private String name;
    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Name = " + name;
    }

    @Override
    public boolean equals(Object obj) {
        Animal animal = (Animal)obj;
        return this.name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class AnimalBuilder {
    private static Animal buildAnimal(int id, String name) {
        return new Animal(id, name);
    }

    public static void main(String[] args) {
        int id = 1;
        String name = "Pig ";
        Animal animal = buildAnimal(id, name);
        System.out.println(animal);
    }
}

