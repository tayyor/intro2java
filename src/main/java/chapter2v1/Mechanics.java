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
public class Mechanics {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double Vi, Vf, time;
        double acceleration;
        Vi = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value of initial velocity in m/s:"));
        Vf = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value of final velocity in m/s:"));
        time = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter time in ses:"));
        acceleration = (Vf-Vi)/time;
        JOptionPane.showMessageDialog(f,"Average acceleration is: "+acceleration);
    }
}
