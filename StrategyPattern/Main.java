/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.StrategyPattern;

/**
 *
 * @author marc
 */
public class Main {
    
    public static void main(String[] args) {
        Item phone = new Item("Samsung s", 100);
        Item headphone = new Item("Bose T", 100);
        Cart cart = new Cart();
        cart.createCart(true, false, phone, headphone);
        System.out.println(cart.getTotal());
    }
       
}
