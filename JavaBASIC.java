import javax.swing.text.Caret;

abstract class Car{ 
    // This is our abstract method which we do not need to define and can implement later
    public abstract void drive();

    public void playMusic(){
        System.out.println("Music Playing in Car");
    }
}

class WagonR extends Car{
    public void drive(){
        System.out.println("WagonR is driving");
    }
    public void playMusic(){
        System.out.println("WagonR playing music");
    }

}
public class JavaBASIC {

    

    public static void main(String[] args){

        WagonR wagon = new WagonR();
        wagon.drive();
        wagon.playMusic();
    }
}
