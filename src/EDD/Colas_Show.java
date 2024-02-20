/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;

/**
 *
 * @author Sergionx
 */
public class Colas_Show {

    private final Cola<PersonajeJugable> cola_Alta;
    private final Cola<PersonajeJugable> cola_Media;
    private final Cola<PersonajeJugable> cola_Baja;

    private final Cola<PersonajeJugable> cola_Refuerzo;

    private final String showId; //Debería verse como AVATAR

    public Colas_Show(String showId) {
        this.cola_Alta = new Cola();
        this.cola_Media = new Cola();
        this.cola_Baja = new Cola();
        this.cola_Refuerzo = new Cola();

        this.showId = showId;
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
                cola_Refuerzo.Encolar(personaje);
            }

            default ->
                throw new AssertionError();
        }
    }

    public void actualizarContadores() {
    }
}
