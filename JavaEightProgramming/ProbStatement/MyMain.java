package JavaEightProgramming.ProbStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyMain {
    
    public static void main(String[] args){
        List<Employee> empList = Arrays.asList(
            new Employee(1,15000,"David"),
            new Employee(2,2000,"Varun"),
            new Employee(6,4500,"Alfred"),
            new Employee(19, 5000, "Dominic"),
            new Employee(15,6700,"Dwayne")
        );

        // // Print employees with employee id > 6;
        // List<Employee> resEmployee = empList.stream().filter(emp -> emp.getId()>6).collect(Collectors.toList());
        // System.out.println(resEmployee);

        // Test Code
        List<List<Integer>> my_matrix = new ArrayList<>();
        for(int i=0;i<3;i++){
            List<Integer> row_matrix = new ArrayList<>();
            for(int j=0;j<3;j++){
                row_matrix.add(i*3 +j +1);
            }
            my_matrix.add(row_matrix);
        }
        System.out.println(my_matrix.toString());
        System.out.println(my_matrix.size());
        // Diagonal Difference
        


    }

}
