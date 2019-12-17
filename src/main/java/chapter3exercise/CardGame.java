/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3exercise;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author tayyor
 */
public class CardGame {
    public static void main(String args[]){
        JFrame f = new JFrame();
        Random rand = new Random();
        int card;
        String Card;
        int rand1 , rand2;
        rand1 = rand.nextInt(13);
        rand2 = rand.nextInt(4);
        JOptionPane.showMessageDialog(f,rand1+","+ rand2);
        switch(rand1){
            case 1: Card = "Ace";
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 2: card = 2;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 3: card = 3;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 4: card = 4;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 5: card = 5;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 6: card = 6;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 7: card = 7;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;              
            case 8: card = 8;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 9: card = 9;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 10: card = 10;
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+card +" Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 11: Card = "Jack";
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 12: Card = "Queen";
            switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            case 13: Card = "King";
                switch (rand2){
                    case 1: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Hearts");break;
                    case 2: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Spades");break;
                    case 3: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Diamonds");break;
                    case 4: JOptionPane.showMessageDialog(f,"The card you picked is "+Card +" of "+"Clubs");break;
                    default: JOptionPane.showMessageDialog(f,"invalid input");
                  }break;
            default: JOptionPane.showMessageDialog(f,"invalid input");
             }    
        }
            
    }

