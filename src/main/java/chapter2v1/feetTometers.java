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
public class feetTometers {
    public static void main(String args[]){
        double ft,meteres;
        JFrame f = new JFrame();
        ft = Double.parseDouble(JOptionPane.showInputDialog(f, "Enter distance in feet: "));
        meteres = ft* 0.305;
        JOptionPane.showMessageDialog(f,ft+" foot is "+ meteres+ " meters");
    }
}
