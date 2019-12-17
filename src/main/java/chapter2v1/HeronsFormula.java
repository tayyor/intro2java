/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2v1;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class HeronsFormula {
    public static void main(String args[]){
        double x1,x2,x3,y1,y2,y3;
        JFrame f = new JFrame();
        
       x1= Double.parseDouble(JOptionPane.showInputDialog(f,"x1:"));
       y1= Double.parseDouble(JOptionPane.showInputDialog(f,"y1:"));
       x2= Double.parseDouble(JOptionPane.showInputDialog(f,"x2:"));
       y2= Double.parseDouble(JOptionPane.showInputDialog(f,"y2:"));
       x3= Double.parseDouble(JOptionPane.showInputDialog(f,"x3:"));
       y3= Double.parseDouble(JOptionPane.showInputDialog(f,"y3:"));
       
       double A = Math.pow((x3-x1),2);
       double B = Math.pow((y3-y1),2);
       double C = Math.pow((x2-x1),2);
       double D = Math.pow((y2-y1),2);
       double E = Math.pow((x3-x2),2);
       double F = Math.pow((y3-y2),2);
       
       double s1 = Math.pow((A+B), 0.5);
       double s2 = Math.pow((C+D), 0.5);
       double s3 = Math.pow((E+F), 0.5);
       
       double S = (s1+s2+s3)/2;
       
      double area = Math.pow((S*(S-s1)*(S-s2)*(S-s3)),0.5);
       JOptionPane.showMessageDialog(f,"The area of the triangle is: "+ area);
    }
}
