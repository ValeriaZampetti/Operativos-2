/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author valeriazampetti
 * @param <T> Type of the object
 */
public class Nodo<T> {

    private T elemento;
    private Nodo siguiente;

    public Nodo(T elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }

    /**
     * @return the elemento
     */
    public T getElemento() {
        return elemento;
    }

   
    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
