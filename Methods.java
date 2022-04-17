/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc;
import java.util.Random;

/**
 *
 * Defining methods that user use to create scores for different ability
 */
public class Methods {
    
    int[] score = new int[6];
    
    public Methods(){       
    }
    public int chooseMethod1()   // sum of three random number between 1 - 6
    {
        Random rand = new Random();

        return rand.nextInt(6) + rand.nextInt(6) + rand.nextInt(6) + 3;
    }
    
    public int chooseMethod2()  // sum of the best 3 number of 5 number choosen randomly between 1-6
    {                           // we use bubble sort to find the best three number
        Random rand = new Random();

        int[] dice = new int[5]; 
        for (int i = 0; i < dice.length; i++) {
            dice[i] = rand.nextInt(6) + 1;
        }
        
        for (int i = 0; i < dice.length; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i] < dice[j]) {
                    int temp = dice[i];
                    dice[i] = dice[j];
                    dice[j] = temp;
                }
            }
        }
        return dice[0] + dice[1] + dice[2];
    }
    
    public int chooseMethod3()  // sum of the best three number of 5 random number between 1-6 + 1 random numbet between 1-6 
    {                           // we use bubble sort to find the best three number
        Random rand = new Random();

        int[] dice = new int[5]; 
        for (int i = 0; i < dice.length; i++) {
            dice[i] = rand.nextInt(6) + 1;
        }
        
        for (int i = 0; i < dice.length; i++) {
            for (int j = i + 1; j < dice.length; j++) {
                if (dice[i] < dice[j]) {
                    int temp = dice[i];
                    dice[i] = dice[j];
                    dice[j] = temp;
                }
            }
        }
        
        int sum = dice[0] + dice[1] + dice[2];
        return sum + rand.nextInt(3) + 1;      
    }   
}
