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
public class Cylinder {
    public static void main(String args[]){
        double lenght,radius,area,volume;
        final double PI = 3.142;
        JFrame f = new JFrame();
        
      lenght = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter lenght of cylinder: "));
      radius = Double.parseDouble(JOptionPane.showInputDialog(f," Enter radius of cylinder: "));
                area = PI * (Math.pow(radius,2));
                volume = area * lenght;
          JOptionPane.showMessageDialog(f, "The area of the cylinder is: "+area+"\n"+ "Volume is: "+volume);
        
    }
}
