/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author parisa
 */
public class Character {
    private int choice;
    private int sum;
    private String nameChar;
    private String gender;
    
    
    public Character(){
    }
    
    public void createCharacter(int choice, String nameChar, String gender)
    {
        this.nameChar = nameChar;
        this.gender = gender;
        this.choice = choice;

        if (choice == 1)
        {           
            Random rand = new Random();
            for(int a = 0; a<4; a++)
            {                
                int i = rand.nextInt(5)+1;
                sum = sum + i;               
                if (sum < 3 & sum > 18)
                {
                    continue;
                }
            }
        }
        if (choice == 2)
        {
            int sum = 0;
            
            while (sum<3 & sum> 18)
            {
                Random rand = new Random();
                int[] number = new int[5];
                //int[] maxArray = new int[3];
                //ArrayList<Integer> number = new ArrayList<Integer> ();

                for (int b = 0; b<6; b++)
                {
                    int i = rand.nextInt(5)+1;
                    number[b] = i;
                }

                for (int c = 0; c<4; c++)
                {        
                    int max_num = number[0];
                    int e = 0;
                    for(int d = 0; d<number.length; d++)
                    {
                        if(number[d]>max_num)
                        {
                            max_num = number[d];
                            e = d;
                        }                    
                    }
                    //maxArray[c] = max_num;
                    number[e] = 0;
                    sum = sum + max_num;
                }
            }            
        }
        
        if (choice == 3)
        {
            int sum = 0;
            
            while (sum<4 & sum> 21)
            {
                Random rand = new Random();
                int[] number = new int[5];
                //int[] maxArray = new int[3];
                //ArrayList<Integer> number = new ArrayList<Integer> ();

                for (int b = 0; b<6; b++)
                {
                    int i = rand.nextInt(5)+1;
                    number[b] = i;
                }

                for (int c = 0; c<4; c++)
                {        
                    int max_num = number[0];
                    int e = 0;
                    for(int d = 0; d<number.length; d++)
                    {
                        if(number[d]>max_num)
                        {
                            max_num = number[d];
                            e = d;
                        }                    
                    }
                    number[e] = 0;
                    
                    //maxArray[c] = max_num;
                    Random plus = new Random();
                    int[] plusNumber = new int[3];                    
                    for (int f = 0; f<4; f++)
                    {
                        int j = plus.nextInt(3)+1;
                        plusNumber[f] = j;
                    }
                    
                    int maxPlus = plusNumber[0];
                    for(int d = 1; d<number.length; d++)
                    {
                        if(plusNumber[d]>max_num)
                        {
                            maxPlus = plusNumber[d];
                        }                    
                    }                   
                    sum = sum + max_num+ maxPlus;
                }
            }            
            
        }
    }
    
}
