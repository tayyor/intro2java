/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3exercise;
import javax.swing.*;

/**
 *(Geometry: two rectangles) Write a program that prompts the user to enter the
 *   center x-, y-coordinates, width, and height of two rectangles and determines
 *  whether the second rectangle is inside the first or overlaps with the first, as shown
 * 
 * 
 */
public class RecCordinates {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x1,y1,x2,y2,width1,width2,height1,height2,Dx,Dy;
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
        
        //GET HORIZONTAL Dx AND VERTICAL Dy DISTANCE BETWEEN THE POINTS
        
        Dx = Math.abs(x2 - x1);
        Dy = Math.abs(y2 - y1);
        
        //GET AVERAGE LENGHT OF WIDTH AND HEIGHT
        
         double Dw=(width1 - width2)/2;
         double Dh=(height1 - height2)/2;
         
         //COMPARISON OF WIDTH AND HEIGHT RELATIVE TO  Dx AND Dy
         
         if (Dx <= (Dw) || Dy <= (Dh)){
             if (width2 > width1)
                 JOptionPane.showMessageDialog(f,"Rec1 is inside Rec2");
             else
                 JOptionPane.showMessageDialog(f,"Rec2 is inside Rec1");
         }
         else if(Dx >= (Dw) || Dy >= (Dh)){
             if (Dx >= (width1+width2)/2 || Dy >= (height1+height2)/2)
                 JOptionPane.showMessageDialog(f,"No Overlap");
             else 
                 JOptionPane.showMessageDialog(f,"rectangles overlap");
         }
    }
             
         
                 
        
    }
    

