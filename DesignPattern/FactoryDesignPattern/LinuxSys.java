package DesignPattern.FactoryDesignPattern;

public class LinuxSys extends OperatingSys {

    public LinuxSys(String version, String architecture) {
        super(version, architecture);

    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Linux Directory is changed");
    }

    @Override
    public void remvoeDir(String dir) {
        System.out.println("Linux Directory removed");
    }
    

}
