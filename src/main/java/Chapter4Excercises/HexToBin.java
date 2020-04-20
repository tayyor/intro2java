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

public class HexToBin{
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter a hex digit (A to F): ");
        String str = (r.nextLine()).toUpperCase();              //get input and convert to upper case
        char ch = str.charAt(0);                                // convert to char datatype
        
        if (!('A'<= ch && 'F'>=ch)){                            //verify input is within range
            System.out.println("Invalid input");
            System.exit(0);
        }
        int num = ch-'A'+10;                                // proceed to derive decimal value of the Hex.
        
        switch(num){
            case 10:
                System.out.println("1010");break;
            case 11:
                System.out.println("1011");break;
            case 12:
                System.out.println("1100");break;
            case 13:
                System.out.println("1101");break;
            case 14:
                System.out.println("1110");break;
            case 15:
                System.out.println("1111");break;
            default:
                System.out.println("invalid input");break;
            
        }
        
    }
}
