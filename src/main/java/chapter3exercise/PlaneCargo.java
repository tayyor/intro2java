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
public class PlaneCargo {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double weight, cost;
        weight = Double.parseDouble(JOptionPane.showInputDialog(f," enter weight: "));
        if ((weight > 0 && weight<=1))
            cost = weight*3.5;
        else if((weight > 1 && weight <=3)){
            cost = weight*5.5;
        }
        else if((weight > 3 && weight <=10)){
            cost = weight*8.5;
        }
        else if ((weight < 10 && weight<=20)){
            cost = weight*10.8;
        }
        else if ( weight > 50){
            JOptionPane.showMessageDialog(f,"Goods cannot be shipped");
        }
              
    }
}
