/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.AbstractFactoryPattern;

/**
 *
 * @author marc
 */
public class ModernChair implements Chair {
    
    @Override
    public void hasLegs() {
        System.out.println("The chair has modern legs");
    }
    
    @Override
    public void sitOn() {
        System.out.println("modern chair is comfy");
    }
    
}
