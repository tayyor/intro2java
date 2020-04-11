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
public class RegularPolygon {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        double s,n,Area;
        
        System.out.println("Enter number of sides of polygon: ");
        n = r.nextDouble();
        System.out.println("Enter length of polygon: ");
        s = r.nextDouble();
        
        Area = n*s*s/(4*(Math.tan(Math.PI/n)));
        
        System.out.printf("Polygon with sides %1.1f and length %2.3f has area of %4.2f", n,s,Area);
        
    }
}
