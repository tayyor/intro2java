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
public class LetterGrade2Number {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter a letter grade from these options (A,B,C,D,F):");
        String s = (r.nextLine()).toUpperCase();            // converts input to capital letters upon entry
        
        switch (s){
            case "A":
                System.out.println("The numeric value for grade "+s+" is 4");break;
            case "B":
                System.out.println("The numeric value for grade "+s+" is 3");break;
            case "C":
                System.out.println("The numeric value for grade "+s+" is 2");break;
            case "D":
                System.out.println("The numeric value for grade "+s+" is 1");break;
            case "F":
                System.out.println("The numeric value for grade "+s+" is 0");break;
            default:
                System.out.println("Invalid input");
                   
        }
    }
}
