package YoutubeInterv.InntJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDemo {
    


    public static void main(String[] args){

        List<Employee> empList = new ArrayList<Employee>();


        empList.add(new Employee(1, 1000));
        empList.add(new Employee(2, 5000));
        empList.add(new Employee(3, 50000));
        empList.add(new Employee(4, 20000));
        empList.add(new Employee(6, 2100));
        empList.add(new Employee(7, 15000));

        // Return employee list sorted with asc salary
        List<Employee> newList = empList.stream().sorted((o1,o2) -> (o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
        

        // Fetch top 3 salaried employees : LIMIT method
        List<Employee> topThree = empList.stream().sorted((o1,o2) -> (o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList());
      

        // Fetch all the employee whose salary is less than 3rd highest salary : SKIP method
        List<Employee> otherThanTopThree = empList.stream().sorted((o1,o2) -> (o2.getSalary()-o1.getSalary())).skip(3).collect(Collectors.toList());
        for(Employee emp : otherThanTopThree){
            System.out.println(emp.toString());
        }   


        

    }
}
