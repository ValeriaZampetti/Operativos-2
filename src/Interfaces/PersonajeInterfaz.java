/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Enums.Prioridad;
import Enums.Resultado_Pelea;
import Personajes.Personaje;
import Personajes.PersonajeJugable;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import operativos.pkg2.Data_Pelea;

/**
 *
 * @author valeriazampetti
 */
public class PersonajeInterfaz extends javax.swing.JPanel {

    public PersonajeInterfaz(PersonajeJugable personaje) {
        initComponents();

        this.initColors();
        ActualizarPersonajeInterfaz(personaje);
    }

    /**
     * Creates new form PersonajeInterfaz
     */
    public PersonajeInterfaz() {
        initComponents();

        this.initColors();
        this.noPersonaje();
    }

    public void ActualizarPersonajeInterfaz(PersonajeJugable personaje) {
        if (personaje == null) {
            this.noPersonaje();
            return;
        }
        this.ID.setText(personaje.getId());
        this.Poder.setText(Integer.toString(personaje.getPersonaje().puntos_Habilidades));
        this.Vida.setText(Integer.toString(personaje.getPersonaje().puntos_Vida));
        this.Fuerza.setText(Integer.toString(personaje.getPersonaje().puntos_Fuerza));
        this.Agilidad.setText(Integer.toString(personaje.getPersonaje().puntos_Agilidad));

        this.actualizarRareza(personaje.getRareza());
        this.CambiarIconoPelea();
        CambiarIcono(personaje.getPersonaje());
    }

    private void noPersonaje() {
        this.ID.setText("----");
        this.Poder.setText("----");
        this.Vida.setText("----");
        this.Fuerza.setText("----");
        this.Agilidad.setText("----");
        this.CambiarIconoEsperar();
    }

    private void initColors() {
        this.setOpaque(true);
        this.setBackground(new Color(246, 189, 255));
        this.setForeground(Color.WHITE);
        Border border = new LineBorder(new Color(246, 189, 255), 2);
        this.setBorder(border);

        this.ganadoresLabel
                .setBackground(new Color(246, 189, 255));

        this.ganadoresLabel
                .setForeground(Color.BLACK);

        this.ganadoresLabel
                .setBorder(border);

        this.ganadoresLabel
                .setOpaque(true);
    }

    public void actualizarGanadas() {
        var newGanadas = this.getGanadasValue() + 1;
        var ganadasString = Integer.toString(newGanadas);

        this.nGanadas.setText(ganadasString);
    }

    private void actualizarRareza(Prioridad prioridad) {
        switch (prioridad) {
            case ALTA -> {
                this.Rareza.setText("Alta");
                this.Rareza.setForeground(new Color(255, 215, 0)); // Gold color
            }
            case MEDIA -> {
                this.Rareza.setText("Media");
                this.Rareza.setForeground(new Color(192, 192, 192)); // Silver color
            }
            case BAJA -> {
                this.Rareza.setText("Baja");
                this.Rareza.setForeground(new Color(184, 115, 51)); // Brown (copper) color
            }
            default ->
                throw new AssertionError();
        }
    }

    private int getGanadasValue() {
        String numText = this.nGanadas.getText();
        return Integer.parseInt(numText);
    }

    public void CambiarIcono(Personaje personaje) {
        this.Foto.setIcon(new ImageIcon(personaje.imagen_Path));
    }

    public void CambiarIconoEsperar() {
        this.Foto.setIcon(new ImageIcon("src\\Imagenes\\VAyR.gif"));
        this.IndicadorResultado.setIcon(null);
    }

    public void CambiarIconoPelea() {
        this.IndicadorResultado.setIcon(new ImageIcon("src\\Imagenes\\pelea.png"));
    }

    public void CambiarIconoGanador() {
        this.IndicadorResultado.setIcon(new ImageIcon("src\\Imagenes\\ganador.png"));
    }

    public void CambiarIconoPerdedor() {
        this.IndicadorResultado.setIcon(new ImageIcon("src\\Imagenes\\perdedor.png"));
    }

    public void CambiarIconoEmpate() {
        this.IndicadorResultado.setIcon(new ImageIcon("src\\Imagenes\\empate.png"));
    }

//    TODO - Hacer uno para incapaz
    public void CambiarIconoIncapaz() {
        this.IndicadorResultado.setIcon(new ImageIcon("src\\Imagenes\\empate.png"));
    }

    void actualizarEstado(Data_Pelea data_Pelea) {
        switch (data_Pelea.getResultado()) {
            case VICTORIA -> {
                if (data_Pelea.getGanador().getId().equals(this.ID.getText())) {
                    this.actualizarGanadas();
                    this.CambiarIconoGanador();
                } else {
                    this.CambiarIconoPerdedor();

                }
            }

            case EMPATE ->
                this.CambiarIconoEmpate();

            case INCAPAZ ->
                this.CambiarIconoIncapaz();
            default ->
                throw new AssertionError();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        ganadoresLabel = new javax.swing.JLabel();
        nGanadas = new javax.swing.JLabel();
        IndicadorResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Poder = new javax.swing.JLabel();
        Rareza = new javax.swing.JLabel();
        Vida = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fuerza = new javax.swing.JLabel();
        labelAgilidad = new javax.swing.JLabel();
        Agilidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(150, 77, 128));
        setForeground(new java.awt.Color(246, 189, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("ID: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        ID.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ID.setText("---");
        add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1N.png"))); // NOI18N
        add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 330, 450));

        ganadoresLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ganadoresLabel.setText("Ganadas");
        add(ganadoresLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        nGanadas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        nGanadas.setText("0");
        add(nGanadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        IndicadorResultado.setDisplayedMnemonic('n');
        IndicadorResultado.setForeground(new java.awt.Color(255, 255, 255));
        IndicadorResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelea.png"))); // NOI18N
        add(IndicadorResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 140, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Poder: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        Poder.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Poder.setText("---");
        add(Poder, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        Rareza.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Rareza.setText("---");
        add(Rareza, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, -1, -1));

        Vida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Vida.setText("---");
        add(Vida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("Fuerza:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        Fuerza.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Fuerza.setText("---");
        add(Fuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        labelAgilidad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        labelAgilidad.setText("Agilidad:");
        add(labelAgilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Agilidad.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Agilidad.setText("---");
        add(Agilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setText("Vida:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("Rareza:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Agilidad;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Fuerza;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IndicadorResultado;
    private javax.swing.JLabel Poder;
    private javax.swing.JLabel Rareza;
    private javax.swing.JLabel Vida;
    private javax.swing.JLabel ganadoresLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelAgilidad;
    private javax.swing.JLabel nGanadas;
    // End of variables declaration//GEN-END:variables

}
