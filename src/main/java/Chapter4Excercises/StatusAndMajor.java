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
public class StatusAndMajor {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter two characters: ");
        String Str = (r.nextLine()).toUpperCase();
        // verify entry is not > 2 characters
        if(Str.length() > 2)
            System.out.println("Invalid input ; only 2 characters are needed");
        
        // Split entries 
        
        String ch1 = Str.substring(0,1);
        String ch2 = Str.substring(1);
        
        switch(ch2){
            case "1":
                if (ch1.equals("M"))
                    System.out.println(" Mathematics Freshman");
                else if (ch1.equals("C"))
                    System.out.println("Computer Science Freshman");
                else if (ch1.equals("I"))
                    System.out.println("Information Tecnology Freshman");
                else 
                    System.out.println("Invalid input");break;
            case "2": 
                if (ch1.equals("M"))
                    System.out.println(" Mathematics Sophomore");
                else if (ch1.equals("C"))
                    System.out.println("Computer Science Sophomore");
                else if (ch1.equals("I"))
                    System.out.println("Information Tecnology Sophomore");
                else 
                    System.out.println("Invalid input");break;
            case "3": 
                if (ch1.equals("M"))
                    System.out.println(" Mathematics Junior");
                else if (ch1.equals("C"))
                    System.out.println("Computer Science Junior");
                else if (ch1.equals("I"))
                    System.out.println("Information Tecnology Junior");
                else 
                    System.out.println("Invalid input");break;
            case "4": 
                if (ch1.equals("M"))
                    System.out.println(" Mathematics Senior");
                else if (ch1.equals("C"))
                    System.out.println("Computer Science Senior");
                else if (ch1.equals("I"))
                    System.out.println("Information Tecnology Senior");
                else 
                    System.out.println("Invalid input");break;
            default:
                System.out.println("Invalid Input");
        }
                
    }
}
