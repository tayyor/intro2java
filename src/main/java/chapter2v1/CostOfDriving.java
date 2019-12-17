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
public class CostOfDriving {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double distance, efficency,price, cost;
        
        distance = Double.parseDouble(JOptionPane.showInputDialog(f,"Distance: "));
        efficency = Double.parseDouble(JOptionPane.showInputDialog(f,"fuel efficiency: "));
        price = Double.parseDouble(JOptionPane.showInputDialog(f,"cost of feul: "));
        
        cost = (distance/efficency)*price;
        JOptionPane.showMessageDialog(f, " The cost of driving is :"+ cost);
        
    }
}
