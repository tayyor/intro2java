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
public class HeadsOrTails {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int coinToss,guess;
        coinToss =(int) (Math.random()*10)%2;
        guess = Integer.parseInt(JOptionPane.showInputDialog(f,"make a guess; heads or tail "+"\n"+ "press 0 for head and 1 for tail"));
        
        switch (coinToss){
            case 0: 
                if(guess == 0)
                    JOptionPane.showMessageDialog(f,"coin toss: "+ coinToss+"\n"+"You guessed right!!");
                else 
                    JOptionPane.showMessageDialog(f,"coin toss: "+ coinToss+"\n"+"You guessed wrong!!");
                break;
            case 1:
                if(guess == 1)
                    JOptionPane.showMessageDialog(f,"coin toss: "+ coinToss+"\n"+"You guessed right!!");
                else 
                    JOptionPane.showMessageDialog(f,"coin toss: "+ coinToss+"\n"+"You guessed wrong!!");
                break;
            default:
                   JOptionPane.showMessageDialog(f,"stick to the game , you need to play by the rules ");
                
        }
    }
}
