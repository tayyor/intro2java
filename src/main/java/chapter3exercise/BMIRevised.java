/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3exercise;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class BMIRevised {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double weight,feet,inches,height;
        double BMI;
        weight = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter weight in pounds: "));
        feet =  Double.parseDouble(JOptionPane.showInputDialog(f,"Enter height in feet"));
        inches =  Double.parseDouble(JOptionPane.showInputDialog(f,"Enter height in feet"));
        //conversion
        weight = 0.45359237*weight;
        feet = feet /0.083333;
        height = feet+inches;
        height = height * 0.0254;
        BMI = weight / (Math.pow(height,2));
        if(BMI < 18.5){
            JOptionPane.showMessageDialog(f,"BMI is: "+BMI+"\n"+"UNDERWEIGHT");
         }
        if((BMI > 18.5)&& (BMI < 25.0)){
            JOptionPane.showMessageDialog(f,"BMI is: "+BMI+"\n"+"NORMAL");
        }
        if((BMI>25.0)&&(BMI<30.00)){
            JOptionPane.showMessageDialog(f,"BMI is: "+BMI+"\n"+"OVERWEIGHT");
        }
        if(BMI >= 30.0){
            JOptionPane.showMessageDialog(f,"BMI is: "+BMI+"\n"+"OBESE");
        }
    }
}
