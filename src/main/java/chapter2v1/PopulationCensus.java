/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2v1;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class PopulationCensus {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int birthRate, deathRate,migrationRate,CurrentPop,NewPop,yrs;
        yrs = Integer.parseInt(JOptionPane.showInputDialog(f,"Projection years:"));
        
        birthRate = (31536000/7)*yrs;
        deathRate = (31536000/13)*yrs;
        migrationRate = (31536000/45)*yrs;
        CurrentPop = 312032486;
        NewPop = (CurrentPop+birthRate+migrationRate)-deathRate;
        
        JOptionPane.showMessageDialog(f,"the population in "+ yrs+" Yrs: "+ NewPop);
        
    }
}
