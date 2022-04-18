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
 * With this class the user can create a username and password 
 */
public class User {
    //creating instance variables 
    private String username;
    private String password;
    private String emailAddress;    
    private String line = null;
    private String[] Information = new String[2];
    
    //constructor that does not take in any parameters
    public User()
    {
        //initializing the instance variables and setting them to null
        this.username = null;
        this.password = null;
        this.emailAddress = null;
    }
    
    //setting up the saveUser method
    public void saveUser(String path) throws FileNotFoundException  //save user in the path that user uses in main class
    {
        PrintWriter outputFile = new PrintWriter(path + this.username + ".txt");
        outputFile.write(this.username + "\n");
        outputFile.write(this.password + "\n");
        outputFile.write(this.emailAddress + "\n");
        outputFile.close();
    }
    
    //setting up the loadUser method
    public String[] loadUser(String username, String path) throws FileNotFoundException // load user from that same path that is saved
    {        
        String[] Information = new String[3]; //creating a new array
        this.username = username;
        String inFile = path + username +".txt";               
        File inputFile = new File(inFile);
        Scanner inputRead = new Scanner(inputFile);
        inputRead.nextLine(); //username
        this.Information[0] = inputRead.nextLine(); //password
        this.Information[1] = inputRead.nextLine(); //email
        
        return this.Information;
    }
    
    // Setting up the setters and getters
    // Setting all of them public so they can be accessed outside of the User class
    public void setUsername(){
        //this is a local variable 
        //this.username refers to the instance variable
        //JoptionPane allows for this method to set the instance variable to the input recieve 
        this.username = JOptionPane.showInputDialog("Please enter your user name: ");
    }
    
    public void setPassword(){
        //this is a local variable 
        //this.password refers to the instance variable
        //JoptionPane allows for this method to set the instance variable to the input recieve 
        this.password = JOptionPane.showInputDialog("Please, enter your password: ");
    }
    
    public void setEmailAddress(){
        //this is a local variable 
        //this.emailAddress refers to the instance variable
        //JoptionPane allows for this method to set the instance variable to the input recieve 
        this.emailAddress = JOptionPane.showInputDialog("Please enter your email address: ");
    }

    public String getUserName(){
        //return type matches the instance variable
        //returning the value of username back to the caller
        return this.username;
    }
    
    public String getPassword(){
        //return type matches the instance variable
        //returning the value of password back to the caller
        return this.password;
    }
    
    
    public String getEmailAddress(){
        //return type matches the instance variable
        //returning the value of emailAddress back to the caller
        return this.emailAddress;
    }
}        
    

