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
public class EmployeeDiscount implements DiscountStrategy {
    
    @Override
    public double getDiscountRate() {
        return .8;
    }
    
}
