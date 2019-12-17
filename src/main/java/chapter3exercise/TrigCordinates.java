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
public class TrigCordinates {
   public static void main(String args[]){
       JFrame f = new JFrame();
       double x,y;
       x = Double.parseDouble(JOptionPane.showInputDialog(f,"enter cordinate for x:"));
       y = Double.parseDouble(JOptionPane.showInputDialog(f,"enter cordinate for y:"));
       
       if((y>0)&&(x>0)&&(x+2*y<200)){
           JOptionPane.showMessageDialog(f,"Point is in the triangle");
       }else
           JOptionPane.showMessageDialog(f,"Point is not in the triangle");
           
             
   } 
}
