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
public class MonetaryUnits {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int amount, dollars,cents;
        
        amount = Integer.parseInt(JOptionPane.showInputDialog(f,"AMOUNT: "));
        dollars = amount/100;
        cents = amount % 100;
        JOptionPane.showMessageDialog(f,amount + " represents "+dollars+" dollars and "+ cents+" cents");
    }
}
