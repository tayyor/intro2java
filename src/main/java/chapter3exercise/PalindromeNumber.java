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
public class PalindromeNumber {
  public static void main(String args[]){
      JFrame f = new JFrame();
      int digits,hundred,ten,unit,quotient,newDigits,a,b,c;
      digits = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter a three digit number: "));
      
           unit = digits%10;
           quotient = digits/10;
           ten = quotient % 10;   
           hundred = digits / 100;
           a = unit * 100;
           b = ten * 10;
           c = hundred;
           newDigits = a+b+c;
           
      if (digits > 1000){
          JOptionPane.showMessageDialog(f,"invalid input");
      }else if (digits < 1000){
           if (digits == newDigits)
               JOptionPane.showMessageDialog(f,digits+" is a palindrome");
           else
               JOptionPane.showMessageDialog(f,digits +" is not a palindrome ");
      }
  }  
}
