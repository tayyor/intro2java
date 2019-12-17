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
public class BooleanExpression {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter a number: "));
        
        JOptionPane.showMessageDialog(f,"is "+num+" divisible by 5 and 6? "+ (num%5==0 && num%6==0));
        JOptionPane.showMessageDialog(f,"is "+num+" divisible by 5 or 6? "+ (num%5==0 || num%6==0));
        JOptionPane.showMessageDialog(f,"is "+num+" divisible by 5 XOR 6? "+ (num%5==0 ^ num%6==0));
    }
}
