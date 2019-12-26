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
public class ExchangeRate {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double rate,amount,dollar,yuan;
        int choice;
        
        rate = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter exchange rate from dollars to yuan: "));
        choice= Integer.parseInt(JOptionPane.showInputDialog(f,"press 1 to convert yuan to dollar"+"\n"+ " 2 to convert from dollar to yuan"));
        
        if ( choice == 1){
            amount = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter yuan amount:"));
            dollar = amount/rate;
            JOptionPane.showMessageDialog(f, amount + " yuan is "+dollar+" dollars");
        }
        else if( choice == 2){
            amount = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter dollar amount:"));
            yuan = amount*rate;
            JOptionPane.showMessageDialog(f, amount + " dollars is "+yuan+" yuan");
        }else
            JOptionPane.showMessageDialog(f,"invalid input!!");
    }
}
