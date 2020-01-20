/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4checkpoints;

import java.util.Scanner;

/**
 *
 * @author tayyor
 */
public class GreatCircle {
    public static void main(String args[]){
        double distance,x1,y1,x2,y2;
        final double radius = 6371.01;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter pt.1 longitude and latitude: ");
        x1 = r.nextDouble();
        y1 = r.nextDouble();
        System.out.println("Enter pt.2 longitude and latitude: ");
        x2 = r.nextDouble();
        y2 = r.nextDouble();
        
        distance = radius * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+ Math.cos(Math.toRadians(x1))
                    *Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y2-y1)));
        System.out.println("The distance between the two points is: ");
        System.out.printf("%4.4f", distance);
        
       
        
    }
}
