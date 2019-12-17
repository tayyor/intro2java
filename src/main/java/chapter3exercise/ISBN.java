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
public class ISBN {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
        
        
        d1 = Integer.parseInt(JOptionPane.showInputDialog(f,"d1:"));
        d2 = Integer.parseInt(JOptionPane.showInputDialog(f,"d2:"));
        d3 = Integer.parseInt(JOptionPane.showInputDialog(f,"d3:"));
        d4 = Integer.parseInt(JOptionPane.showInputDialog(f,"d4:"));
        d5 = Integer.parseInt(JOptionPane.showInputDialog(f,"d5:"));
        d6 = Integer.parseInt(JOptionPane.showInputDialog(f,"d6:"));
        d7 = Integer.parseInt(JOptionPane.showInputDialog(f,"d7:"));
        d8 = Integer.parseInt(JOptionPane.showInputDialog(f,"d8:"));
        d9 = Integer.parseInt(JOptionPane.showInputDialog(f,"d9:"));
        d10 = ((d1*1)+ (d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11;
        //JOptionPane.showMessageDialog(f, d10);
        if (d10 == 10){
            d10 = 'x';
            JOptionPane.showMessageDialog(f,"ISBN-10 number is: " +d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
        }else
            JOptionPane.showMessageDialog(f,"ISBN-10 number is: " +d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
    }
}
