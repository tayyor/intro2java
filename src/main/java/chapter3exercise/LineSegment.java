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
public class LineSegment {
    public static void main(String args[]){
        JFrame f = new JFrame();
        
        double x0,x1,x2,y0,y1,y2,Vp,D1,D2,Dx,Dy;
        
        x0 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for x0: "));
        y0 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for y0: "));
        x1 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for x1: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for y1 "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for x2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for y2: "));
        
        Vp = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        /*from the previous point segment excercise, the program only determines if
         the point P2 falls along the linesegment of P0 and P1 without being particular 
        about the boundaries... this new excercise is all about the boundaries hence we 
        would have to carry out one more test ; we would now have to calculate the distance 
        between P0 ,P1 and P0,P2 then compare .This is one way we can ascertain if P2 is bounded
        within the limits of the line segment of P0 and P1*/
        
        
        //CALCULATE DISTANCE D1 FOR P0,P1
         Dx = x1-x0;
         Dy = y1-y0;
        double Px = Math.pow(Dx,2);
        double Py = Math.pow(Dy,2);
        D1 = Math.pow(Px+Py, 0.5);
        
        //CALCULATE DISTANCE FOR D2
        Dx = x2-x0;
         Dy = y2-y0;
         Px = Math.pow(Dx,2);
         Py = Math.pow(Dy,2);
        D2 = Math.pow(Px+Py, 0.5);
        
        // NOW WE COMPARE....
        if(Vp == 0){
            if (D1 > D2)
                JOptionPane.showMessageDialog(f," point p2 is on the same line segment");
            else if(D1<D2)
                JOptionPane.showMessageDialog(f, "Point p2 is not on the same line segment");
       }
            
        else
            JOptionPane.showMessageDialog(f,"Point P2 is not on the same line segment");
    }
}
