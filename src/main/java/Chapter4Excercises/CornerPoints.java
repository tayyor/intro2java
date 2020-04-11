/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Excercises;
import java.util.*;
/**
 *
 * @author tayyor
 */
public class CornerPoints {
    public static void main(String args[]){
        
        Scanner i = new Scanner(System.in);
        double r ,a,b,c,d,e;
                
        System.out.println("Enter radius of bouding circle: ");
        r = i.nextDouble();
        System.out.println("Enter value of angles for each vertices:");
        System.out.println("vertex a:");
        a = i.nextDouble();
        System.out.println("vertex b:");
        b = i.nextDouble();
        System.out.println("vertex c:");
        c = i.nextDouble();
        System.out.println("vertex d:");
        d = i.nextDouble();
        System.out.println("vertex e:");
        e = i.nextDouble();

      /**
       * note that the angles formed are relative to the circle in which the polygon 
       * is inscribed in.Sum of angles at a point is 360 degrees hence for a regular
       * pentagon each angle will be 72 degrees . so as we circumnavigate the points,
       * each angel increases by 72 degrees starting from 0 degree (0,72,144,....);
       */
        
        double x1 = r*Math.cos(Math.toRadians(a));
        double y1 = r*Math.sin(Math.toRadians(a));
        double x2 = r*Math.cos(Math.toRadians(b));
        double y2 = r*Math.sin(Math.toRadians(b));
        double x3 = r*Math.cos(Math.toRadians(c));
        double y3 = r*Math.sin(Math.toRadians(c));
        double x4 = r*Math.cos(Math.toRadians(d));
        double y4 = r*Math.sin(Math.toRadians(d));
        double x5 = r*Math.cos(Math.toRadians(e));
        double y5 = r*Math.sin(Math.toRadians(e));
        
               
        System.out.printf("P1 (%2.4f,%2.4f) \n",x1,y1);
        System.out.printf("P2 (%2.4f,%2.4f) \n",x2,y2);
        System.out.printf("P3 (%2.4f,%2.4f) \n",x3,y3);
        System.out.printf("P4 (%2.4f,%2.4f) \n",x4,y4);
        System.out.printf("P5 (%2.4f,%2.4f) \n",x5,y5);
    }
}
