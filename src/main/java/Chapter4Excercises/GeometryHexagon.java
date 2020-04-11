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
public class GeometryHexagon {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        double Area,s;
        System.out.println("Enter no. of sides of polygon: ");
        s= r.nextDouble();
        Area = 6*s*s/(4*(Math.tan(Math.PI/6)));
        
        System.out.printf("Area of polygon with %1.1f sides is %4.2f", s,Area);
        
    }
}
