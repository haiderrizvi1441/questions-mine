package interviewquestions.Java_Collections.Custom;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class CustomCollection {

    // We will make a custom collection type combining properties as our requirement


    // Here we want to create a student set and add the student with unique roll no;
    // Although set is distinct ,but even if the student will be creeated with same name and roll no , hashset will not consider it as same as we are creating two student objects.

    // We will solve this problem by generating hashcode unqiue not to an oject but to roll no
    // It is done in the student class itself;

    public static void main(String[] args){

        Set<Student> studentset = new LinkedHashSet<>();

        studentset.add(new Student("Anuj", 12));
        studentset.add(new Student("Hector", 2));
        studentset.add(new Student("Gus", 1));
        studentset.add(new Student("Anuj", 12));
        studentset.add(new Student("John", 22));
        studentset.add(new Student("Anuj", 13));

        System.out.println(studentset);

        

        // BEFORE hashcode() and equals() it was taking duplicates student

        // AFTER implementation, it will only store uniqe roll number student allowing same names
        





    }
}
