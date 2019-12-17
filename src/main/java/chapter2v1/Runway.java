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
public class Runway {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double velocity, acceleration,length;
        
        velocity = Double.parseDouble(JOptionPane.showInputDialog(f,"speed in m/s: "));
        
        acceleration = Double.parseDouble(JOptionPane.showInputDialog(f,"acceleration: "));
        
        length = (Math.pow(velocity, 2))/(2*acceleration);
        
        JOptionPane.showMessageDialog(f,"The minimum lenght for this airplane runway is: "+ length);
        
    }
}
