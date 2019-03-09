/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel RC
 */
class Cancion {
    //Tendrán Nombre de la Canción, Año, Nombre del Artista, Duración
    private String nombre;
    private String artista;
     private double duracion;

    public Cancion(String nombre, String artista, double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return   nombre +"   -  " + artista;
    }
    

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
     
}
