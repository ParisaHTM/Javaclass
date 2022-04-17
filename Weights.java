
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Weights {

    private String race;
    private String gender;
   
    
    
    public void setGender(){
        this.gender = JOptionPane.showInputDialog("Please select character gender(M or F).");
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setRace(){
        this.race = JOptionPane.showInputDialog("Please select the race.");
    }
    
    public String getRace(){
        return this.race;
    }
    
    if(this.race==1)// Random Weight for Human
        {
            if (gender.equals("M"))
            {
            Random weight = new Random();
            int a = weight.nextInt(170);
            return a + 90;
            }
            else if (gender.equals("F"))
            {
            Random weight = new Random();
            int a = weight.nextInt(125);
            return a + 75;
            } 
            else
            {
            System.out.println("unknown gender");
            return 0;
            }
        }
        
        if(this.race==2)// Random Weight for Elf 
        {
            
            this.gender=JOptionPane.showInputDialog("Please select the gender:\n" + "1 - F \n" + "2 - M \n");
            
            if (gender.equals("M"))
            {
            Random weight = new Random();
            int a = weight.nextInt(60);
            return a + 70;
            }
            else if (gender.equals("F"))
            {
            Random weight = new Random();
            int a = weight.nextInt(35);
            return a + 65;
            } 
            else
            {
            System.out.println("unknown gender");
            return 0;
            }
        }
        
        if(this.race==3)// Random Weight for Dwarf
        {
            if (gender.equals("M"))
            {
            Random weight = new Random();
            int a = weight.nextInt(80);
            return a + 150;
            }
            else if (gender.equals("F"))
            {
            Random weight = new Random();
            int a = weight.nextInt(85);
            return a + 125;
            } 
            else
            {
            System.out.println("unknown gender");
            return 0;
            }
        }
        
        if(this.race==4)// Random Weight for Gnome
        {
            if (gender.equals("M"))
            {
            Random weight = new Random();
            int a = weight.nextInt(20);
            return a + 40;
            }
            else if (gender.equals("F"))
            {
            Random weight = new Random();
            int a = weight.nextInt(55);
            return a + 35;
            } 
            else
            {
            System.out.println("unknown gender");
            return 0;
            }
        }
        
        if(this.race==5)// Random Weight for Halfling
        {  
            if (gender.equals("M"))
            {
            Random weight = new Random();
            int a = weight.nextInt(25);
            return a + 55;
            }
            else if (gender.equals("F"))
            {
            Random weight = new Random();
            int a = weight.nextInt(25);
            return a + 45;
            } 
            else
            {
            System.out.println("unknown gender");
            return 0;
            }
        }
        return 0;
    }
}
