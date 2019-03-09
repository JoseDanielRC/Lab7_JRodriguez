
import javax.swing.JProgressBar;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel RC
 */
public class adminRola extends Thread {
     private JProgressBar barrarola;
     private double duracion;
   
    
    private boolean avanzar;
    private boolean vive;

    public adminRola(JProgressBar barrarola) {
        
        this.barrarola = barrarola;
        
        vive=true;
        avanzar=true;
        this.duracion=duracion;
    }

 
    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public JProgressBar getBarrarola() {
        return barrarola;
    }

    public void setBarrarola(JProgressBar barrarola) {
        this.barrarola = barrarola;
    }
    
    
    public void run() {
        int cont=1;
        while (vive) {
            if (avanzar&&cont<=duracion) {
                barrarola.setValue(cont);
                barrarola.setString(Integer.toString(barrarola.getValue()) + "min");
                cont++;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            
        }

    }
}
