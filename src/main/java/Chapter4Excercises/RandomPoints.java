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
public class RandomPoints {

    public static void main(String args[]) {
        Scanner i = new Scanner(System.in);
        Random rand = new Random();
        final double r = 40;

        //generate random number between 0 and 2pi (0 & 360)
        double A = rand.nextInt(361);
        double B = rand.nextInt(361);
        double C = rand.nextInt(361);
        
        //derive points using the formular provided in the question
        double x1 = r * Math.cos(A);
        double y1 = r * Math.sin(A);
        double x2 = r * Math.cos(B);
        double y2 = r * Math.sin(B);
        double x3 = r * Math.cos(C);
        double y3 = r * Math.sin(C);

        double Dx1 = x2 - x1;
        double Dy1 = y2 - y1;
        double Dx2 = x3 - x2;
        double Dy2 = y3 - y2;
        double Dx3 = x3 - x1;
        double Dy3 = y3 - y1;

        double sideA = Math.pow((Math.pow(Dx1, 2)) + (Math.pow(Dy1, 2)),0.5);
        double sideB = Math.sqrt((Math.pow(Dx2, 2)) + (Math.pow(Dy2, 2)));
        double sideC = Math.sqrt((Math.pow(Dx3, 2)) + (Math.pow(Dy3, 2)));

                
        System.out.println("SIDES");
        System.out.printf("A is %2.2f \nB is %2.2f\nC is %2.2f \n", sideA, sideB, sideC);

        double a = Math.toDegrees(Math.acos((Math.pow(sideA,2) - Math.pow(sideB,2) - Math.pow(sideC,2)) /(-2 * sideB * sideC)));
        double b = Math.toDegrees(Math.acos((Math.pow(sideB,2) - Math.pow(sideA,2) - Math.pow(sideC,2)) /(-2 * sideB * sideC)));
        double c = Math.toDegrees(Math.acos((Math.pow(sideC,2) - Math.pow(sideB,2) - Math.pow(sideA,2)) /(-2 * sideB * sideC)));
        
        System.out.println("random points are:");
        System.out.printf("a: %2.2f \nb: %2.2f \nc: %2.2f \n", a, b, c);

    }
}
