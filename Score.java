/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * by this class we allow user to assign each score to the ability that they want
 * we use this class in character class in choice 3
 */
public class Score 
{
    String[] ability = {"strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };
    
    public int[] getScore(int[] methodScore)
    {
        Scanner input = new Scanner(System.in);
        int[] methodScoreAbility = new int[6];
        for (int ii = 0; ii < ability.length; ii++)
        {
            String prompt = new String();
            for(int jj = 0; jj < methodScore.length; jj++){
                if(methodScore[jj] != 0){
                    prompt += Integer.toString(jj+1) + " - " + methodScore[jj]+"\n";
                }
            }
            String scoreIndexStr = JOptionPane.showInputDialog("Which score do you choose for "+ ability[ii]+"\n"+prompt);
            int scoreIndex = Integer.parseInt(scoreIndexStr);
            //int scoreIndex = input.nextInt();
            methodScoreAbility[ii] = methodScore[scoreIndex-1];
            methodScore[scoreIndex-1] = 0;
        } 
        return methodScoreAbility; 
    }   
}
