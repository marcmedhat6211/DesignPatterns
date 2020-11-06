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
public abstract class Pasta {
    public final void open() {
        System.out.println("Open the pasta");
    }
    
    public final void put() {
        System.out.println("Put the pasta in the pan");
    }
    
    public abstract void addSauce();
    
    public final void boil() {
        System.out.println("Boil the pasta");
    }
    
    public final void eat() {
        System.out.println("Eat the pasta");
    }
    
    public void steps() {
        this.open();
        this.put();
        this.addSauce();
        this.boil();
        this.eat();
    }
}
