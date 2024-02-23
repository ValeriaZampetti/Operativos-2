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

    private int habilidad_Valor;
    private boolean calidad;

    public PuntosPersonajes(int habilidad_Valor, int probabilidad) {
        this.habilidad_Valor = habilidad_Valor;
        this.calidad = Funciones.try_Probability(probabilidad);
    }

    public int getHabilidad_Valor() {
        return habilidad_Valor;
    }

    public boolean esCalidad() {
        return calidad;
    }
}
