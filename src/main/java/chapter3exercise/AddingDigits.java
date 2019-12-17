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
public class AddingDigits {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int a = (int) (Math.random()*10);
        int b = (int) (Math.random()*10)%6;
        int c = (int) (Math.random()*10)-2;
        
        int sum = a+b+c;
        JOptionPane.showInputDialog(f,"What is: "+a+"+"+b+"+"+c);
        JOptionPane.showMessageDialog(f, sum+" is "+ (sum == a+b+c));
        
        
    }
    
}
