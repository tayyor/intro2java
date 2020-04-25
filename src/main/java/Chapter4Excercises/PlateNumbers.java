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
public class PlateNumbers {
    public static void main(String args[]){
        
        int x1 = 65+(int)(Math.random()*26); 
        int x2 = 65+(int)(Math.random()*26); 
        int x3 = 65+(int)(Math.random()*26); 
        
        //convert integer to characters thru explicit conversion
        
        char ch1 = (char)x1;
        char ch2 = (char)x2;
        char ch3 = (char)x3;
        
        // get random integers and represent them as strings
        
        int a1 = (int)((Math.random())*10);
        int a2 = (int)((Math.random())*10);
        int a3 = (int)((Math.random())*10);
        int a4 = (int)((Math.random())*10);
         
        System.out.println(ch1+""+ ch2+""+ ch3+""+ a1+""+ a2+""+ a3 +""+a4);
        
    }
}
