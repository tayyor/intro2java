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
public class AlphabeticalOrder {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter first city: ");
        String s1 = r.nextLine();
        System.out.println("Enter second city: ");
        String s2 = r.nextLine();
        System.out.println("Enter third city: ");
        String s3 = r.nextLine();
        
        if (s2.compareTo(s1)<0 && s2.compareTo(s3)<0&& s1.compareTo(s3)<0){
             System.out.println(s2+","+s1+","+s3);
        }else if (s2.compareTo(s1)<0 && s2.compareTo(s3)<0&& s3.compareTo(s1)<0){
             System.out.println(s2+","+s3+","+s1);
        }else if (s3.compareTo(s1)<0 && s3.compareTo(s2)<0&& s2.compareTo(s1)<0){
             System.out.println(s3+","+s2+","+s1);
        }else if (s3.compareTo(s1)<0 && s3.compareTo(s2)<0&& s1.compareTo(s2)<0){
             System.out.println(s3+","+s1+","+s2);
        }else if (s1.compareTo(s2)<0 && s1.compareTo(s3)<0&& s3.compareTo(s2)<0){
             System.out.println(s1+","+s3+","+s2);
        }else
            System.out.println(s1+","+s2+","+s3);
    }
}
