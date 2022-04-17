/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc.Races;

/**
 *
 * Elf with its features
 */
public class Elf extends Race {
        
    public String getName() { 
        return "Elf"; 
    }
    public int getDextirityAdjustment() {
        return 2;
    }
    
    public int getIntelligenceAdjustment() {
        return 2;
    }
    
    public int getConstitutionAdjustment() {
        return -2;
    }
    
    public int getMinAge() {
        return 80;
    }
    
    public int getMaxAge() {
        return 180;
    }
    
    public double getMinHeightM() {
        return 4;
    }
    
    public double getMaxHeightM() {
        return 5.6;
    }
    
    public double getMinHeightF() {
        return 3.8;
    }
    
    public double getMaxHeightF() {
        return 5.4;
    }
    
    public int getMinWeightM(){
        return 70;
    }
    
    public int getMaxWeightM(){
        return 130;
    }
    
    public int getMinWeightF(){
        return 65;
    }
    
    public int getMaxWeightF(){
        return 100;
    }
}
