
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
class Artista extends Persona{
    private ArrayList<Cancion>canciones=new ArrayList();
     private ArrayList<Usuario>seguidores=new ArrayList();
      private ArrayList<Album>albunes=new ArrayList();

    public Artista(String nombre, String apellido, String nusuario, String contraseña, Date nacimiento) {
        super(nombre, apellido, nusuario, contraseña, nacimiento);
    }

    

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(ArrayList<Usuario> seguidores) {
        this.seguidores = seguidores;
    }

    public ArrayList<Album> getAlbunes() {
        return albunes;
    }

    public void setAlbunes(ArrayList<Album> albunes) {
        this.albunes = albunes;
    }

    @Override
    public String toString() {
        return super.getNusuario();
    }
      
}
