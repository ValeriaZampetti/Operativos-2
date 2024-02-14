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
    
    private PuntosPersonajes puntos_Habilidades;
    private PuntosPersonajes puntos_Vida;
    private PuntosPersonajes puntos_Fuerza;
    private PuntosPersonajes puntos_Agilidad;

    public Personaje(int puntos_Habilidades, int puntos_Vida, int puntos_Fuerza, int puntos_Agilidad) {
        this.puntos_Habilidades = new PuntosPersonajes(puntos_Habilidades,60);
        this.puntos_Vida =  new PuntosPersonajes(puntos_Vida,70) ;
        this.puntos_Fuerza = new PuntosPersonajes(puntos_Fuerza,50);
        this.puntos_Agilidad = new PuntosPersonajes(puntos_Agilidad, 40);
    }
    
    
   
    
    
}
