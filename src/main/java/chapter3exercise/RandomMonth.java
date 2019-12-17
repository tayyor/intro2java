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
public class RandomMonth {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int num;
        num = (int)(Math.random()*12);
        
        switch (num){
            case 1:JOptionPane.showMessageDialog(f,"January"); break;
            case 2:JOptionPane.showMessageDialog(f,"February"); break;
            case 3:JOptionPane.showMessageDialog(f,"March"); break;
            case 4:JOptionPane.showMessageDialog(f,"April"); break;
            case 5:JOptionPane.showMessageDialog(f,"May"); break;
            case 6:JOptionPane.showMessageDialog(f,"June"); break;
            case 7:JOptionPane.showMessageDialog(f,"July"); break;
            case 8:JOptionPane.showMessageDialog(f,"August"); break;
            case 9:JOptionPane.showMessageDialog(f,"September"); break;
            case 10:JOptionPane.showMessageDialog(f,"October"); break;
            case 11:JOptionPane.showMessageDialog(f,"November"); break;
            case 12:JOptionPane.showMessageDialog(f,"December"); break;
            
        default:
            JOptionPane.showMessageDialog(f,"invalid entry");
        
        }   
        
    }
}
