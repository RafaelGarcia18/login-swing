/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.swing.entities;

/**
 *
 * @author rafael
 */
public class Users {

    private String Usuario;
    private String Contrasenia;

    public Users() {
    }

    public Users(String Usuario, String Contrasenia) {
        this.Usuario = Usuario;
        this.Contrasenia = Contrasenia;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }
    
    
    
}
