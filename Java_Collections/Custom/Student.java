package interviewquestions.Java_Collections.Custom;
// a custom clas should implement Comparable for it to be sorted or if comparator is to be used
public class Student implements Comparable<Student>{

    
    
    String name;
    int rollno;


    // Constructor
    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollno;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollno != other.rollno)
            return false;
        return true;
    }


    @Override
    public int compareTo(Student that) {
        
        return this.rollno - that.rollno;
    }


    


    


}
