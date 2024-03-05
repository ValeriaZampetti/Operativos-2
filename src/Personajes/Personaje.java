/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

/**
 *
 * @author valeriazampetti
 */
public class Personaje {

//    TODO - Ver manera de añadir el path a la imagen
    public final String nombre;
    public final int puntos_Habilidades;
    public final int puntos_Vida;
    public final int puntos_Fuerza;
    public final int puntos_Agilidad;
    public final String imagen_Path;

    public Personaje(String nombre, int puntos_Habilidades, int puntos_Vida,
            int puntos_Fuerza, int puntos_Agilidad) {
        this.nombre = nombre;
        this.puntos_Habilidades = puntos_Habilidades;
        this.puntos_Vida = puntos_Vida;
        this.puntos_Fuerza = puntos_Fuerza;
        this.puntos_Agilidad = puntos_Agilidad;
        this.imagen_Path = "src\\Imagenes\\" + nombre + ".png";
    }
}
