/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

import Enums.Resultado_Pelea;
import Personajes.PersonajeJugable;
import Utils.Contador;
import Utils.Funciones;

/**
 *
 * @author Sergionx
 */
public final class Administrador {

    private Show show_SM;
    private Show show_AVATAR;

    private Contador contador;

    private final Inteligencia_Artificial IA;

    private static Administrador instance;

    private PersonajeJugable[] ganadores;

    private Administrador(Show show1, Show show2) {
        this.show_SM = show1;
        this.show_AVATAR = show2;
        this.IA = Inteligencia_Artificial.getInstance();

        this.ganadores = new PersonajeJugable[0];
        this.contador = new Contador(2);
    }

//    REVIEW - Considerar si debe ser un singleton o no
    public static Administrador getInstance(Show show1, Show show2) {
        if (instance == null) {
            instance = new Administrador(show1, show2);
        }
        return instance;
    }

    public static Administrador getInstance() {
        if (instance == null) {
            throw new Error("Administrador not initialized");
        }
        return instance;
    }

    public Data_Pelea empezarPelea(PersonajeJugable personaje_ShowSM, PersonajeJugable personaje_ShowAVATAR) {
        Data_Pelea data_Pelea = IA.procesarPersonjaes(personaje_ShowSM, personaje_ShowAVATAR);
        this.procesarResultados(data_Pelea, personaje_ShowSM, personaje_ShowAVATAR);

        if (contador.incrementarContador()) {
            var debeAgregar = Funciones.try_Probability(80);

            if (debeAgregar) {
                System.out.println("Creo personajes");
                show_SM.crear_Personaje();
                show_AVATAR.crear_Personaje();
            }
        }
        return data_Pelea;
    }

    private void procesarResultados(Data_Pelea data_Pelea,
            PersonajeJugable personaje_ShowSM, PersonajeJugable personaje_ShowAVATAR) {
        var colas_Show_SM = show_SM.getCola_Show();
        var colas_Show_AVATAR = show_AVATAR.getCola_Show();

        System.out.println(data_Pelea.getResultado().toString());
        if (data_Pelea.getResultado() != Resultado_Pelea.VICTORIA) {
            if (personaje_ShowSM == null && personaje_ShowAVATAR == null) {
                return;
            }

            colas_Show_SM.decidir_Accion_Pelea(data_Pelea.getResultado(), personaje_ShowSM);
            colas_Show_AVATAR.decidir_Accion_Pelea(data_Pelea.getResultado(), personaje_ShowAVATAR);
            return;
        }

        var ganador = data_Pelea.getGanador();
        System.out.println("Gana " + ganador.toString());

        if (ganador.pertenece_A_Show(show_SM)) {
            colas_Show_SM.decidir_Accion_Pelea(data_Pelea.getResultado(), data_Pelea.getGanador());
            colas_Show_AVATAR.decidir_Accion_Pelea(data_Pelea.getResultado(), personaje_ShowAVATAR);
        } else {
            colas_Show_SM.decidir_Accion_Pelea(data_Pelea.getResultado(), personaje_ShowSM);
            colas_Show_AVATAR.decidir_Accion_Pelea(data_Pelea.getResultado(), data_Pelea.getGanador());
        }

        colas_Show_SM.incrementarContadores_Jugadores();
        colas_Show_AVATAR.incrementarContadores_Jugadores();
    }

    public void agregarGanador(PersonajeJugable personaje) {
        PersonajeJugable[] newGanadores = new PersonajeJugable[ganadores.length + 1];
        System.arraycopy(ganadores, 0, newGanadores, 0, ganadores.length);
        newGanadores[ganadores.length] = personaje;
        ganadores = newGanadores;
    }

}
