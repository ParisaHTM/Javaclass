package cpsc5000.javadoc;

import cpsc5000.javadoc.Races.Race;
import cpsc5000.javadoc.Races.Human;
import cpsc5000.javadoc.Races.Elf;
import cpsc5000.javadoc.Races.Dwarf;
import cpsc5000.javadoc.Races.Gnome;
import cpsc5000.javadoc.Races.Halfling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.FileReader;

/**
 *
 * @author parisa
 */
public class Javadoc {

    String gender;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        User user = null;           //import user class as null to consider it in choise 2. to see if a user create  user or not
        Load load = new Load();     //import load class
        String path = "/Users/parisa/NetBeansProjects/javadoc/";
        int choice = 0;
        Character charc = null;     //import Character class as null that in choice 4 to see if there is any created character or not!

        while (choice != 9) {
            String menu = JOptionPane.showInputDialog("Please select the number of your option:\n"
                    + "1. Create user account\n"
                    + "2. Load user account\n"
                    + "3. Create character\n"
                    + "4. Display character\n"
                    + "5. Save character\n"
                    + "6. Load character\n"
                    + "7. Exit\n"
                    + "8. Extra Credit");

            choice = Integer.parseInt(menu);

            //create a user account 
            if (choice == 1) {
                
                user = new User();
                user.setUsername();
                String usernameUser = user.getUserName();
                File userFile = new File(path + usernameUser + ".txt");
                if (userFile.exists()) {
                    JOptionPane.showMessageDialog(null, "This user name already exists. Please choose another user name or load your username");
                    continue;
                }
                user.setPassword();
                user.setEmailAddress();

                user.getPassword();
                user.getEmailAddress();

                user.saveUser(path);
                continue;
            }
            
            // load user account
            if (choice == 2) {        
                
                user = new User();  //calling a new user class to see initialized from scratch and to see if it is equal to the same information that user saved or not
                String userNameLoad = JOptionPane.showInputDialog("Please enter your user name:");
                load.setUsernameLoad(userNameLoad);  //user insert username
                String username = load.getUsernameLoad();
                File loadUserPath = new File(path + username + ".txt");
                if (loadUserPath.exists()) {  // to see if there is any user with the same name or not
                    
                    String[] informationUser = new String[2];  // if it exist, we want user to insert their password!
                    String userPassword = JOptionPane.showInputDialog("Please enter your password:");
                    load.setPasswordLoad(userPassword);
                    String password = load.getPasswordLoad();
                    informationUser = user.loadUser(username, path);
                    

                    if (password.equals(informationUser[0])) {  // check the password with the password that user saved!
                        continue;
                    } else {
                        String email = JOptionPane.showInputDialog("Your password is wrong.Please enter your email address:");
                        if (email.equals(informationUser[1])) {
                            JOptionPane.showMessageDialog(null, "It's your password: " + informationUser[0] + "\n");
                            continue;
                        } else {
                            JOptionPane.showMessageDialog(null, "Your email address is wrong. Please try again!");
                            continue;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Your user account does not exist. Please create your user name first:");
                    continue;
                }
            }
            
            // create character
            if (choice == 3) {     

                if (user != null){ // if there is not any initializing for user, user are not allowed to create a charcater!
                    String name = JOptionPane.showInputDialog("Please select character name:");
                    String gender = JOptionPane.showInputDialog("Please select character gender(M or F):");

                    //     charc.setRace(new Elf());
                    int option = 0;
                    while (option == 0) {
                        String menu_2 = JOptionPane.showInputDialog("Please select one of this method for assigning ability scores" + "\n"
                                + "1 - Method 1 = Sum of 3d6. Min/Max = 3/18" + "\n"
                                + "2 - Method 2 = Sum of best 3 of 5d6. Min/Max = 3/18" + "\n"
                                + "3 - Method 3 = Sum of best 3 of 5d6 plus 1d3. Min/Max = 4/21" + "\n");
                        //race 
                        int choiceNum = Integer.parseInt(menu_2);

                        //int race=Integer.parseInt(Race);                  
                        String raceChoiceStr = JOptionPane.showInputDialog("Please select character Race :" + "\n"
                                + "1 - Human" + "\n"
                                + "2 - Elf" + "\n"
                                + "3 - Dwarf" + "\n"
                                + "4 - Gnome" + "\n"
                                + "5 - Halfling" + "\n");
                        // user choice N
                        int raceChoice = Integer.parseInt(raceChoiceStr); //chosse race
                        Race race = null;
                        if (raceChoice == 1) {
                            race = new Human();
                        }
                        if (raceChoice == 2) {
                            race = new Elf();
                        }
                        if (raceChoice == 3) {
                            race = new Dwarf();
                        }
                        if (raceChoice == 4) {
                            race = new Gnome();
                        }
                        if (raceChoice == 5) {
                            race = new Halfling();
                        }
                        charc = new Character(choiceNum, name, gender, race); // create character according to the race selected

                        String alignments = JOptionPane.showInputDialog("Do you want to choose an alignment for your character?\n1- Yes \n2- No");
                        int choiceAlignment = Integer.parseInt(alignments);
                        if (choiceAlignment == 1) {
                            String[] alignmentArr = {"Lawful Good", "Lawful Evil", "Neutral Good", "Neutral Evil",
                                "Chaotic Good", "Chaotic Evil"};
                            String alignment = JOptionPane.showInputDialog("Please select character's alignment :" + "\n"
                                    + "1 - Lawful Good" + "\n"
                                    + "2 - Lawful Evil" + "\n"
                                    + "3 - Neutral Good" + "\n"
                                    + "4 - Neutral Evil" + "\n"
                                    + "5 - Chaotic Good" + "\n"
                                    + "6 - Chaotic Evil" + "\n");
                            int choiceAlign = Integer.parseInt(alignment);
                            charc.setAlignment(alignmentArr[choiceAlign - 1]);
                        }

                        String agree = JOptionPane.showInputDialog("Are you satisfied with scores?\n1- Yes \n2- No");
                        int choiceAgree = Integer.parseInt(agree);
                        option++;
                        if (choiceAgree == 2) {
                            option = 0;
                            continue;
                        }
                    }
                } 
            
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please login to your account first!");                                
                }
                continue;
            }
            if (choice == 4) {

                if (charc != null)
                {
                    charc.display();
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please create a character first by selecting choice 3");
                }
                continue;
            }
            
            //save character
            if (choice == 5) 
            {
                // if there is any character
                if (charc != null)
                {
                    charc.saveCharacter(user, path);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please create a character first by selecting choice 3");
                }
                continue;

            }
            
            // Load Character
            if (choice == 6){
                Character charcLoad = new Character();
                String name = JOptionPane.showInputDialog("Please enter your user name:");
                File loadUserPath = new File(path + name + ".txt");
                if (loadUserPath.exists()) 
                {
                    String charName = JOptionPane.showInputDialog("Please enter your character name:");
                    File loadUserCharPath = new File(path + name + charName + ".txt");
                    if (loadUserCharPath.exists()) 
                    {
                        charcLoad.loadCharacter(charName, name, path);
                    }
                    else
                    {
                      JOptionPane.showMessageDialog(null, "Please first create a character by choice 3");  
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please first create a user by choice 2");
                }
                continue;
            }
            
            //Exit
            if(choice == 7)
            {
               JOptionPane.showMessageDialog(null,"Hope to see you again :)");
               break; 
            }
            
            // Extra Credit
            if (choice == 8){
                if (charc != null)
                {
                    String nameExtra = charc.getNameChar();
                    String genderExrae = charc.getGender();
                    charc.getExtraAbility();
                    
                    String raceChoiceStr = JOptionPane.showInputDialog("Please select character Race :" + "\n"
                                + "1 - Human" + "\n"
                                + "2 - Elf" + "\n"
                                + "3 - Dwarf" + "\n"
                                + "4 - Gnome" + "\n"
                                + "5 - Halfling" + "\n");
                        // user choice N
                        int raceChoice = Integer.parseInt(raceChoiceStr); //chosse race
                        Race race = null;
                        if (raceChoice == 1) {
                            race = new Human();
                        }
                        if (raceChoice == 2) {
                            race = new Elf();
                        }
                        if (raceChoice == 3) {
                            race = new Dwarf();
                        }
                        if (raceChoice == 4) {
                            race = new Gnome();
                        }
                        if (raceChoice == 5) {
                            race = new Halfling();
                        }
                        
                        ExtraCredit extra = new ExtraCredit(race);
                        System.out.println(extra.getConstitution());
                        
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Please create a character first by selecting choice 3");
                }
                continue;
                
            }
        }
    }
}
