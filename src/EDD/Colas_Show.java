/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;
import Utils.Funciones;
import operativos.pkg2.Administrador;

/**
 *
 * @author Sergionx
 */
public class Colas_Show {

    public final Cola<PersonajeJugable> cola_Alta;
    public final Cola<PersonajeJugable> cola_Media;
    public final Cola<PersonajeJugable> cola_Baja;

    public final Cola<PersonajeJugable> cola_Refuerzo;

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
        actualizar_ColaRefuerzo();

        switch (resultado_Pelea) {
            case VICTORIA -> {
                if (personaje == null) {
                    return;
                }
//                REVIEW - Revisar que funcione bien  
                Administrador.getInstance().agregarGanador(personaje);
            }

            case EMPATE -> {
                cola_Alta.Encolar(personaje);
            }

            case INCAPAZ -> {
                cola_Refuerzo.Encolar(personaje);
            }

            default ->
                throw new AssertionError();
        }
    }

    private void actualizar_ColaRefuerzo() {
        var personaje_refuerzo = cola_Refuerzo.Desencolar();
        if (Funciones.try_Probability(40)) {
            cola_Alta.Encolar(personaje_refuerzo);
        } else {
            cola_Refuerzo.Encolar(personaje_refuerzo);
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
