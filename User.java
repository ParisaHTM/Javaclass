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
 * by this class user can create a user and password for him/herself
 */
public class User {
    
    private String username;
    private String password;
    private String emailAddress;    
    private String line = null;
    private String[] Information = new String[2];
    
        
    public User()
    {
        this.username = null;
        this.password = null;
        this.emailAddress = null;
    }
    
    
    public void saveUser(String path) throws FileNotFoundException  //save user in the path that user use n main class
    {
        PrintWriter outputFile = new PrintWriter(path + this.username + ".txt");
        outputFile.write(this.username + "\n");
        outputFile.write(this.password + "\n");
        outputFile.write(this.emailAddress + "\n");
        outputFile.close();
    }
    
    
    public String[] loadUser(String username, String path) throws FileNotFoundException // load user from that same path that it is saved
    {        
        //String[] Information = new String[3];
        this.username = username;
        String inFile = path + username +".txt";               
        File inputFile = new File(inFile);
        Scanner inputRead = new Scanner(inputFile);
        inputRead.nextLine(); //username
        this.Information[0] = inputRead.nextLine(); //password
        this.Information[1] = inputRead.nextLine(); //email
        
        return this.Information;
    }
    
    public void setUsername(){
        this.username = JOptionPane.showInputDialog("Please enter your user name.");
    }
    
    public void setPassword(){
        this.password = JOptionPane.showInputDialog("Please, enter your password.");
    }
    
    public void setEmailAddress(){
        this.emailAddress = JOptionPane.showInputDialog("Please enter your email address.");
    }

    public String getUserName(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    
    public String getEmailAddress(){
        return this.emailAddress;
    }
}        
    

