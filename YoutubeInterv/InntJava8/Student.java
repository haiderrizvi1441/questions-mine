package YoutubeInterv.InntJava8;

public class Student {
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", departmentName=" + departmentName + ", joinedYear=" + joinedYear + ", rank="
                + rank + "]";
    }
    private String departmentName;
    private int joinedYear;
    private int rank;
    public Student(int id, String firstName, String lastName, int age, String gender, String departmentName,
            int joinedYear, int rank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.departmentName = departmentName;
        this.joinedYear = joinedYear;
        this.rank = rank;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public int getJoinedYear() {
        return joinedYear;
    }
    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    

}
