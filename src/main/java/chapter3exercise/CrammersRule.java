package chapter3exercise;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class CrammersRule {
    public static void main(String args[]){
        JFrame h = new JFrame();
        int a,b,c,d,e,f,x,y;
        a =Integer.parseInt(JOptionPane.showInputDialog(h,"Enter value for a: "));
        b =Integer.parseInt(JOptionPane.showInputDialog(h,"Enter value for b: "));
        c =Integer.parseInt(JOptionPane.showInputDialog(h,"Enter value for c: "));
        d =Integer.parseInt(JOptionPane.showInputDialog(h,"Enter value for d: "));
        e =Integer.parseInt(JOptionPane.showInputDialog(h,"Enter value for e: "));
        f =Integer.parseInt(JOptionPane.showInputDialog(h,"Enter value for f: "));
       
        if ((a*d - b*c) == 0){
            JOptionPane.showMessageDialog(h,"Equation has no solution");
        }else {
             x = (e*d - b*f)/(a*d - b*c);
             y = (a*f - e*c)/(a*d - b*c);
             JOptionPane.showMessageDialog(h, "x: "+ x + "\n" + "y: "+ y);
        }
        
    }
    
}
