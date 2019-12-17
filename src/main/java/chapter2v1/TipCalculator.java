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
public class TipCalculator {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double subTotal,gratuityRate,gratuity,total,value;
        subTotal = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter amount for subtotal: "));
        value = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter gratuity rate: "));
            gratuityRate = value/100;
         gratuity= subTotal*gratuityRate;
         total = gratuity + subTotal;
         JOptionPane.showMessageDialog(f,"Your gratuity is: "+ gratuity + "\n"+"Total amount: "+total);
    }
}
