package JavaEightProgramming.ProbStatement;

public class Employee {
    
    private int id;
    private int salary;
    private String name;
    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
