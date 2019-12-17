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
public class RecCordinates {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x1,y1,x2,y2,width1,width2,height1,height2,area1,area2,rec1,rec2;
        //RECTANGLE 1
        x1 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter x1 for rec1: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter y1 for rec1: "));
        width1 = Double.parseDouble(JOptionPane.showInputDialog(f, "Enter width for rec1: "));
        height1 = Double.parseDouble(JOptionPane.showInputDialog(f, "Enter height for rec1: "));
        
        //RECTANGLE 2
        x2 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter x2 for rec2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter y2 for rec2: "));
        width2 = Double.parseDouble(JOptionPane.showInputDialog(f, "Enter width for rec2: "));
        height2 = Double.parseDouble(JOptionPane.showInputDialog(f, "Enter height for rec2: "));
        
        //CALCULATE AREA OF RECTANGLES
        area1 = width1*height1;
        area2 = width2*height2;
        JOptionPane.showMessageDialog(f,"area1: "+ area1+"\n"+"area2: "+ area2);
        //COMPARISON
        if(area2 < area1 && x2 > x1){
            JOptionPane.showMessageDialog(f,"rec2 is inside rec1");
        }else 
            JOptionPane.showMessageDialog(f,"rec2 overlaps rec1");
    }   
    
}
