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
public class VowelsAndConsonants {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter an alphabet: ");
        String alpha = (r.nextLine()).toUpperCase();
        
        char ch = alpha.charAt(0);
        if (!('A'<=ch && 'Z'>=ch)){
            System.out.println("Invalid input");
            System.exit(0);
         }
        
        String s1 ="A";
        String s2 ="E";
        String s3 ="I";
        String s4 ="O";
        String s5 ="U";
        
        if((alpha).equals(s1)||(alpha).equals(s2)||(alpha).equals(s3)
                ||(alpha).equals(s4)||(alpha).equals(s5)){
            System.out.println(alpha +" is a vowel");
       }else 
            System.out.println(alpha + " is  a consonant");
    }
}
