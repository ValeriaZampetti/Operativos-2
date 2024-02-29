/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Personajes.Personaje;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import operativos.pkg2.Administrador;
import operativos.pkg2.Show;

/**
 *
 * @author valeriazampetti
 */
public class Interfaz_2 extends javax.swing.JFrame {

    private final Show show_SM;
    private final Show show_AVATAR;

    private final Administrador administrador;

    /**
     * Creates new form Interfaz_2
     */
    public Interfaz_2() {
        var hola = new Personaje("Mordecai", 50, 30, 40, 60);
        System.out.println(hola);
        var personajes_SM = new Personaje[]{
            new Personaje("Mordecai", 50, 30, 40, 60),
            new Personaje("Rigby", 70, 10, 20, 80),
            new Personaje("Musculoso", 30, 70, 70, 30),
            new Personaje("Fantasmano", 80, 10, 10, 90),
            new Personaje("Benson", 40, 40, 40, 30)};

        var personajes_AVATAR = new Personaje[]{
            new Personaje("Aang", 60, 30, 40, 70),
            new Personaje("Azula", 50, 40, 50, 70),
            new Personaje("Sokka", 70, 50, 10, 70),
            new Personaje("Toph", 70, 70, 70, 20),
            new Personaje("Zuko", 60, 40, 40, 70)};

        this.show_AVATAR = new Show("AVATAR", personajes_AVATAR);

        this.show_SM = new Show("SM", personajes_SM);

        this.administrador = new Administrador(show_SM, show_SM);

        initComponents();

        empezerPelea();

        this.getGanadoresS()
                .setBackground(new Color(246, 189, 255));

        this.getGanadoresS()
                .setForeground(Color.BLACK);
        Border border = new LineBorder(new Color(246, 189, 255), 2);

        this.getGanadoresS()
                .setBorder(border);

        this.getGanadoresN()
                .setBorder(border);

        this.getGanadoresN()
                .setOpaque(true);

        this.getGanadoresN()
                .setBackground(new Color(246, 189, 255));

        this.getGanadoresN()
                .setForeground(Color.BLACK);
        Border border1 = new LineBorder(new Color(246, 189, 255), 2);

        this.getGanadoresN()
                .setBorder(border1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        GanadoresS = new javax.swing.JLabel();
        GanadoresN = new javax.swing.JLabel();
        EstadoIA = new javax.swing.JLabel();
        colas_AVATAR = new Interfaces.Colas_ShowInterfaz(
            this.show_AVATAR.getCola_Show()
        );
        colas_SM = new Interfaces.Colas_ShowInterfaz(
            this.show_SM.getCola_Show()
        );
        personajeInterfaz1 = new Interfaces.PersonajeInterfaz();
        personajeInterfaz2 = new Interfaces.PersonajeInterfaz();
        jLabel1 = new javax.swing.JLabel();
        personajeInterfaz3 = new Interfaces.PersonajeInterfaz();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GanadoresS.setBackground(new java.awt.Color(245, 230, 200));
        GanadoresS.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        GanadoresS.setForeground(new java.awt.Color(0, 0, 0));
        GanadoresS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GanadoresS.setText("Peleas Ganadas: 0");
        getContentPane().add(GanadoresS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 660, 230, 50));

        GanadoresN.setBackground(new java.awt.Color(245, 230, 200));
        GanadoresN.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        GanadoresN.setForeground(new java.awt.Color(0, 0, 0));
        GanadoresN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GanadoresN.setText("Peleas Ganadas: 0");
        getContentPane().add(GanadoresN, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 660, 230, 50));

        EstadoIA.setBackground(new java.awt.Color(255, 255, 255));
        EstadoIA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EstadoIA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EstadoIA.setText("Estado de la IA");
        getContentPane().add(EstadoIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 480, -1));
        getContentPane().add(colas_AVATAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 800));
        getContentPane().add(colas_SM, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, -1, 800));
        getContentPane().add(personajeInterfaz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 530, 740));
        getContentPane().add(personajeInterfaz2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 670, 750));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pexels-codioful-(formerly-gradienta)-6985136.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-720, -150, -1, -1));
        getContentPane().add(personajeInterfaz3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_2().setVisible(true);
            }
        });
    }

    public void empezerPelea() {
        var personaje_ShowSM = show_SM.escoger_Personaje_Pelear();
        var personaje_ShowAVATAR = show_AVATAR.escoger_Personaje_Pelear();
        
        
        
//        TODO - ACtualizar interfaz de pelea
//        Personaje_AVATAR;
//        Personaje_SM;
        administrador.empezarPelea(personaje_ShowSM, personaje_ShowAVATAR);

    }

    public JLabel getEstadoIA() {
        return EstadoIA;
    }

    public void setEstadoIA(String EstadoIA) {
        this.getEstadoIA().setText("Estado de la IA → " + EstadoIA);
        this.getEstadoIA().setOpaque(true);
        getEstadoIA().setBackground(new Color(245, 230, 200));
        this.getEstadoIA().setForeground(Color.BLACK);
        Border border = new LineBorder(new Color(139, 69, 19), 2);
        this.getEstadoIA().setBorder(border);

    }

//    public void ActualizarGanadores(Personaje Person, int contador){
//    char primerCaracter = Person.getEmpresa().charAt(0);
//    if(primerCaracter=='N'){
//    this.getGanadoresN().setText("Peleas Ganadas: " + contador);
//   
//    } else{
//    this.getGanadoresS().setText("Peleas Ganadas: " + contador);
//    }
//    }
    public PersonajeInterfaz getPersonajeN() {
        return Personaje_AVATAR;
    }

    public PersonajeInterfaz getPersonajeS() {
        return Personaje_SM;
    }

    public JLabel getGanadoresN() {
        return GanadoresS;
    }

    public final JLabel getGanadoresS() {
        return GanadoresS;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EstadoIA;
    private javax.swing.JLabel GanadoresN;
    private javax.swing.JLabel GanadoresS;
    private Interfaces.Colas_ShowInterfaz colas_AVATAR;
    private Interfaces.Colas_ShowInterfaz colas_SM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private Interfaces.PersonajeInterfaz personajeInterfaz1;
    private Interfaces.PersonajeInterfaz personajeInterfaz2;
    private Interfaces.PersonajeInterfaz personajeInterfaz3;
    // End of variables declaration//GEN-END:variables
}
