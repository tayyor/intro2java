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
public class FInApp {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter employee's name: ");
        String name = r.nextLine();
        
        System.out.println("Enter number of hours worked in a week: ");
        double hrs = r.nextDouble();
        
        System.out.println("Enter hourly pay rate: ");
        double pay = r.nextDouble();
        double gPay = pay*hrs;
        
        System.out.println("Enter federal tax withholding rate: ");
        double fed = r.nextDouble();
        double fPay = fed*gPay;
        
        System.out.println("Enter state tax withholding rate: ");
        double state = r.nextDouble();
        double sPay = state*gPay;
        
        double tPay = sPay + fPay;
        double nPay = gPay - (sPay+fPay);
        
        System.out.printf("Employee name: %s \n Hours worked: %4.1f \n "
                + "Pay Rate: $%4.2f \n Gross Pay: $%4.2f \n", name,hrs,pay,gPay);
        System.out.println("Deductions:");
        
        System.out.printf("Federal Withholding ($%4.2f):$%4.2f \n State Withholding (%4.2f):$%4.2f\n"
                + "Total deduction: $%4.2f \n Net Pay: $%4.2f" ,(fed*100),fPay,(state*100),sPay,tPay,nPay );
        
        
    }
}
