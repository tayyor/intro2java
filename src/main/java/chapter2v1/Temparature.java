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
public class Temparature {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double farenheit , celcius;
        celcius = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value in celcius: "));
            farenheit = (9.0/5.0)*celcius+32;
            JOptionPane.showMessageDialog(f, celcius+" Celcius is "+farenheit+" farenheit");
    }
    
}
