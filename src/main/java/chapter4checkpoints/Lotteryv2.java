/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4checkpoints;

import java.util.Scanner;

/**
 *
 * @author tayyor
 */
public class Lotteryv2 {
    public static void main(String args[]){
        String num =""+(int)(Math.random()*100);
        Scanner r  = new Scanner(System.in);
        System.out.println("Enter your lottery numbers:");
        String UserNum = r.nextLine();
        if(UserNum.length()!= 2){
            System.out.println("invalid input u must enter 2 digits");
            System.exit(1);
        }
        char lot1 = UserNum.charAt(0);
        char lot2 = UserNum.charAt(1);
        
        char Lottery_num1 = num.charAt(0);
        char Lottery_num2 = num.charAt(1);
        
        System.out.println(num);
        
        // compare values
        
        if (Character.isDigit(lot1)&& Character.isDigit(lot2)){
            if(num.equals(UserNum))
                System.out.println("You won 10000 dollars!!!");
            else if((lot1==Lottery_num2 && lot2==Lottery_num1))
                System.out.println("You won 3000 dollars");
            else if((lot1==Lottery_num1 || lot2==Lottery_num2))
                System.out.println("You won 1000 dollars");
            else if((lot1==Lottery_num2 || lot2==Lottery_num1))
                System.out.println("You won 1000 dollars");
            else 
            System.out.println("Sorry no match");
        }else 
            System.out.println("invalid input");
    }
}
