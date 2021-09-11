package DEA.Session2;

public class StringMain {
    public static void main(String [] args) {
        String str = "Hello from VEF";

        System.out.println(str.charAt(0));

        System.out.println(str.substring(11));
        System.out.println(str.substring(0, 5));

        System.out.println(str.indexOf("VEF"));

        System.out.println( str.equalsIgnoreCase("hello from vef"));

        String str3 = "value1";
        str3.concat("value2");
        System.out.println(str3); //value1
        str.toLowerCase();
        str.toUpperCase();

        Integer ten = new Integer(10);
        System.out.println(ten++);
        System.out.println(ten);

    }
}
