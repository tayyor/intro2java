
package chapter3exercise;
import javax.swing.*;
/**
 *
 * @author tayyor
 */
public class FutureDates {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int day;
        int Fday;
       day = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter number between 0 to 6 for today's day"));
       Fday = Integer.parseInt(JOptionPane.showInputDialog(f,"Enter number of days elapsed since today: "));
       
       Fday = Fday + day;
       
       if (Fday > 6)
           Fday = Fday%7;
           
       
       
       switch (day){
           case 0://sunday
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Sunday and the future day is Saturday"); break;
            }
            break;
           case 1://monday
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Monday and the future day is Saturday"); break;
            }
            break;
           case 2://tuesday
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Tuesday and the future day is Saturday"); break;
            }
            break;
           case 3:
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Wednesday and the future day is Saturday"); break;
            }
            break;
           case 4:
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Thursday and the future day is Saturday"); break;
            }
            break;
           case 5:
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Friday and the future day is Saturday"); break;
            }
            break;
           case 6:
            switch(Fday){
                case 0:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Sunday"); break;
                case 1:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Monday"); break;
                case 2:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Tuesday"); break;
                case 3:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Wednesday"); break;
                case 4:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Thursday"); break;
                case 5:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Friday"); break;
                case 6:JOptionPane.showMessageDialog(f, "Today is Saturday and the future day is Saturday"); break;
            }
            break;
       }
    }
}
