/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operativos.pkg2;

import EDD.Colas_Show;
import Personajes.Personaje;
import Personajes.PersonajeJugable;
import Utils.Funciones;

/**
 *
 * @author valeriazampetti
 */
public class Show {

    public Personaje personajes[];
    private final Colas_Show cola_Show;
    private int Contador_Personaje;

    public Show(Personaje[] personajes, Colas_Show cola_Show) {
        this.personajes = personajes;
        this.cola_Show = cola_Show;
    }

    public PersonajeJugable escoger_Personaje_Pelear() {
        return cola_Show.escojerPersonaje();
    }

    public Personaje escoger_Personaje_Aleatorio() {
        var randomIndex = Funciones.get_Random(0, personajes.length - 1);
        return personajes[randomIndex];
    }

    public Colas_Show getCola_Show() {
        return cola_Show;
    }

    public String crear_Id() {

        return "";
    }

    public void crear_Personaje() {
        var personaje = escoger_Personaje_Aleatorio();
        var id = crear_Id();

        var persona_Jugable = new PersonajeJugable(personaje, id);

        cola_Show.agregar_Personaje(persona_Jugable);
    }
}
