package DesignPattern.SingletonDesginPattern;

import java.io.Serializable;

public class LazySingleton implements Serializable{
    
    // To make sure , instance is not created as soon as class is defined
    private static LazySingleton instance = null;

    // Private constructor (mandatory to Singleton )
    private LazySingleton(){

    }
    /// However it is not multithread safe as many threads can access menthod getInstance() to create thread , HENCE we create MultiThreadedSingleton
    public static LazySingleton getInstance(){
        // IF no instance then only create 1 
        if(instance == null){
            instance = new LazySingleton();
        }

        // If already 1 , then return that
        return instance;
    }


}
