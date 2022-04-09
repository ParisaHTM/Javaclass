package cpsc5000.javadoc;

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

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        String path = "/Users/parisa/NetBeansProjects/javadoc/";
        int choice = 0;

        while (choice != 7) 
        {

            String menu = JOptionPane.showInputDialog("Please select the number of your option:\n"
                +"1. Create user account\n"
                +"2. Load user account\n"
                +"3. Create character\n"
                +"4. Display character\n "
                +"5. Save character\n"
                +"6. Load character\n"
                +"7. Exit");

            choice = Integer.parseInt(menu);

            //loop over menu 
            if (choice == 1) 
            {
                String userName = JOptionPane.showInputDialog("Please enter your user name.");
                File userFile = new File(path + userName + ".txt");
                if (userFile.exists()) {
                    System.out.println("This user name already exists. Please choose another user name");
                    continue;
                }
                String password = JOptionPane.showInputDialog("Please, enter your password.");
                String emailAddress = JOptionPane.showInputDialog("Please enter your email address.");
                
                User user = new User(userName, password, emailAddress);
                user.saveUser(path);
                continue;
            }

            if (choice == 2) 
            {        // load user account
                String username = JOptionPane.showInputDialog("Please enter your user name.");
                System.out.println("User = " + username);
                User user = new User();
                user.loadUser(username, path);
                continue;
            }

            if (choice == 3) 
            {     // create character
                String name = JOptionPane.showInputDialog("Please insert your character name.");
                String gender = JOptionPane.showInputDialog("Please select character gender(M or F).");
                String menu_2 = JOptionPane.showInputDialog("Please select one of this method for assigning ability scores"+"\n"
                    + "1 - Method 1 = Sum of 3d6. Min/Max = 3/18"+ "\n"
                    + "2 - Method 2 = Sum of best 3 of 5d6. Min/Max = 3/18"+"\n"
                    + "3 - Method 3 = Sum of best 3 of 5d6 plus 1d3. Min/Max = 4/21"+"\n");
                String Race=JOptionPane.showInputDialog("Please select character Race :"+"\n"
                    +"1 - Human"+"\n"
                	+"2 - Elf"+"\n"
                	+"3 - Dwarf"+"\n"
                	+"4 - Gnome"+"\n"
                	+"5 - Halfling"+"\n");
                
               // Scanner num = new Scanner(System.in); //Commented by Ali
               // int choiceNum = num.nextInt();        // Commented by Ali 
                Character charc = new Character();
                choice = Integer.parseInt(menu_2);
                int race=Integer.parseInt(Race);
                charc.createCharacter(choice , name, gender, race);
                //charc.createCharacter(choiceNum , name, gender, race);  //Commented by Ali
                
            }

        }

    }

}