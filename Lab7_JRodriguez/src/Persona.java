
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel RC
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String nusuario;
    private String contraseña;
    private Date nacimiento;
    

    public Persona(String nombre, String apellido, String nusuario, String contraseña, Date nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nusuario = nusuario;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
    }

    public Persona(String nusuario, String contraseña) {
        this.nusuario = nusuario;
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNusuario() {
        return nusuario;
    }

    public void setNusuario(String nusuario) {
        this.nusuario = nusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

   

    @Override
    public String toString() {
        return  nusuario ;
    }
    
}
