/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc.Races;

import javax.swing.JOptionPane;

/**
 *
 * Gnome with its features
 */
public class Gnome extends Race {
    
    public String getName() { 
        return "Genome"; 
    }
    
    public int getStrengthAdjustment() {
        return -2;
    }
    
    public int getDextirityAdjustment() {
        return 2;
    }
    
    public int getConstitutionAdjustment() {
        return 2;
    }
    
    public int getMinAge() {
        return 30;
    }
    
    public int getMaxAge() {
        return 60;
    }
    
     public double getMinHeightM() {
        return 2.6;
    }
    
    public double getMaxHeightM() {
        return 3.5;
    }
    
    public double getMinHeightF() {
        return 2.4;
    }
    
    public double getMaxHeightF() {
        return 3.3;
    }
    
    public int getMinWeightM(){
        return 40;
    }
    
    public int getMaxWeightM(){
        return 60;
    }
    
    public int getMinWeightF(){
        return 35;
    }
    
    public int getMaxWeightF(){
        return 55;
    }
}


    







   
