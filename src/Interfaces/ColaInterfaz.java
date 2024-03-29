/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import EDD.Cola;
import EDD.ColaWithListener;
import Personajes.PersonajeJugable;
import javax.swing.JLabel;

/**
 *
 * @author valeriazampetti
 */
public class ColaInterfaz extends javax.swing.JPanel {

    private final ColaWithListener colaWithListener;

    /**
     * Creates new form NewJPanel
     */
    public ColaInterfaz(ColaWithListener colaWithLisnter, String nombre) {
        initComponents();

        this.getTitulo().setText(nombre);

        var listener = new ColaWithListener.ColaListener() {
            @Override
            public void onChange(Cola cola) {
                CambiarColaInterfaz(cola);
            }
        };
        this.colaWithListener = colaWithLisnter;
        colaWithLisnter.setColaListener(listener);
        CambiarColaInterfaz(colaWithLisnter.cola);
    }

    public ColaInterfaz() {
        initComponents();

        this.colaWithListener = new ColaWithListener<PersonajeJugable>();
        this.getTitulo().setText("");
    }

    public JLabel getTitulo() {
        return Titulo;
    }

    public void CambiarColaInterfaz(Cola cola) {
        Contenido.setText(cola.StringInterfaz());
        System.out.println(Titulo.getText() + "  " + Contenido.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Contenido = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(150, 77, 128));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 69, 19), 2));
        jPanel1.setForeground(new java.awt.Color(246, 189, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setText("Nombre de la Cola");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Fin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel3.setText("Inicio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Contenido.setColumns(20);
        Contenido.setRows(5);
        jPanel1.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 310));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 355));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Contenido;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
