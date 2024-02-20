/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;

/**
 *
 * @author Sergionx
 */
public class Data_Pelea {

    private Resultado_Pelea resultado;
    private PersonajeJugable ganador;

    public Data_Pelea(Resultado_Pelea resultado, PersonajeJugable ganador) {
        this.resultado = resultado;
        this.ganador = ganador;
    }

    public Resultado_Pelea getResultado() {
        return resultado;
    }

    public PersonajeJugable getGanador() {
        return ganador;
    }
}
