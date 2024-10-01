/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.abstracto.Prototype;
/**
 *
 * @author juand
 */
public class Usuario implements Prototype {
    private String username;
    private String email;
    private String password;

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Override
    public Prototype clone(){
        return new Usuario(this.username, this.email, this.password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
   public String toString(){
       return "\nUsername:" + username + 
               "\n Correo: " + email + 
               "\n Password: " + password +
               "\n";   
   }
}
