/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc;

import cpsc5000.javadoc.Races.Race;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *by this class we define all features of a character
 * 
 */
public class Character 
{
    private String nameChar = null;
    private String gender;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int age;
    private double height;
    private int weight;
    private String alignment = null;
    private String[] loadChracterArray = new String[13];
    private double[] extraAbility = new double[6];
    //private Race race;
    
    Random random = new Random();
    Race race;
    public Character(){  //using this constructir for loading character
        
    }
    public Character(int choice, String nameChar, String gender, Race race) //this constructor is for create charcater
    {
        this.race = race; 
        this.gender = gender;
        this.nameChar = nameChar;
        
        this.age = random.nextInt(race.getMinAge(),race.getMaxAge());
        if (gender.equals("M"))
        {
            this.height = random.nextDouble(race.getMinHeightM(), race.getMaxHeightM());
            this.weight = random.nextInt(race.getMinWeightM(), race.getMaxWeightM());
        }
        
        if(gender.equals("F"))
        {
            this.height = random.nextDouble(race.getMinHeightF(), race.getMaxHeightF());
            this.weight = random.nextInt(race.getMinWeightF(), race.getMaxWeightF());
        }
                
                
        int[] scores = new int[6];
        
        
        Methods meth = new Methods();
        Score sco = new Score();
        int[] methScore = new int[6];
        
        for (int i = 0; i < methScore.length; i++) {
            if (choice == 1)
            {            
                methScore[i] = meth.chooseMethod1(); 
            }
            if (choice == 2)
            {
                methScore[i] = meth.chooseMethod2(); 
            }     
            if (choice == 3)
            {
                methScore[i] = meth.chooseMethod3();            
            }    
        }

    
        
        int[] scoreAbility = sco.getScore(methScore);
        this.strength = scoreAbility[0];
        this.dexterity = scoreAbility[1];
        this.constitution = scoreAbility[2];
        this.intelligence = scoreAbility[3];
        this.wisdom = scoreAbility[4];
        this.charisma = scoreAbility[5];
        
        //for extra credit
        for (int k = 0; k<6 ; k++){
            this.extraAbility[k] = scoreAbility[k];
        }
        
        JOptionPane.showMessageDialog(null,"Strength = "+ this.strength+ "\n"+ "Dexterity = "+ this.dexterity +"\n"+
                "Constitution = "+ this.constitution+"\n"+"Intelligence = " + this.intelligence + "\n"+
                "Wisdom = "+ this.wisdom+"\n"+ "Charisma = "+ this.charisma+ "\n");
    }
    
    public int getStrength(){
        return this.strength + race.getStrengthAdjustment();
    }
    
    public int getDexterity(){
        return this.dexterity + race.getDextirityAdjustment();
    }
    
    public int getConstitution(){
        return this.constitution + race.getConstitutionAdjustment();
    }
    
    public int getIntelligence(){
        return this.intelligence + race.getIntelligenceAdjustment();
    }
    
    public int getWisdom(){
        return this.wisdom + race.getWisdomAdjustment();
    }
    
    public int getCharisma(){
        return this.charisma + race.getCharismaAdjustment();
    }
    
    public void display(){   //getting all abilities initialized in pervious step and diplay them
        
        double heightInchFeet = getHeight();
        String intHeight = String.valueOf(heightInchFeet);
        
        JOptionPane.showMessageDialog(null,
        "Name = " + getNameChar() + "\n"
        +"Race = " + race.getName() +"\n"        
        + "Gender = " + getGender() + "\n"
        + "Strength = " + getStrength() + "\n"
        + "Dexterity = " + getDexterity() + "\n"
        + "Constitution = " + getConstitution() + "\n"
        + "Intelligence = " + getIntelligence() + "\n"
        + "Wisdom = " + getWisdom() + "\n"
        + "Charisma = " + getCharisma() + "\n"
        + "Alignment = " + getAlignment() + "\n"
        + "Age = " + getAge() + "\n"
        + "Height = " + intHeight.substring(0,1)+ "\'" + intHeight.substring(2,3)+"\""+"\n"
        + "Weigth = " + getWeight());
    }    
    
    public String getGender(){
        return this.gender;
    }
    
    
    public String getNameChar(){
        return this.nameChar;
    }
    
    public void setAlignment(String alignment)
    {        
        this.alignment = alignment;
    }
    
    public String getAlignment(){
        return this.alignment;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public void saveCharacter(User user, String path) throws FileNotFoundException  // save character with username+character name in this way we can find out whci character made which user!
    {
        double heightInchFeet = getHeight();
        String intHeight = String.valueOf(heightInchFeet);
        PrintWriter outputFile = new PrintWriter(path + user.getUserName()+ "_" + getNameChar() + ".txt");
        outputFile.write(getNameChar() + "\n");
        outputFile.write(race.getName() +"\n");
        outputFile.write(getGender() + "\n");
        outputFile.write(getStrength() + "\n");
        outputFile.write(getDexterity() + "\n");
        outputFile.write(getConstitution() + "\n");
        outputFile.write(getIntelligence() + "\n");
        outputFile.write(getWisdom() + "\n");
        outputFile.write(getCharisma() + "\n");
        outputFile.write(getAlignment() + "\n");
        outputFile.write(getAge() + "\n");
        outputFile.write(intHeight.substring(0,1)+ "\'" + intHeight.substring(2,3)+"\"" + "\n");
        outputFile.write(getWeight() + "\n");
        
        outputFile.close();
    }
    
    public void loadCharacter(String nameChar,String nameUser, String path)throws FileNotFoundException  //load user from the sam path that it is saved
    {
        
        this.nameChar = nameChar;
        String inFile = path + nameUser+ "_" + nameChar +".txt";              
        File inputFile = new File(inFile);
        Scanner inputRead = new Scanner(inputFile);
        this.loadChracterArray[0] =inputRead.nextLine(); 
        System.out.println("Name = " + loadChracterArray[0]);
        this.loadChracterArray[1] = inputRead.nextLine();
        System.out.println("Race = " + loadChracterArray[1]);
        this.loadChracterArray[2] = inputRead.nextLine();
        System.out.println("Gender = " + loadChracterArray[2]);
        this.loadChracterArray[3] = inputRead.nextLine();
        System.out.println("Strength = " + loadChracterArray[3]);
        this.loadChracterArray[4] = inputRead.nextLine();
        System.out.println("Dexterity = " + loadChracterArray[4]);
        this.loadChracterArray[5] = inputRead.nextLine();
        System.out.println("Constitution = " + loadChracterArray[5]);
        this.loadChracterArray[6] = inputRead.nextLine();
        System.out.println("Intelligence = " + loadChracterArray[6]);
        this.loadChracterArray[7] = inputRead.nextLine();
        System.out.println("Wisdom = " + loadChracterArray[7]);
        this.loadChracterArray[8] = inputRead.nextLine();
        System.out.println("Charisma = " + loadChracterArray[8]);
        this.loadChracterArray[9] = inputRead.nextLine();
        System.out.println("Alignment = " + loadChracterArray[9]);
        this.loadChracterArray[10] = inputRead.nextLine();
        System.out.println("Age = " + loadChracterArray[10]);
        this.loadChracterArray[11] = inputRead.nextLine();
        System.out.println("Height = " + loadChracterArray[11]);
        this.loadChracterArray[12] = inputRead.nextLine();
        System.out.println("Weigth = " + loadChracterArray[12]);
        
    }
    
    public double[] getExtraAbility(){
        return this.extraAbility;
    }
    
}
