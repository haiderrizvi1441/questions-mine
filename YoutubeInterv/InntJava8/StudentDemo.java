package YoutubeInterv.InntJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> stdList = new ArrayList<Student>();

        stdList.add(new Student(15,"Harish","Rane",34,"male","physics",2013,4));
        stdList.add(new Student(34,"David","Boris",44,"male","maths",2017,1));
        stdList.add(new Student(45,"Areyo","Batista",46,"male","maths",1998,2));
        stdList.add(new Student(67,"Jocelyn","Flores",24,"female","geography",2021,9));
        stdList.add(new Student(29,"Adil","Pradeep",26,"male","computer",2020,5));
        stdList.add(new Student(28,"Abhi","Pratap",45,"male","computer",2017,4));
        stdList.add(new Student(100,"Codine","Mcguire",30,"female","maths",2022,15));
        stdList.add(new Student(101,"Xeres","C",64,"female","geography",1997,56));
        stdList.add(new Student(17,"Emma","Thompson",44,"female","chemistry",2010,7));

        // Students whose name only start with A
        List<Student> aNameStd = stdList.stream().filter(std -> std.getFirstName().startsWith("A")).collect(Collectors.toList());

        // for students , more than age forty, add senior to first name
        List<Student> seniorStd = stdList.stream().map(
            std -> {
                if(std.getAge() > 40){
                    std.setFirstName("Senior "+std.getFirstName());
                }
                return std;
            }
        ).collect(Collectors.toList());

        // for(Student std : seniorStd){
        //     System.out.println(std.toString());
        // }

        // Group students by deparyment name
        Map<String, List<Student>> mathsStd = stdList.stream().collect(Collectors.groupingBy(Student::getDepartmentName));

        // for(Map.Entry<String,List<Student>> student : mathsStd.entrySet()){
        //     System.out.println(student);
        // }

        // Total count students
        int totalStd = (int) stdList.stream().count();
        System.out.println("Total Student: "+ totalStd);

        // Max Age of Student
        int maxAge = stdList.stream().mapToInt(std -> std.getAge()).max().getAsInt();
        System.out.println("Max age of Student: " + maxAge);
        
        // Find all department names
        List<String> stdDepartments = stdList.stream().map(std -> std.getDepartmentName()).distinct().collect(Collectors.toList());
        for(String dpt : stdDepartments){
            System.out.println(dpt);
        }

        // Count of student in each department
        Map<String, Long> countEachDpt = stdList.stream().collect(Collectors.groupingBy(Student::getDepartmentName, Collectors.counting()));
        System.out.println("COUNT MAP: " + countEachDpt);

        // Student ranking b/w 1 and 10
        List<Student> highRankStd = stdList.stream().filter(std -> (std.getRank()<10)).collect(Collectors.toList());
        for(Student student:highRankStd){
            System.out.println(student);
        }

        // Average rank
        Integer x =4;
        
    }
}
