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
public class DollarsandPennies {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int amount;
        String a = "dollars";
        String b = "pennies";
        int dollar;
        int penny;
        amount = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter total amount:"));
        // Get the dollar part 
        dollar = amount / 100;
        // Get the penny part
        penny = amount%100;
        if ((dollar >1) && (penny >1))
            JOptionPane.showMessageDialog(f, amount +" is made up of "+dollar+ a+" & "+penny+ b );
        else if(dollar > 1)
            JOptionPane.showMessageDialog(f, amount +" is made up of "+dollar+ a+" & "+penny+" penny");
        else if (penny >1)
            JOptionPane.showMessageDialog(f, amount +" is made up of "+dollar+" dollar & "+penny+ b );
        else
            JOptionPane.showMessageDialog(f, amount +" is made up of "+dollar+ " dollar & "+penny+" penny");
            
        
        
    }
}
