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
public class ConvertToUnicode {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter a character:");
        String Ch = r.next();
        char Char = Ch.charAt(0);
        
        System.out.println("The unicode for the character " + Ch +" is " + (int)Char);
        
    }
}
