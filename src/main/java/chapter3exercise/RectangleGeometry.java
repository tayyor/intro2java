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
public class RectangleGeometry {
   public static void main(String args[]){
       JFrame f = new JFrame();
       double a,b,width,height;
       a = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter point a: "));
       b = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter point b: "));
       
       width = 10;
       height = 5;
       if ((a<= width/2)&&(b <= height/2)){
           JOptionPane.showMessageDialog(f,"Points ("+ a+","+b+")" + " are valid points");
       }else 
           JOptionPane.showMessageDialog(f,"points are invalid");
   } 
}
