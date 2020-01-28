/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.*;
/**
 *
 * @author Isaac
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Aaaaaand now, it prints cRaZyPrInT!!!
        
        String cRaZyPrInT = "I am an IS major in a CS class";
        String output = "";

        for (int i = 0; i < cRaZyPrInT.length(); i++) {
            char c = cRaZyPrInT.charAt(i);
            if (i % 2 == 0) {
                output += cRaZyPrInT.substring(i, i + 1).toUpperCase();
            } else {
                output += cRaZyPrInT.substring(i, i + 1);
            }
        }
        System.out.println(output);
    }
}
