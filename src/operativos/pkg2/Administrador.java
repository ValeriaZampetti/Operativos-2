/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

import EDD.Colas_Show;
import Enums.Resultado_Pelea;
import Utils.Funciones;

/**
 *
 * @author Sergionx
 */
public final class Administrador {

    private int ciclosTotales = 0;
    private int ciclo = 0;
    private final Colas_Show colas_Show1;
    private final Colas_Show colas_Show2;

    private final Inteligencia_Artificial IA;

    private static Administrador instance;

    public Administrador(Colas_Show colas_Show1, Colas_Show colas_Show2) {
        this.colas_Show1 = colas_Show1;
        this.colas_Show2 = colas_Show2;
        this.IA = Inteligencia_Artificial.getInstance();
    }

//    REVIEW - Considerar si debe ser un singleton o no
    public static Administrador getInstance(Colas_Show colas_Show1, Colas_Show colas_Show2) {
        if (instance == null) {
            instance = new Administrador(colas_Show1, colas_Show2);
        }
        return instance;
    }

    public void empezarPelea() {
        var personaje_Show1 = colas_Show1.escojerPersonaje();
        var personaje_Show2 = colas_Show2.escojerPersonaje();

        Data_Pelea data_Pelea = IA.procesarPersonjaes(personaje_Show1, personaje_Show2);
        this.procesarResultados(data_Pelea);

        if (actualizarCiclo()) {
            var debeAgregar = Funciones.try_Probability(80);

            if (debeAgregar) {
                agregarPersonajes();
            }
        }
    }

    private void procesarResultados(Data_Pelea data_Pelea) {
        var ganador = data_Pelea.getGanador();

        if (ganador.pertenece_A_Cola(colas_Show1)) {
            colas_Show1.decidir_Accion_Pelea(data_Pelea.getResultado(), data_Pelea.getGanador());
            colas_Show2.decidir_Accion_Pelea(data_Pelea.getResultado(), null);
        } else {
            colas_Show1.decidir_Accion_Pelea(data_Pelea.getResultado(), null);
            colas_Show2.decidir_Accion_Pelea(data_Pelea.getResultado(), data_Pelea.getGanador());
        }
    }

    private void agregarPersonajes() {
    }

    /**
     * Updates the ciclo and ciclosTotales property
     *
     * @return true if ciclo was resetd, false otherwise
     */
    private boolean actualizarCiclo() {
        ciclo++;
        if (ciclo == 2) {
            ciclo = 0;
            ciclosTotales++;
            return true;
        }
        return false;
    }
}
