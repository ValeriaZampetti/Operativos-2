/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personajes;

import Personajes.Personaje;
import Enums.Prioridad;
import operativos.pkg2.PuntosPersonajes;

/**
 *
 * @author valeriazampetti
 */
public class PersonajeJugable {

    private final PuntosPersonajes puntos_Habilidades;
    private final PuntosPersonajes puntos_Vida;
    private final PuntosPersonajes puntos_Fuerza;
    private final PuntosPersonajes puntos_Agilidad;

    private int id;
    private int contador = 0;
    private final Prioridad rareza;
    private final Personaje personaje;

    public PersonajeJugable(Personaje personaje) {
        this.personaje = personaje;

        this.puntos_Habilidades = new PuntosPersonajes(personaje.puntos_Habilidades, 60);
        this.puntos_Vida = new PuntosPersonajes(personaje.puntos_Vida, 70);
        this.puntos_Fuerza = new PuntosPersonajes(personaje.puntos_Fuerza, 50);
        this.puntos_Agilidad = new PuntosPersonajes(personaje.puntos_Agilidad, 40);

        this.rareza = this.decidirRareza();

    }

    private Prioridad decidirRareza() {
        var contadorCalidad = 0;

        contadorCalidad += this.puntos_Habilidades.esCalidad() ? 1 : 0;
        contadorCalidad += this.puntos_Vida.esCalidad() ? 1 : 0;
        contadorCalidad += this.puntos_Fuerza.esCalidad() ? 1 : 0;
        contadorCalidad += this.puntos_Agilidad.esCalidad() ? 1 : 0;

        if (contadorCalidad == 4) {
            return Prioridad.ALTA;
        } else if (contadorCalidad >= 2) {
            return Prioridad.MEDIA;
        } else {
            return Prioridad.BAJA;
        }
    }

    public Prioridad getRareza() {
        return rareza;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public int getContador() {
        return contador;
    }

    /**
     * Decrements 1 and check if was reseted
     * @return true if reseted, false otherwise
     */
    public boolean decrementarContador() {
//        REVIEW - Si es prioridad alta, no hace nada, ver que hago
        this.contador -= 1;

        if (contador == 8) {
            contador = 0;
            return true;
        }
        return false;
    }

}
