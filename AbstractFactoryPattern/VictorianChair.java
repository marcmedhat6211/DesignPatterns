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
public class VictorianChair implements Chair {
    
    @Override
    public void hasLegs() {
        System.out.println("The chair has victorian legs");
    }
    
    @Override
    public void sitOn() {
        System.out.println("Victorian chair is comfy");
    }
    
}
