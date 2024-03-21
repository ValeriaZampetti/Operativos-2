/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

import Utils.Funciones;

/**
 *
 * @author valeriazampetti
 */
public class PuntosPersonajes {

    public int valor;
    private boolean calidad;

    public PuntosPersonajes(int habilidad_Valor, int probabilidad) {
        this.valor = habilidad_Valor;
        this.calidad = Funciones.try_Probability(probabilidad);
    }


    public boolean esCalidad() {
        return calidad;
    }
}
