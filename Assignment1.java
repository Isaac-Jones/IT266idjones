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
        
        System.out.print("Please enter a string");
        Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
        
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                output += input.substring(i, i + 1).toUpperCase();
            } else {
                output += input.substring(i, i + 1);
            }
        }
        System.out.println(output);
    }
}
