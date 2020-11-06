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
public class WhitePasta extends Pasta {
    
    public WhitePasta() {
        super.steps();
    }
    
    @Override
    public void addSauce() {
        System.out.println("Add White Sauce");
    }
    
}
