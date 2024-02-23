/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Sergionx
 */
public class Contador {

    private int actual = 0;
    private int longitudCiclo;
    private int cantidadCiclos = 0;

    public Contador(int longitudCiclo) {
        this.longitudCiclo = longitudCiclo;
    }

    public Contador() {
        this.longitudCiclo = -1;
    }
    
     /**
     * Increments 1 and check if was reseted
     *
     * @return true if reseted, false otherwise
     */
    public boolean incrementarContador(){
        this.actual++;
        
        if (actual == longitudCiclo){
            actual = 0;
            cantidadCiclos++;
            return true;
        }
        
        return false;
    }

    public int getActual() {
        return actual;
    }

    public int getLongitudCiclo() {
        return longitudCiclo;
    }

    public int getCantidadCiclos() {
        return cantidadCiclos;
    }
}
