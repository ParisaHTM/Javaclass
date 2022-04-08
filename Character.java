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
public class Character 
{
    private int choice;
    private int sum;
    private String nameChar;
    private String gender;
    private int strength;
    private int dexterity;
    private int constitution;
    private int Intelligence;
    private int wisdom;
    private int charisma;
    
    public Character(){
    }
    
    
    public int chooseMethod1()
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
        
        return sum;
    }
    
    public int chooseMethod2()
    {
        sum = 0;
        while (sum<3 & sum> 18)
        {
            for(int s = 0; s<7; s++)
            {
                Random rand = new Random();
                int[] number = new int[5];
                
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
        return sum;
    }
    
    public int chooseMethod3()
    {
        sum = 0;
            
        while (sum<4 & sum> 21)
        {
            for(int s = 0; s<7; s++)
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
        return sum;        
    }
    
    public void createCharacter(int choice, String nameChar, String gender)
    {
        this.nameChar = nameChar;
        this.gender = gender;
        this.choice = choice;

        if (choice == 1)
        {   
            this.strength = chooseMethod1();
            this.dexterity = chooseMethod1();
            this.constitution = chooseMethod1();
            this.Intelligence = chooseMethod1();
            this.wisdom = chooseMethod1();
            this.charisma = chooseMethod1();  
        }
        if (choice == 2)
        {
            this.strength = chooseMethod2();
            this.dexterity = chooseMethod2();
            this.constitution = chooseMethod2();
            this.Intelligence = chooseMethod2();
            this.wisdom = chooseMethod2();
            this.charisma = chooseMethod2(); 
        }
        
        if (choice == 3)
        {
            this.strength = chooseMethod3();
            this.dexterity = chooseMethod3();
            this.constitution = chooseMethod3();
            this.Intelligence = chooseMethod3();
            this.wisdom = chooseMethod3();
            this.charisma = chooseMethod3();             
            
        }  
    }
    public String displayScores(){
        
    }
}
