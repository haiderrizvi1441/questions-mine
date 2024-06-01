package RandomClasses;

public class Client {
     
    void printYourData(Employee e){
        e.printMe();
    }
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Arun");

        TrainedEmployee trainedEmployee = new TrainedEmployee(2, "James", "Bihar");

        Client client = new Client();
        client.printYourData(trainedEmployee);

    
    }
}
