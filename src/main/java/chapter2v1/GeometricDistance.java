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
public class GeometricDistance {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x1,y1,x2,y2,x,y,distance;
        
        x1 = Double.parseDouble(JOptionPane.showInputDialog(f,"x1: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(f,"y1: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(f,"x2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(f,"y2: "));
        
        x = x2-x1;
        y = y2-y1;
        
       distance = Math.pow((Math.pow(x,2))+(Math.pow(y,2)),0.5);
       JOptionPane.showMessageDialog(f,"The distance between the two points is: "+ distance);
    }
}
