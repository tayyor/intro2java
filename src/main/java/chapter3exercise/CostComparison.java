/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3exercise;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class CostComparison {
   public static void main(String args[]){
       JFrame f = new JFrame();
       double w1,p1,w2,p2,cost1,cost2;
       w1 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter weight for package 1:"));
       p1 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter price for package 1:"));
       w2 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter weight for package 2:"));
       p2 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter price for package 2:"));
       
        cost1 = p1/w1;
        cost2 = p2/w2;
        if (cost1 > cost2)
            JOptionPane.showMessageDialog(f,"package 2 has a better price");
        else if(cost1 == cost2)
            JOptionPane.showMessageDialog(f,"Packages are of the same price" );
        else
            JOptionPane.showMessageDialog(f, " Package 1 has a better price");
   }
}