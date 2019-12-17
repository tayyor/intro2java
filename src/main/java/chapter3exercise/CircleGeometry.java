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
public class CircleGeometry {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x,y,D,dX,dY;
        double a = 0;
        double b = 0;
        x= Double.parseDouble(JOptionPane.showInputDialog(f," Enter cordinates for podouble X: "));
        y= Double.parseDouble(JOptionPane.showInputDialog(f," Enter cordinates for podouble Y: "));
        dX = x - a;
        dY = y - b;
        D =Math.pow((Math.pow(dX, 2))+(Math.pow(dY, 2)), 0.5);
        //JOptionPane.showMessageDialog(f, D);
        if (D<=10){
            JOptionPane.showMessageDialog(f,"points "+"("+x+","+y+")"+" are in the circle"+"\n"+"distance is: "+D);
        }else
            JOptionPane.showMessageDialog(f, "points are out of range");
        
        
    }
}
