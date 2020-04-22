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
public class SocialSecurityNjumber {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter a social security number: ");
        String str = ""+r.nextLine();
        
        if (str.length()==11){
            if(str.indexOf("-")==3 || str.indexOf("-",4)==6){
                if(Character.isDigit(str.charAt(0))|| Character.isDigit(str.charAt(1))||
                    Character.isDigit(str.charAt(2))|| Character.isDigit(str.charAt(4))||
                     Character.isDigit(str.charAt(5))|| Character.isDigit(str.charAt(7))||
                       Character.isDigit(str.charAt(8))|| Character.isDigit(str.charAt(9))||
                        Character.isDigit(str.charAt(10)))
                    System.out.println(str +" is valid");
            }
        } else
                System.out.println(str +" is not valid");
        
        
    }
}
