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
public class DaysInMonths {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        int yr = r.nextInt();
        
        System.out.println("Enter the first three letters of a month: ");
        String month = (r.next()).toUpperCase();
        
        switch (month){
            case "JAN":
            case "MAR":
            case "MAY":
            case "JUL":
            case "AUG":
            case "OCT":
            case "DEC":
                System.out.println(month +" "+ yr +" has "+ 31 + " days");break;
            case "SEP":
            case "APR":
            case "JUN":
            case "NOV":
                System.out.println(month +" "+ yr +" has "+ 30 + " days");break;
            case "FEB":
                if(yr%4 == 0){
                    System.out.println(month +" "+ yr +" has "+ 29 + " days");
                }else 
                    System.out.println(month +" "+ yr +" has "+ 28 + " days");
                break;
            default:
                System.out.println("invalid output");
            
        }
    }
}
