package RandomClasses;

public class Employee {
    
    private long id;
    private String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printMe(){
        System.out.println("my employee id is " + this.id + " and my name is " +this.name);
    }


}
