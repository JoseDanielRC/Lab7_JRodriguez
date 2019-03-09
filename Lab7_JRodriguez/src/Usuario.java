
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
public class Usuario extends Persona{
   private  ArrayList<Playlist> pl=new ArrayList();
    private ArrayList<Artista>artistas=new ArrayList();
    private ArrayList<Cancion>canciones=new ArrayList();

    public Usuario(String nombre, String apellido, String nusuario, String contraseña, Date nacimiento) {
        super(nombre, apellido, nusuario, contraseña, nacimiento);
    }

    public Usuario(String nusuario, String contraseña) {
        super(nusuario, contraseña);
    }

    
    
   
    public ArrayList<Playlist> getPl() {
        return pl;
    }

    public void setPl(ArrayList<Playlist> pl) {
        this.pl = pl;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    @Override
    public String toString() {
        return super.getNusuario();
    }
   
    
}
