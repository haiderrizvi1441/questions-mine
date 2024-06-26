package DesignPattern.FactoryDesignPattern;

public class OperatingSysFactory {
    
    // Private Constructor bcoz Factory object should not be created
    private OperatingSysFactory(){

    }

    
    // Factory will be accessed using below getInstace method 
    public static OperatingSys getInstance(String type, String version, String architecture){

        switch(type){
            case "linux":
                return new LinuxSys(version, architecture);

            case "windows":
                return new WindowsSys(version, architecture);
            
            default:
                throw new IllegalArgumentException("OS NOT SUPPORTED");
        }

    }


    // Creating object 
    OperatingSys operatingSys1 = OperatingSysFactory.getInstance("windows", "windows7", "x86");
    

}
