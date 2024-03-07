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

    public final ColaWithListener<PersonajeJugable> cola_Alta;
    public final ColaWithListener<PersonajeJugable> cola_Media;
    public final ColaWithListener<PersonajeJugable> cola_Baja;

    public final ColaWithListener<PersonajeJugable> cola_Refuerzo;

    public Colas_Show() {
        this.cola_Alta = new ColaWithListener();
        this.cola_Media = new ColaWithListener();
        this.cola_Baja = new ColaWithListener();
        this.cola_Refuerzo = new ColaWithListener();
    }

    public PersonajeJugable escojerPersonaje() {
        if (!cola_Alta.cola.EsVacio()) {
            return cola_Alta.Desencolar();
        } else if (!cola_Media.cola.EsVacio()) {
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
        if (cola_Refuerzo.cola.EsVacio()) {
            return;
        }
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
        incrementarContadores_PorCola(cola_Alta.cola);
        incrementarContadores_PorCola(cola_Media.cola);
        incrementarContadores_PorCola(cola_Baja.cola);

    }

    private void incrementarContadores_PorCola(Cola<PersonajeJugable> cola) {
        for (int i = 0; i < cola.getSize(); i++) {
            var personaje = cola.Desencolar();

            if (personaje.contador.incrementarContador()) {
                promocionarJugador(personaje);
            } else {
                cola.Encolar(personaje);
            }
        }
    }

    private void promocionarJugador(PersonajeJugable personaje) {
        switch (personaje.getRareza()) {
            case ALTA -> {
                return;
            }

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
