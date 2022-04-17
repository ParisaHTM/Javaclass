/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc.Races;

/**
 *
 * human with its features
 */
public class Human extends Race {
    
    public String getName(){
        return "Human";
    }
    
    public int getMinAge() {
        return 15;
    }
    
    public int getMaxAge() {
        return 30;
    }
    
    public double getMinHeightM() {
        return 4.6;
    }
    
    public double getMaxHeightM() {
        return 7.5;
    }
    
    public double getMinHeightF() {
        return 4.4;
    }
    
    public double getMaxHeightF() {
        return 6.7;
    }
    
    public int getMinWeightM(){
        return 90;
    }
    
    public int getMaxWeightM(){
        return 60;
    }
    
    public int getMinWeightF(){
        return 75;
    }
    
    public int getMaxWeightF(){
        return 200;
    }
}
