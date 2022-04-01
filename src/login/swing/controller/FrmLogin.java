/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.swing.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import login.swing.entities.Users;

/**
 *
 * @author rafael
 */
public class FrmLogin {

    private List<Users> db;
    private static final String REGEX = "^(.+)@(.+)$";

    public FrmLogin() {
        this.db = new ArrayList<>();
        this.db.add(new Users("ge17001@ues.edu.sv", "1234"));
        this.db.add(new Users("bryan@ues.edu.sv", "ues"));
        this.db.add(new Users("karlapineda@gmail.com", "Ues123"));
    }

    public boolean verify(String user, String password) {

        for (Users users : db) {
            if (users.getUsuario().equals(user) && users.getContrasenia().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean validateEmail(String email) {
        Pattern estructura = Pattern.compile(REGEX);
        Matcher matcher = estructura.matcher(email);
        return matcher.matches();
    }
    
}
