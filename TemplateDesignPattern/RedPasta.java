/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.TemplateDesignPattern;

/**
 *
 * @author marc
 */
public class RedPasta extends Pasta {
    
    public RedPasta() {
        super.steps();
    }
    
    @Override
    public void addSauce() {
        System.out.println("Put Red Sauce");
    }
    
}
