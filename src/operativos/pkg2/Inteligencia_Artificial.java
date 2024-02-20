/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;
import Utils.Funciones;

/**
 *
 * @author Sergionx
 */
public final class Inteligencia_Artificial {

    private static Inteligencia_Artificial instance;

    public static Inteligencia_Artificial getInstance() {
        if (instance == null) {
            instance = new Inteligencia_Artificial();
        }
        return instance;
    }

    public Data_Pelea procesarPersonjaes(PersonajeJugable personaje1, PersonajeJugable personaje2) {
        int indexProbabilidad = Funciones.try_MultipleProbabilities(new int[]{40, 27, 33});

        switch (indexProbabilidad) {
            case 0 -> {
                var ganador = escogerGanador(personaje1, personaje2);
                return new Data_Pelea(Resultado_Pelea.VICTORIA, ganador);
            }
            case 1 -> {
                return new Data_Pelea(Resultado_Pelea.EMPATE, null);
            }
            case 2 -> {
                return new Data_Pelea(Resultado_Pelea.INCAPAZ, null);
            }
            default ->
                throw new AssertionError();
        }
    }

    public PersonajeJugable escogerGanador(PersonajeJugable personaje1, PersonajeJugable personaje2) {
        //                TODO - Escojer ganador

        return personaje1;
    }
}
