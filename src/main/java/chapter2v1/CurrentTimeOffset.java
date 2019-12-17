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
public class CurrentTimeOffset {
    public static void main(String args[]){
        JFrame f = new JFrame();
        long GMToffset = Long.parseLong(JOptionPane.showInputDialog(f, "Enter offsite value: "));
        long GMT = System.currentTimeMillis();
        long NewTime = GMT - GMToffset;
        /*
        now that the offset time has been factored in, can now begin with converting
        the new time from secs to milli secs.
        */
        long TotalSeconds = NewTime /1000;
        // now we get current seconds
        long currentSeconds = TotalSeconds % 60;
        // next is to get total minutes
        long totalMinutes = TotalSeconds / 60;
        // we then obtain the current minutes
        long currentMinutes = totalMinutes % 60;
        // next is to derive the total hrs
        long totalHrs = totalMinutes /60;
        // we then obtain the current hrs
        long currentHrs = totalHrs % 24;
        JOptionPane.showMessageDialog(f,"Current time is: "+currentSeconds+":"+currentMinutes+":"+currentHrs );
    }
}