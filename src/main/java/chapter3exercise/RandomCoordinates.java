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
public class RandomCoordinates {
    public static void main(String args[]){
        JFrame f = new JFrame();
        Random rand = new Random();
        int height,width;
        height = rand.nextInt(100);
        width = rand.nextInt(200);
        JOptionPane.showMessageDialog(f," height and width: "+"("+height+","+ width+")");
    }
}
