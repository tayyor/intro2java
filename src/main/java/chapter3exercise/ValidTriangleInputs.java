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
public class ValidTriangleInputs {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int a,b,c;
        a = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter value of a"));
        b = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter value of b"));
        c = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter value of c"));
        
        if (a>0&&b>0&&c>0){
            if (a+b > c){
                if (a+c > b){
                    if (b+c >a){
                        JOptionPane.showMessageDialog(f,"Input is valid");
                    }else 
            JOptionPane.showMessageDialog(f, "Invalid Input");
                }else 
            JOptionPane.showMessageDialog(f, "Invalid Input");
            }else 
            JOptionPane.showMessageDialog(f, "Invalid Input");
        }else 
            JOptionPane.showMessageDialog(f, "Invalid Input");
    }
}
