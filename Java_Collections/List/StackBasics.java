package interviewquestions.Java_Collections.List;

import java.util.Stack;

public class StackBasics {  // FIRST IN LAST OUT
    public static void main(String[] args){

        // Declaration
        Stack<String> animals = new Stack<>();

        // ADDITION / Push
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Zebra");
        animals.push("Monkey");


        // checking the topmost element / PEEK
        System.out.println(animals.peek());
        
        // DELETION
        System.out.println(animals);
        animals.pop();

        System.out.println(animals);


        
    }
}
