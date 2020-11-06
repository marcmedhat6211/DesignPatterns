/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.SingletonPattern;

/**
 *
 * @author marc
 */

/*Singleton pattern is a creational pattern
only one object of a class
has the singleton object globally accessible*/
public class SingletonClass {
    
    //we make it private so that it can not be accessed from outside the class
    private static SingletonClass uniqueInstance = null;
    
    //we make the constructor private so that it cannot be called from outside the class
    private SingletonClass() {
        System.out.println("Hello from the singleton class");
    }
    
    //if the uniqueInstance is equal to null, only then it will create new instance of the class
    public static SingletonClass getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonClass();
        }
        
        return uniqueInstance;
    }
    
}
