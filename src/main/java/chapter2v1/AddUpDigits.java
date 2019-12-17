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
public class AddUpDigits {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int integer,hundreds,tens,units,RemainingValue,sum;
        integer = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter a value between 0 and 1000: "));
        if (integer>0 && integer<1000){
            // get hundreds value
            hundreds = integer/100;
            // get the remainder
            RemainingValue = integer%100;
            // extract tens value from the remainder
            tens = RemainingValue/10;
            // get units value
            units = RemainingValue%10;
            sum = hundreds + tens +units;
            JOptionPane.showMessageDialog(f,"the sum of the digits "+ integer + " is: "+sum );
            
        }else
            JOptionPane.showMessageDialog(f,"Value out of scope please ensure number is between 0 and 1000");
    }
}
