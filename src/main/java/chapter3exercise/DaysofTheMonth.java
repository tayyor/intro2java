/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3exercise;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class DaysofTheMonth {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int month,year;
         month = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter month number: "));
         year = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter year: "));
         
         switch(month){
             case 1: JOptionPane.showMessageDialog(f, "January "+year+" had 31 days" );break;
             case 2: 
                 if((year % 4 == 0) || (year % 400 == 0))
                     JOptionPane.showMessageDialog(f, "February "+year+" had 29 days" );
                 else
                   JOptionPane.showMessageDialog(f, "February "+year+" had 28 days" );break;
                   
             case 3: JOptionPane.showMessageDialog(f, "March "+year+" had 31 days" );break;
             case 4: JOptionPane.showMessageDialog(f, "April "+year+" had 30 days" );break;
             case 5: JOptionPane.showMessageDialog(f, "May "+year+" had 31 days" );break;
             case 6: JOptionPane.showMessageDialog(f, "June "+year+" had 30 days" );break;
             case 7: JOptionPane.showMessageDialog(f, "July "+year+" had 31 days" );break;
             case 8: JOptionPane.showMessageDialog(f, "August "+year+" had 31 days" );break;
             case 9: JOptionPane.showMessageDialog(f, "September "+year+" had 30 days" );break;
             case 10: JOptionPane.showMessageDialog(f, "October "+year+" had 31 days" );break;
             case 11: JOptionPane.showMessageDialog(f, "November "+year+" had 30 days" );break;
             case 12: JOptionPane.showMessageDialog(f, "December "+year+" had 31 days" );break;
             
             default:
                 JOptionPane.showMessageDialog(f,"Entered wrong values try again: ");
         }
    }   
}
