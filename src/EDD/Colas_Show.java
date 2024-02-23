/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;
import Utils.Funciones;

/**
 *
 * @author Sergionx
 */
public class Colas_Show {

    private final Cola<PersonajeJugable> cola_Alta;
    private final Cola<PersonajeJugable> cola_Media;
    private final Cola<PersonajeJugable> cola_Baja;

    private final Cola<PersonajeJugable> cola_Refuerzo;

    public Colas_Show() {
        this.cola_Alta = new Cola();
        this.cola_Media = new Cola();
        this.cola_Baja = new Cola();
        this.cola_Refuerzo = new Cola();
    }

    public PersonajeJugable escojerPersonaje() {
        if (!cola_Alta.EsVacio()) {
            return cola_Alta.Desencolar();
        } else if (!cola_Media.EsVacio()) {
            return cola_Media.Desencolar();
        }
        return cola_Baja.Desencolar();

    }

    public void decidir_Accion_Pelea(Resultado_Pelea resultado_Pelea, PersonajeJugable personaje) {
        switch (resultado_Pelea) {
            case VICTORIA -> {
//                TODO - Mostrar ganador y guardar en lista de ganadores
            }

            case EMPATE -> {
                cola_Alta.Encolar(personaje);
            }

            case INCAPAZ -> {
                var personaje_refuerzo = cola_Refuerzo.Desencolar();
                if (Funciones.try_Probability(40)) {
                    cola_Alta.Encolar(personaje_refuerzo);
                } else {
                    cola_Refuerzo.Encolar(personaje_refuerzo);
                }
                cola_Refuerzo.Encolar(personaje);
            }

            default ->
                throw new AssertionError();
        }
    }

    public void agregar_Personaje(PersonajeJugable personaje) {
        switch (personaje.getRareza()) {
            case ALTA ->
                cola_Alta.Encolar(personaje);
            case MEDIA ->
                cola_Media.Encolar(personaje);
            case BAJA ->
                cola_Baja.Encolar(personaje);
            default ->
                throw new AssertionError();
        }
    }

    public void incrementarContadores_Jugadores() {
        incrementarContadores_PorCola(cola_Alta);
        incrementarContadores_PorCola(cola_Media);
        incrementarContadores_PorCola(cola_Baja);

    }

    private void incrementarContadores_PorCola(Cola<PersonajeJugable> cola) {
//        TODO - Recorrer y hacer personaje.contador.incrementarContador() a TODOS

    }

    private void promocionarJugador(PersonajeJugable personaje) {
        switch (personaje.getRareza()) {
            case MEDIA -> {
                cola_Alta.Encolar(personaje);
            }

            case BAJA -> {
                cola_Media.Encolar(personaje);
            }

            default ->
                throw new AssertionError();
        }
    }

}
