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
public class DecimalToHex {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        int dec;
        
        System.out.println("Enter a dec value (0 to 15)");
        dec = r.nextInt();
        if(!(dec >= 0 && dec <=15)){
                System.out.println("Invalid Input");
                System.exit(0);
        }
        else if (dec >=0 && dec <=9)
            System.out.println("The hex value is "+ dec);
        else if (dec >= 10 && dec <= 15)
			System.out.println("The hex value is " + (char)(dec + 'A' - 10));
        
    }
}
