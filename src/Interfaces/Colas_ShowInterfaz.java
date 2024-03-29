/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import EDD.Colas_Show;

/**
 *
 * @author Sergionx
 */
public class Colas_ShowInterfaz extends javax.swing.JPanel {

    private Colas_Show colas_show;

    /**
     * Creates new form Colas_ShowInterfaz
     */
    public Colas_ShowInterfaz(Colas_Show colas_show) {
        this.colas_show = colas_show;
        initComponents();
    }

    public Colas_ShowInterfaz() {
        this.colas_show = new Colas_Show();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cola_Alta = new Interfaces.ColaInterfaz(
            this.colas_show.cola_Alta, "alta"
        );
        cola_Media = new Interfaces.ColaInterfaz(
            this.colas_show.cola_Media, "Media"
        );
        cola_Baja = new Interfaces.ColaInterfaz(
            this.colas_show.cola_Baja, "Baja"
        );
        cola_Refuerzo = new Interfaces.ColaInterfaz(
            this.colas_show.cola_Refuerzo, "Refuerzo"
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(cola_Alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 200));
        add(cola_Media, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 490, 160));
        add(cola_Baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 490, 159));
        add(cola_Refuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 490, 170));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Interfaces.ColaInterfaz cola_Alta;
    private Interfaces.ColaInterfaz cola_Baja;
    private Interfaces.ColaInterfaz cola_Media;
    private Interfaces.ColaInterfaz cola_Refuerzo;
    // End of variables declaration//GEN-END:variables
}
