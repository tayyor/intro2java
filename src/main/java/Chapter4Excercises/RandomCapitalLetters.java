/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Excercises;

/**
 *
 * @author tayyor
 */
public class RandomCapitalLetters {
    public static void main(String args[]){
        int x = 65+(int)(Math.random()*26);              //this generates random numbers btw 65 and 91
        
        System.out.println(x);
        char ch= (char)x;                                //explicit conversion of int to char data type
        
        System.out.println(ch);
    }

}
