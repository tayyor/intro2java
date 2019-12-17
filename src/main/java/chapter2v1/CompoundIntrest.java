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
public class CompoundIntrest {
    public static void main(String args[]){
        double savings ;
        double IntrestRate = 0.00417;
        double NewAmount;
        JFrame f = new JFrame();
        
        savings = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter amount to invest: "));
        // calculate the amount for the first month
        NewAmount = savings*(1 + IntrestRate);
        //calculate returns for the second month
        NewAmount =(savings + NewAmount) * (1 + IntrestRate);
        //calculate returns for the third month
         NewAmount =(savings + NewAmount) * (1 + IntrestRate);
         // fourth month
          NewAmount =(savings + NewAmount) * (1 + IntrestRate);
          // fifth month
          NewAmount =(savings + NewAmount) * (1 + IntrestRate);
          // sixth  month
          NewAmount =(savings + NewAmount) * (1 + IntrestRate);
        JOptionPane.showMessageDialog(f, " After the sixth month the account value is: "+NewAmount);
    }
}
