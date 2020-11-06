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
public class ModernTable implements Table {
    
    @Override
    public void hasLegs() {
        System.out.println("The table has modern legs");
    }
    
    @Override
    public void sitOn() {
        System.out.println("Modern table is useful");
    }
    
}
