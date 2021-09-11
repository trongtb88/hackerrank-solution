package DEA.Session2;

import java.util.*;

public class CollectionMain {

    public static void main(String [] args) {
        Student student1 = new Student(100, "A");
        Student student2 = new Student(2, "B");
        Student student3 = new Student(3, "C");
        Student student4 = new Student(3, "C");


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        //Collections.sort(students);

        printStudents(students);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

        // Why hashset still have 4 elements
        //printStudents(studentSet);


    }

    private static <T> void  printStudents(Collection <T> collection) {
        collection.forEach(x -> {
            Student student = (Student)x;
            System.out.println(student);
        });
    }


}
