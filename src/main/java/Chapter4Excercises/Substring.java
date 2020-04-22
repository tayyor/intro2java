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
public class Substring {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter s1: ");
        String s1 = r.nextLine();
        
        System.out.println("Enter s2: ");
        String s2 = r.nextLine();
        
        boolean substr = s1.contains(s2);
        
        System.out.println((substr)? s2+" is a substring of "+s1 : s2+" is not a substring of "+s1);
            
    }
}
