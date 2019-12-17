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
public class FutureInvestmentValue {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double InvAmt,monthlyIR,annualIR;
        int noy;
        double fiv;
        
        InvAmt = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter Investment amount: "));
        annualIR = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter monthly intrest rate: "));
        noy = Integer.parseInt(JOptionPane.showInputDialog(f,"No. of years: "));
        monthlyIR = annualIR/1200;
        fiv = InvAmt * (Math.pow(1+monthlyIR, noy*12));
        JOptionPane.showMessageDialog(f,"Accumulated value is: "+ fiv);
    }
    
}
