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
public class CramersRule {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x1,x2,x3,x4,y1,y2,y3,y4;
        double  a,b,c,d,e,i,x,y;
        
        x1= Double.parseDouble(JOptionPane.showInputDialog(f,"x1: "));
        x2= Double.parseDouble(JOptionPane.showInputDialog(f,"x2: "));
        x3= Double.parseDouble(JOptionPane.showInputDialog(f,"x3: "));
        x4= Double.parseDouble(JOptionPane.showInputDialog(f,"x4: "));
        y1= Double.parseDouble(JOptionPane.showInputDialog(f,"y1: "));
        y2= Double.parseDouble(JOptionPane.showInputDialog(f,"y2: "));
        y3= Double.parseDouble(JOptionPane.showInputDialog(f,"y3: "));
        y4= Double.parseDouble(JOptionPane.showInputDialog(f,"y4: "));
        
        a= (y1-y2); b=(x1-x2);
        c= (y3-y4); d=(x3-x4);
        e= (y1-y2)*x1 - (x1-x2)*y1;
        i= (y3-y4)*x3 - (x3-x4)*y3;
        
        x = ((e*d)-(b*i))/((a*d)-(b*c));
        y = ((a*i)-(e*c))/((a*d)-(b*c));
        
        if(((a*d)-(b*c)) == 0 || ((a*d)-(b*c)) == 0){
            JOptionPane.showMessageDialog(f," The two lines are parallel");
        }else{
            JOptionPane.showMessageDialog(f,"The 2 lines intersect at " + x +","+y);
        }
        
    }
}
