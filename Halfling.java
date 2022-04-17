/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc.Races;

import javax.swing.JOptionPane;

/**
 *
 * Halfling with its features
 */
public class Halfling extends Race  {
    
    public String getName() { 
        return "Halfling"; 
    }
    
    public int getStrengthAdjustment() {
        return -2;
    }
    
    public int getDextirityAdjustment() {
        return 2;
    }
       
    public int getWisdomAdjustment() {
        return 2;
    }
    
    public int getMinAge() {
        return 30;
    }
    
    public int getMaxAge() {
        return 50;
    }
    
     public double getMinHeightM() {
        return 3.2;
    }
    
    public double getMaxHeightM() {
        return 4.3;
    }
    
    public double getMinHeightF() {
        return 2.11;
    }
    
    public double getMaxHeightF() {
        return 4.1;
    }
    
    public int getMinWeightM(){
        return 55;
    }
    
    public int getMaxWeightM(){
        return 80;
    }
    
    public int getMinWeightF(){
        return 45;
    }
    
    public int getMaxWeightF(){
        return 70;
    }
}


    







   
