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
public class ISBNrevised {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter 9 digits: ");
        String str = ""+r.nextLine();                   // CONVERTS INTEGER TO STRING
         int Str = Integer.parseInt(str);
        
             
        int d1 = Str/100000000;
        int remainder = Str % 100000000;
               
        int d2 = remainder / 10000000;//8
        remainder = Str % 10000000;
                
        int d3 = remainder / 1000000;//7
        remainder = Str % 1000000;
              
        int d4 = remainder / 100000;//6
        remainder = Str % 100000;
        
        int d5 = remainder / 10000;//5
        remainder = Str % 10000;
        
        int d6 =remainder / 1000;//4
        remainder = Str % 1000;
         
        int d7 = remainder / 100;//3
        remainder = Str % 100;
        
        int d8 = remainder / 10;//2
        remainder = Str % 10;
        
        int d9 = remainder;
        int d10 = ((d1*1)+ (d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11;
        
        if (d10 == 10){
            System.out.println("ISBN-10 number is: " +d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
        }else
           System.out.println("ISBN-10 number is: " +d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
    }
}
