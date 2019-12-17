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
public class MinutesToYears {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int minutes, NoOfDays,days,yrs;
        minutes = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter no of minutes: "));
        // convert the minutes to days
            NoOfDays = minutes/1440;
        //convert no of days to years
            yrs = NoOfDays / 365;
        // Get the no of days left
            days = NoOfDays % 365;
        /*
            nb: if we were to get the remainder in weeks and months
            we would swap 365 for 52 and 12 respectively.....
            */
        JOptionPane.showMessageDialog(f,minutes+" minutes is approx "+ yrs+" yrs and "+ days+" days");
    }
}
