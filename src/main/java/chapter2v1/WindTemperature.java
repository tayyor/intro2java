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
public class WindTemperature {
    public static void main(String args[]){
    JFrame f = new JFrame();
    double Ta,v,Twc,Vfinal;
    Ta = Double.parseDouble(JOptionPane.showInputDialog(f,"Temperature value between -58f and 41f: "));
    v = Double.parseDouble(JOptionPane.showInputDialog(f,"Enter wind speed value not less than 2mph: "));
             Vfinal =Math.pow(v,0.16);
     Twc = 35.74+0.6215*(Ta)-35.75*(Vfinal)+0.4275*(Ta)*(Vfinal);
     JOptionPane.showMessageDialog(f,"The wind chill index is: "+Twc);
  }
}
