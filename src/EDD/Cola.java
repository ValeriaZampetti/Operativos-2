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
     * @param pInicio the pInicio to set
     */
    public void setpInicio(Nodo pInicio) {
        this.pInicio = pInicio;
    }

    /**
     * @return the pFinal
     */
    public Nodo getpFinal() {
        return pFinal;
    }

    /**
     * @param pFinal the pFinal to set
     */
    public void setpFinal(Nodo pFinal) {
        this.pFinal = pFinal;
    }

    /**
     * @return the Size
     */
    public int getSize() {
        return Size;
    }

    /**
     * @param Size the Size to set
     */
    public void setSize(int Size) {
        this.Size = Size;
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

    public void Desencolar() {
        if (!EsVacio()) {
            pInicio = pInicio.getSiguiente();
            if (pInicio == null) {
                pFinal = null;
            }
        }
        Size--;
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
