/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

/**
 *
 * @author valeriazampetti
 */
public class PersonajeJugable {

    private PuntosPersonajes puntos_Habilidades;
    private PuntosPersonajes puntos_Vida;
    private PuntosPersonajes puntos_Fuerza;
    private PuntosPersonajes puntos_Agilidad;

    private int id;
    private Prioridad rareza;
    private Personaje personaje;

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

        contadorCalidad += this.puntos_Habilidades.calidad ? 1 : 0;
        contadorCalidad += this.puntos_Vida.calidad ? 1 : 0;
        contadorCalidad += this.puntos_Fuerza.calidad ? 1 : 0;
        contadorCalidad += this.puntos_Agilidad.calidad ? 1 : 0;

        if (contadorCalidad == 4) {
            return Prioridad.ALTA;
        } else if (contadorCalidad >= 2) {
            return Prioridad.MEDIA;
        } else {
            return Prioridad.BAJA;
        }
    }
}

