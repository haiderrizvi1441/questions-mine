package DesignPattern.FactoryDesignPattern;

public abstract class OperatingSys {
    
    private String version;

    private String architecture;

    public String  getVersion() {return version;}

    public void setVersion(String version){this.version = version;}

    public String getArchitecture(){return architecture;}

    public void setArchitecture(String architecture){this.architecture = architecture;}


    // Constructors
    public OperatingSys(String version, String architecture){
        this.version = version;
        this.architecture = architecture;
    }


    // ABSTRACT method (will change acc to different implementation)
    public abstract void changeDir(String dir);
    public abstract void remvoeDir(String dir);
}
