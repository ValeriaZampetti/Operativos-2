/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

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
        this.calidad = this.determinarCalidad(probabilidad);
    }

    private boolean determinarCalidad(int probabilidad) {
        return Funciones.get_Random(0, 100) <= probabilidad;
    }

    public int getHabilidad_Valor() {
        return habilidad_Valor;
    }

    public boolean esCalidad() {
        return calidad;
    }
}
