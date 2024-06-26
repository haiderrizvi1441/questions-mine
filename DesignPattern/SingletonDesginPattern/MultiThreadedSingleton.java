package DesignPattern.SingletonDesginPattern;

public class MultiThreadedSingleton {
    
    // This only creates class when needed.
    private static MultiThreadedSingleton instance = null;
    
    // private constuctor
    private MultiThreadedSingleton(){

    }
    // method to create 1 instance 
    public static MultiThreadedSingleton getInstance(){

        if(instance == null){
            // class level locking to prevent race condtion
            // Only one thread can access it 
            synchronized(MultiThreadedSingleton.class){
                // Second null check is when another thread access it and instance is already created it will directly return instance;

                if(instance==null){
                    instance = new MultiThreadedSingleton();
                }
            }
        }
        return instance;

    }


    
}
