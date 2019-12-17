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
public class BooleanRandom {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int num1,num2,temp,sum;
        num1 = (int)(Math.random()*100);
        num2 = (int)(Math.random()*100);
        
        if (num1<num2){
            temp = num2;
            num2 = num1;
            num1 = temp;
            //JOptionPane.showMessageDialog(f,"num1: "+ num1+" num2: "+num2);
           }
       sum =Integer.parseInt(JOptionPane.showInputDialog(f,"What is the value of: "+ num1+ "+" +num2));
        JOptionPane.showMessageDialog(f,sum+" is "+ (sum == num1+num2));
    }
}
