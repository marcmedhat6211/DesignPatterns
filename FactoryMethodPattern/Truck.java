/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.FactoryMethodPattern;

/**
 *
 * @author marc
 */
public class Truck implements Transport {
    
    @Override
    public void deliver() {
        System.out.println("Deliver on road");
    }
    
}