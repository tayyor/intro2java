/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2v1;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class poundsTokilo {
    public static void main(String args[]){
        double pounds,kilo;
        JFrame f= new JFrame();
        pounds = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter weight in pounds: "));
        kilo = pounds * 0.454;
        JOptionPane.showMessageDialog(f,pounds+" pounds is: "+ kilo+ " Kilograms");
    }
    
}
