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
public class Energy {
    public static void main(String args[]){
        double mass, Ti,Tf,Joules;
        JFrame f = new JFrame();
        mass = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter mass of water needed in kg:"));
        Ti = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter initial Temp."));
        Tf = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter final Temp."));
            Joules = mass *(Tf - Ti)*4184;
           JOptionPane.showMessageDialog(f,"Energy neeeded is: "+ Joules);
    }
}
