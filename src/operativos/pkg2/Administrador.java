/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

import EDD.Colas_Show;
import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;
import Utils.Contador;
import Utils.Funciones;
import java.util.Random;

/**
 *
 * @author Sergionx
 */
public final class Administrador {

    private Show show1;
    private Show show2;

    private Contador contador;

    private final Inteligencia_Artificial IA;

    private static Administrador instance;

    public Administrador(Show show1, Show show2) {
        this.show1 = show1;
        this.show2 = show2;
        this.IA = Inteligencia_Artificial.getInstance();

        this.contador = new Contador(2);
    }

//    REVIEW - Considerar si debe ser un singleton o no
    public static Administrador getInstance(Show show1, Show show2) {
        if (instance == null) {
            instance = new Administrador(show1, show2);
        }
        return instance;
    }

    public void empezarPelea() {
        var personaje_Show1 = show1.escoger_Personaje_Pelear();
        var personaje_Show2 = show2.escoger_Personaje_Pelear();

        Data_Pelea data_Pelea = IA.procesarPersonjaes(personaje_Show1, personaje_Show2);
        this.procesarResultados(data_Pelea, personaje_Show1, personaje_Show2);

        if (contador.incrementarContador()) {
            var debeAgregar = Funciones.try_Probability(80);

            if (debeAgregar) {
                show1.crear_Personaje();
                show2.crear_Personaje();
            }
        }
    }

    private void procesarResultados(Data_Pelea data_Pelea,
            PersonajeJugable personaje_Show1, PersonajeJugable personaje_Show2) {
        var ganador = data_Pelea.getGanador();
        var colas_Show_1 = show1.getCola_Show();
        var colas_Show_2 = show2.getCola_Show();

        if (ganador.pertenece_A_Show(show1)) {
            colas_Show_1.decidir_Accion_Pelea(data_Pelea.getResultado(), data_Pelea.getGanador());
            colas_Show_2.decidir_Accion_Pelea(data_Pelea.getResultado(), personaje_Show2);
        } else {
            colas_Show_1.decidir_Accion_Pelea(data_Pelea.getResultado(), personaje_Show1);
            colas_Show_2.decidir_Accion_Pelea(data_Pelea.getResultado(), data_Pelea.getGanador());
        }
        
        colas_Show_1.incrementarContadores_Jugadores();
        colas_Show_2.incrementarContadores_Jugadores();
    }

}
