/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

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
        String groovyWord = "I am an IS major in a CS class";
        
        
        for(int index = 0; index < groovyWord.length(); index++)
        {
            char letter = groovyWord.charAt(index);
            System.out.print(letter);
        }
    }
    
}
