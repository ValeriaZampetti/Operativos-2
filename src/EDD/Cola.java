/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author valeriazampetti
 * @param <T> Type of the Nodo object
 */
public class Cola<T> {

    private Nodo<T> pInicio;
    private Nodo<T> pFinal;
    private int Size;

    /**
     * @return the pInicio
     */
    public Nodo getpInicio() {
        return pInicio;
    }

    /**
     * @return the pFinal
     */
    public Nodo getpFinal() {
        return pFinal;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    public boolean EsVacio() {
        return pInicio == null;
    }

    public void Encolar(T dato) {
        Nodo nuevo = new Nodo(dato);
        if (EsVacio()) {
            pInicio = pFinal = nuevo;
        } else {
            Nodo aux = pFinal;
            aux.setSiguiente(nuevo);
        }
        pFinal = nuevo;
        Size++;
    }

    public T Desencolar() {
        if (EsVacio()) {
            return null;
        }
        Nodo<T> result = pInicio;
        pInicio = pInicio.getSiguiente();
        if (pInicio == null) {
            pFinal = null;
        }
        Size--;
        return result.getElemento();
    }

    public String Imprimir() {
        if (!EsVacio()) {
            String printQueue = "";
            for (int i = 0; i < Size; i++) {
                var actual = pInicio;
                Desencolar();
                printQueue += actual.getElemento() + "\n";
                Encolar(actual.getElemento());

            }
            System.out.println(printQueue);

        }
        return null;
    }

    public T LeerCabeza() {
        return pInicio.getElemento();
    }

}
