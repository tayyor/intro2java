/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4Excercises;

import java.util.Scanner;

/**
 *
 * @author tayyor
 */
public class GuessBirthdaysRevised {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        String set1 = "1  3  5  7 \n"+
                      "9  11 13 15 \n"+
                      "17 19 21 23 \n"+
                      "25 27 29 31 \n";
        
        String set2 = "2  3  6  7  \n"+
                      "10 11 14 15 \n"+
                      "18 19 22 23 \n"+
                      "26 27 30 31  \n";
        
        String set3 = "4  5  6  7 \n"+
                      "12 13 14 15 \n"+
                      "20 21 22 23 \n"+
                      "28 29 30 31 \n";
        
        String set4 = "8  9  10 11 \n"+
                      "12 13 14 15 \n"+
                      "24 25 26 27\n"+
                      "28 29 30 31 \n";
        
        String set5 = "16 17 18 19 \n"+
                      "20 21 22 23 \n"+
                      "24 25 26 27\n"+
                      "28 29 30 31 \n";
        int day = 0;
        
        
        System.out.println("Is your birthday in set 1?? \n Enter y for yes and n for no");
        String  answer = input.nextLine();
        if("y".equals(answer))
            day += 1;
        System.out.println("Is your birthday in set 2?? \n Enter y for yes and n for no");
        answer = input.nextLine();
        if("y".equals(answer))
            day += 2;
        System.out.println("Is your birthday in set 3?? \n Enter y for yes and n for no");
        answer = input.nextLine();
        if("y".equals(answer))
            day += 4;
        System.out.println("Is your birthday in set 4?? \n Enter y for yes and n for no");
        answer = input.nextLine();
        if("y".equals(answer))
            day += 8;
        System.out.println("Is your birthday in set 5?? \n Enter y for yes and n for no");
        answer = input.nextLine();
        if("y".equals(answer))
            day += 16;
        System.out.println( "your birthday is on "+  day+"!");
        
    }
}
