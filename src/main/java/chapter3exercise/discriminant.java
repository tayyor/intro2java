
package chapter3exercise;
import javax.swing.*;

public class discriminant {
    public static void main(String args[]){
        JFrame f = new JFrame();
        double a,b,c;
        double D;
        double r1,r2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog(f,"a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(f,"b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog(f,"c: "));
           
        r1 = (-b + (Math.pow((Math.pow(b,2) - 4*a*c), 0.5)))/2*a;
        r2 = (-b - (Math.pow((Math.pow(b,2) - 4*a*c), 0.5)))/2*a;
        
         D = (Math.pow(b,2)) - 4*a*c;
         
         if (D == 0)
             JOptionPane.showMessageDialog(f,"r1 , r2: "+ r1+"\n"+"\n"+" Equation has only one root");
        else if (D >0)
             JOptionPane.showMessageDialog(f,"r1: "+r1+"\n"+"r2: "+r2+"\n"+" Equation has 2 real roots");
         else 
             JOptionPane.showMessageDialog(f,"Equation has no real roots");
        
    }
}
