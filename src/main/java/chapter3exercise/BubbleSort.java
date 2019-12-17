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
public class BubbleSort {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int a,b,c,temp;
        a = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter value for a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter value for b: "));
        c = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter value for c: "));
           //ascending order... small to big
     
            if ((a > b)&&(a > c)){// implies a is the largest and occupies the last position
                   temp = a;
                    a = c;
                    c = temp;  
                    if (a > b){
                    temp = b;
                    b = a;
                    a = temp;
                }
            }else if((b > a)&&(b > c)){//implies b is the biggest
                temp  = b;
                b = c;
                c = temp;
                if(a > b){
                    temp = b;
                    b = a;
                    a = temp;
                }
            }else if ((c > a)&&(c > b)){
                if (a > b){
                    temp = a;
                    a = b;
                    b = temp;
                }
            }else if ((a > b)&& (b == c)){
                temp = a;
                a = c;
                c = a;
            }else if ((b > a)&& (a == c)){
                temp = b;
                b = c;
                c = b;
            }else if ((a>b)&& (a==c)){
                temp  = b;
                b = a;
                a = temp;
            }
            JOptionPane.showMessageDialog(f,a+","+b+","+c);
            
                
    }
}
