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
public class BodyMassIndex {
    public static void main(String arg[]){
        double weight,height,BMI;
        JFrame f  = new JFrame();
        weight = Double.parseDouble(JOptionPane.showInputDialog(f,"Weight in pounds: "));
        height = Double.parseDouble(JOptionPane.showInputDialog(f,"height in inches: "));
            weight = weight * 0.4539237;
            height = height * 0.0254;
            BMI = weight / (Math.pow(height,2));
        JOptionPane.showMessageDialog(f,"BMI is: "+ BMI);
    }
    
}
