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
public class GeometryHexagon {
    public static void main(String args[]){
        JFrame f = new JFrame ();
        double s,area;
        s = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter dimension for side: "));
        area = (3*(Math.pow(3, 0.5)/2))*(Math.pow(s,2));
        JOptionPane.showMessageDialog(f,"The area of the hexagon is: "+ area);
    }
}
