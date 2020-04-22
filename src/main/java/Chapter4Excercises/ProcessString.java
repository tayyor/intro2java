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
public class ProcessString {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = r.nextLine();
        
        System.out.println("str has a lenght of: "+str.length());
        System.out.println("the first character of str is :  "+str.charAt(0));
        
    }
}
