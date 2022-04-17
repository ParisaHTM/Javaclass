/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpsc5000.javadoc;

import javax.swing.JOptionPane;

/**
 *
 * we use this class to load information of user
 */
public class Load {
    
    private String usernameLoad;
    private String passwordLoad;
    
    public Load(){  // we applied some String that if we have null for password, it doesnt consider both "null" equally
        this.usernameLoad = "NotTheSame";
        this.passwordLoad = "NotTheSame";
    }
    
    public void setUsernameLoad(String userName){
        this.usernameLoad = userName;
    }
    
    public String getUsernameLoad(){
        return this.usernameLoad;
    }
    
    public void setPasswordLoad(String userPassword){
        this.passwordLoad = userPassword;
    }
    
    public String getPasswordLoad(){
        return this.passwordLoad;
    }
}
