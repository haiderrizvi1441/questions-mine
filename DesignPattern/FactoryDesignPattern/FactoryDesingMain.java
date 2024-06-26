package DesignPattern.FactoryDesignPattern;

public class FactoryDesingMain {
    

    public static void main(String[] args){

        OperatingSys os1 = OperatingSysFactory.getInstance("linux", "ubuntu", "x86");
        OperatingSys os2 = OperatingSysFactory.getInstance("windows","W10","x32");
        OperatingSys os3 = OperatingSysFactory.getInstance("Macos","Sierra","x66");

        os1.changeDir("/root/");
        os2.changeDir("/D:");
        os3.changeDir("mac");


    }
}
