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
public class RockPaperScissors {
    public static void main(String args[]){
        JFrame f = new JFrame();
        int computer, user;
        computer = (int)(Math.random()*10)%3;
        //JOptionPane.showMessageDialog(f, computer);
        user = Integer.parseInt(JOptionPane.showInputDialog(f,"choose: "+"\n"
                +"scissor(0) rock(1) paper(2)"));
        if (user == computer){
            user = Integer.parseInt(JOptionPane.showInputDialog(f,"It's a draw try again: "+"\n"
                +"scissor(0) rock(1) paper(2)"));
             
            switch(user){
                case 0:
                    if (computer == 1)
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"rock"+" You are scissor, You lose");
                    else
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"rock"+" You are scissor, You win!!!");break;
                case 1:
                    if (computer == 0)
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"scissor"+" You are rock, You win!!");
                    else
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"Scissor"+" You are rock, You lose!!!");break;
                case 2:
                    if (computer == 0)
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"scissor"+" You are paper, You lose!!");
                    else
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"scissor"+" You are paper, You win!!!");break;
                default:
                    JOptionPane.showMessageDialog(f,"wrong value");
            }
        }else{
            switch(user){
                case 0:
                    if (computer == 1)
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"rock"+" You are scissor, You lose");
                    else
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"rock"+" You are scissor, You win!!!");break;
                case 1:
                    if (computer == 0)
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"scissor"+" You are rock, You win!!");
                    else
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"Scissor"+" You are rock, You lose!!!");break;
                case 2:
                    if (computer == 0)
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"scissor"+" You are paper, You lose!!");
                    else
                        JOptionPane.showMessageDialog(f,"computer is " +"("+computer+")"+"scissor"+" You are paper, You win!!!");break;
                default:
                    JOptionPane.showMessageDialog(f,"wrong value");
            }
        }
        
    }
}
