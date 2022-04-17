/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc.Races;

import javax.swing.JOptionPane;

/**
 *
 * Dwarf with its features
 */
public class Dwarf extends Race  {
    
    public String getName() { 
        return "Dwarf"; 
    }
    
    public int getStrengthAdjustment() {
        return 2;
    }
        
    public int getConstitutionAdjustment() {
        return 2;
    }
   
    public int getCharismaAdjustment() {
        return -2;
    }
        
    public int getMinAge() {
        return 40;
    }
    
    public int getMaxAge() {
        return 70;
    }
    
     public double getMinHeightM() {
        return 4;
    }
    
    public double getMaxHeightM() {
        return 4.10;
    }
    
    public double getMinHeightF() {
        return 3.8;
    }
    
    public double getMaxHeightF() {
        return 4.7;
    }
    
    public int getMinWeightM(){
        return 150;
    }
    
    public int getMaxWeightM(){
        return 230;
    }
    
    public int getMinWeightF(){
        return 125;
    }
    
    public int getMaxWeightF(){
        return 180;
    }
}


    







   
