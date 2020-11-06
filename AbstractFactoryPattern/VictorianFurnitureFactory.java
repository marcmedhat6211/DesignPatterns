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
public class VictorianFurnitureFactory implements FurnitureFactory {
    
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
    
    @Override
    public Table createTable() {
        return new VictorianTable();
    }
    
}
