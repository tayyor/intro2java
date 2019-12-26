/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3exercise;
import javax.swing.*;

/*(Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
program to cover all cases.)
*/


public class CircleGeo {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double x1,y1,x2,y2,r1,r2;
        
        x1 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter value for x1: "));
        y1 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter value for y1: "));
        x2 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter value for x2: "));
        y2 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter value for y2: "));
        r1 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter value for r1: "));
        r2 = Double.parseDouble(JOptionPane.showInputDialog(f,"enter value for r2: "));
        
        //CALCULATE DISTANCE BTW 2 POINTS IN THE CIRCLE
        
        double Dx = x2-x1;
        double Dy = y2-y1;
        
        double Cx = Math.pow(Dx,2);
        double Cy = Math.pow(Dy,2);
        
       double Distance = Math.pow(Cx+Cy, 0.5);
       
       if (Distance <= Math.abs(r1 - r2)){
           if (r1 < r2)
               JOptionPane.showMessageDialog(f,"Circle1 is inside Circle2");
           else
               JOptionPane.showMessageDialog(f,"Circle2 is inside Circle1");
       }else if(Distance <= r1+r2)
                JOptionPane.showMessageDialog(f," The Circles overlap");
       else
           JOptionPane.showMessageDialog(f,"The circles do not overlap");
    }
}
