/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.StrategyPattern;
import java.util.*;
/**
 *
 * @author marc
 */
public class Cart {
    private List<Item> items = new ArrayList<>();
    //Composite relationship between cart and Discount Strategy
    private DiscountStrategy discountStrategy;
    
    public List<Item> getItems() {
        return this.items;
    }
    
    public DiscountStrategy getDiscountStrategy() {
        return this.discountStrategy;
    }
    
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
//    public void setItems(Item... items) {
//        for(Item item: items) {
//            this.items.add(item);
//        }
//    }
    
    public double getTotal() {
        double total = 0;
        
        for(Item item: items) {
            total += item.getPrice();
        }
        
        total *= discountStrategy.getDiscountRate();
        return total;
    }
    
    //I think it's better to use the factory pattern here + Setters and Getters
    public Cart createCart(boolean isMember, boolean isEmployee, Item... items) {
        Cart cart = new Cart();        
        List<Item> itemList = new ArrayList<>();
        for(Item item: items) {
            itemList.add(item);
        }
        cart.items = itemList;
        
        if(isEmployee) {
            cart.setDiscountStrategy(new EmployeeDiscount());
        } else if(isMember) {
            cart.setDiscountStrategy(new MemberDiscount());
        } else {
            cart.setDiscountStrategy(new GuestDiscount());
        }
        
        return cart;
    }
}
