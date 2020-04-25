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
public class ComputeChangev4 {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        String amount, dollar,cents;
        
        System.out.println("Enter amount: ");
        amount = ""+r.nextLine();
        int x = amount.indexOf(".");
        dollar = amount.substring(0,x);
        cents = amount.substring(x+1);
        
        System.out.printf("%s represents... %s dollars and %s cents",amount,dollar,cents);
        
    }
}
