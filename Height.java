/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc;
import java.util.Random;
/**
 *
 * @author Awab
 */
public class Height extends Character{
    
    private double height;
   
    
    public Height (){
        
        height = 0;
        
    }
    
    
    
    public double generateHeight(){
       
         
        Random hRandom = new Random();
        
        switch (race){
             case "Human" ->              {//If the race is Human
                 if (gender.equalsIgnoreCase("M"))
                     height = hRandom.nextDouble(4.6, 7.5);
                 else
                     height = hRandom.nextDouble(4.4, 6.7);
             }
             case "Elf" ->              {//If the race is Elf
                 if (gender.equalsIgnoreCase("M"))
                     height = hRandom.nextDouble(4, 5.6);
                 else
                     height = hRandom.nextDouble(3.8, 5.4);
                 
             }
             case "Dwarf" ->              {//If the race is Dwarf
                 if (gender.equalsIgnoreCase("M"))
                     height = hRandom.nextDouble(4, 4.10);
                 else
                     height = hRandom.nextDouble(3.8, 4.7);
             }
             case "Gnome" ->              {//If the race is Gnome
                 if (gender.equalsIgnoreCase("M"))
                     height = hRandom.nextDouble(2.6, 3.5);
                 else
                     height = hRandom.nextDouble(2.4, 3.3);
             }
             case "Halfling" ->              {//If the race is Halfling
                 if (gender.equalsIgnoreCase("M"))
                     height = hRandom.nextDouble(3.2, 4.3);
                 else
                     height = hRandom.nextDouble(2.11, 4.1);
             }
            
        }
         return height;
    }
    
    
    
    
}
