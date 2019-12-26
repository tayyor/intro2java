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
public class GeoPointPosition {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x0,x1,x2,y0,y1,y2,Vp;
        
        x0 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for x0: "));
        y0 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for y0: "));
        x1 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for x1: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for y1 "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for x2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter value for y2: "));
        
        Vp = (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        
        if (Vp >0 )
            JOptionPane.showMessageDialog(f,"points P2 "+"(" +x2+","+y2+")"+" is on the left side of the line");
        else if(Vp == 0)
            JOptionPane.showMessageDialog(f,"points P2 "+"(" +x2+","+y2+")"+" is on the same line");
        else if(Vp < 0)
            JOptionPane.showMessageDialog(f,"points P2 "+"(" +x2+","+y2+")"+" is on the right side of the line");
    }
}
