/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;
//import designpatterns.TemplateDesignPattern.Pasta;
import designpatterns.TemplateDesignPattern.RedPasta;
import designpatterns.TemplateDesignPattern.WhitePasta;
/**
 *
 * @author marc
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WhitePasta whitePasta = new WhitePasta();
        System.out.println(whitePasta);
        System.out.println("\n As for the red pasta: ");
        RedPasta redPasta = new RedPasta();
        System.out.println(redPasta);
    }
    
}
