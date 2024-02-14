/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package operativos.pkg2;

/**
 *
 * @author valeriazampetti
 */
public enum Prioridad {
    
     
    ALTA(1),
    MEDIA(2),
    BAJA(3);

    public final int valor;

    private Prioridad(int valor) {
        this.valor = valor;
    }
  
    
    
}
