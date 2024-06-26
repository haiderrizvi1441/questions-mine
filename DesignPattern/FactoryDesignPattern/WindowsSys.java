package DesignPattern.FactoryDesignPattern;

public class WindowsSys extends OperatingSys {

    public WindowsSys(String version, String architecture) {
        super(version, architecture);

    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Windows Directory Changed");

    }

    @Override
    public void remvoeDir(String dir) {
        System.out.println("Windows Directory Removed");

    }
    

}
