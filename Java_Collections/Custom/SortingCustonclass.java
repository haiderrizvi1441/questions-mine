package interviewquestions.Java_Collections.Custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingCustonclass {
    

    // A custom class sorting example( Roll no and name)
    public static void main(String[] args){

        List<Student> studentlist = new ArrayList<>();
        
        studentlist.add(new Student("Anuj", 2));
        studentlist.add(new Student("John", 23));
        studentlist.add(new Student("Bruce", 12));
        studentlist.add(new Student("Clark", 46));
        studentlist.add(new Student("Toby", 19));

        System.out.println(studentlist);

        // SORTING
    /*  By Defeaut it cannot be sorted by using sort implementation of Collection Class
     as it the object class(Student) has no comparison factor decided
     
     We will solve it by imlementing comparrator in Stuedent class as below
      roll number of one student should be different from other student in order to sort
      
      */
        
        Collections.sort(studentlist);  
        System.out.println(studentlist);      

        System.out.println();
        
        for(int i=0 ; i<studentlist.size() ; i++){

            System.out.println(studentlist.get(i));

        }

        // We will create new comparator for name comarison in student as the implemented class can compare with only one property at once
        
        Collections.sort(studentlist, new Comparator<Student>() {

            @Override
            public int compare(Student s1,Student s2){
                // Easy lambda implementation of the same
                // Collections.sort(list, (s1,s2) -> s1.name.compareTo(s2.name));
        
                return s1.name.compareTo(s2.name);
            }
            
        });

        System.out.println("Sorted by name");
        System.out.println(studentlist);
        

    }
}
