package cpsc5000.javadoc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Random;
import java.util.*;
/**
 *
 * @author parisa
 */
public class User {
    
    private String username;
    private String password;
    private String emailAddress;
    private String menu;
    
    private String gender;
    
    
    
    public User(String username, String password, String emailAddress)
    {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
    }
    
    public User()
    {
        
    }
    
    public void saveUser(String path) throws FileNotFoundException
    {
        PrintWriter outputFile = new PrintWriter(path + username + ".txt");
        outputFile.write("User = " + username + "\n");
        outputFile.write("Password  = " + password + "\n");
        outputFile.write("Email Address = " + emailAddress + "\n");
        outputFile.close();
    }
    
    
    public void loadUser(String username, String path) throws FileNotFoundException
    {
        String line = null;
        String inFile = path + username +".txt";               
        File inputFile = new File(inFile);
        Scanner inputRead = new Scanner(inputFile);
        line = inputRead.nextLine();
        line = inputRead.nextLine();
        System.out.println(line);
        line = inputRead.nextLine();
        System.out.println(line);
    }
}        
    

