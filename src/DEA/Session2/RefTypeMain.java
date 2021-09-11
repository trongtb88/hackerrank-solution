package DEA.Session2;

public class RefTypeMain {
    public static void main(String [] args) {

        Animal dog1 ;
        dog1 = new Animal(1,"Dog B");
        System.out.println(dog1);

        Animal animal1 = new Animal(1,"Dog A");
        Animal animal2 = new Animal(1,"Dog A");

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        int a = 5;
        int b = 5;
        System.out.println(a == b);

        Integer aReference = new Integer(5);
        Integer bReference = new Integer(5);

        System.out.println(aReference == bReference);

        bReference = aReference;

        //Now both are referring to same object
        System.out.println(aReference == bReference);//true
    }

}
