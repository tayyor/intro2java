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
public class FInApp {
    public static void main(String args[]){
        JFrame f= new JFrame();
        double amount , IntrestRate , annualIR;
        
        amount = Double.parseDouble (JOptionPane.showInputDialog(f,"Enter amount: "));
        annualIR= Double.parseDouble(JOptionPane.showInputDialog(f,"Enter annual intrest rate: "));
        
        IntrestRate = amount * (annualIR/1200);
        JOptionPane.showMessageDialog(f,"The intrest rate is: "+IntrestRate);
    }
}
