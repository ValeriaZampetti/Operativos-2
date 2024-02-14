/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

/**
 *
 * @author valeriazampetti
 */
public class Personaje {
    
    public int puntos_Habilidades;
    public int puntos_Vida;
    public int puntos_Fuerza;
    public int puntos_Agilidad;

    public Personaje(int puntos_Habilidades, int puntos_Vida, int puntos_Fuerza, 
            int puntos_Agilidad) {
        this.puntos_Habilidades =  puntos_Habilidades;
        this.puntos_Vida = puntos_Vida;
        this.puntos_Fuerza = puntos_Fuerza;
        this.puntos_Agilidad = puntos_Agilidad;
    }  
}
