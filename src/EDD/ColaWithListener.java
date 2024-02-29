/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 *
 * @author Sergionx
 */
public class ColaWithListener<T> {

    private ColaListener listener = null;
    public final Cola<T> cola;

    public void setColaListener(ColaListener listener) {
        this.listener = listener;
    }

    public interface ColaListener<T> {

//        public void onAdd(String title);
//
//        public void onRemove(String title);
        public void onChange(Cola<T> cola);
    }

    public ColaWithListener() {
        this.cola = new Cola();
    }

    public T Desencolar() {
        var dato = cola.Desencolar();

        if (listener != null) {
//            listener.onRemove("Remove");
            listener.onChange(cola);
        }
        return dato;
    }

    public void Encolar(T dato) {
        cola.Encolar(dato);

        if (listener != null) {
//            listener.onAdd("Add");
            listener.onChange(cola);
        }
    }

}
