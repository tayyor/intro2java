/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Excercises;

import java.util.Scanner;

/**
 *
 * @author tayyor
 */
public class AreaOfPentagon {
    public static void main(String args[]){
        double r,s,area;
        Scanner l = new Scanner(System.in);
        System.out.println("Enter length of pentagon:");
        r = l.nextDouble();
        
        s= 2*r*(Math.sin(Math.PI/5));
        
        // evaluate the denominator 
        double denom = 4*(Math.tan(Math.PI/5));
        
        area = 5*(Math.pow(s, 2))/denom;
        System.out.printf("Area of pentagon with sides %4.2f is %4.2f",r,area);
        
    }
    
}
