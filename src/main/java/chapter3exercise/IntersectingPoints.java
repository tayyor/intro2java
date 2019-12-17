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
public class IntersectingPoints {
    public static void main(String args[]){
        JFrame g = new JFrame();
        double x1,x2,x3,x4,y1,y2,y3,y4;
        double a,b,c,d,e,f,X,Y,Dnum;
        
        x1 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for x1: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for x2: "));
        x3 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for x3: "));
        x4 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for x4: "));
        
        y1 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for y1: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for y2: "));
        y3 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for y3: "));
        y4 = Double.parseDouble(JOptionPane.showInputDialog(g," Enter value for y4: "));
        
        a = y1 - y2;
        b = x1 - x2;
        c = y3 - y4;
        d = x3 - x4;
        
        e =(y1-y2)*x1 - (x1-x2)*y1;
        f =(y3-y4)*x3 - (x3-x4)*y3;
        
        X = (e*d - b*f)/(a*d - b*c);
        Y = (a*f - e*c)/(a*d - b*c);
        Dnum = (a*d - b*c);
        
        if (Dnum == 0){
            JOptionPane.showMessageDialog(g, " The two lines are parallel");
        }else
            JOptionPane.showMessageDialog(g,"The intersection points are @: "+ "(" +X +" , "+Y+" )");
        
    }
}
