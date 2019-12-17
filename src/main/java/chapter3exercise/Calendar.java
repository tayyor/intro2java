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
public class Calendar {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int k, m,q,h,j;
        k = Integer.parseInt(JOptionPane.showInputDialog(f," Enter year: "));//year
        m = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter month 1-12: "));// month
        q = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter day of the month 1-31: "));//month-day
       // evaluate j and k
            j = k/100;
            k = k % 100;
            if (m == 1){
                m = 13;
                k--;
            }
            if (m == 2){
                m = 14;
                k--;
            }
              h = (q +26*(m+1)/10 + k + k/4 + j/4 + 5*j)% 7;
              
              switch(h){
                  case 0: JOptionPane.showMessageDialog(f,"Day of the week is Saturday");break;
                  case 1: JOptionPane.showMessageDialog(f,"Day of the week is Sunday");break;
                  case 2: JOptionPane.showMessageDialog(f,"Day of the week is Monday");break;
                  case 3: JOptionPane.showMessageDialog(f,"Day of the week is Tuesday");break;
                  case 4: JOptionPane.showMessageDialog(f,"Day of the week is Wednesday");break;
                  case 5: JOptionPane.showMessageDialog(f,"Day of the week is Thursday");break;
                  case 6: JOptionPane.showMessageDialog(f,"Day of the week is Friday");break;
                  default: JOptionPane.showMessageDialog(f," invalid");
              }
       
        
    }
}
