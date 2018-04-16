/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Fenster.java
 *
 * Created on 09.05.2012, 08:43:50
 */
package essentials;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JButton;

/**
 *
 * @author tommy
 */
public class Fenster extends javax.swing.JFrame implements ActionListener{

    
    BufferedImage Hintergrund=null; // wird zum zeichnen im hintergrund verwendet
    JButton[] knopf=new JButton[10];
    
    /** Creates new form Fenster */
    public Fenster() {
        initComponents();
        
        Hintergrund=new BufferedImage(jPanel1.getWidth(),jPanel1.getHeight(),BufferedImage.TYPE_INT_ARGB);
        
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager(); // somit kann die tastatur abgefragt werden, mehr im unteren bereich (MyDispatcher)
        manager.addKeyEventDispatcher(new MyDispatcher());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                zeichneBild(g);
            }
        };
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 206, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );

        jButton1.setText("Datei laden");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Datei speichern");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Beenden");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Knöpfe zeigen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Informationsleiste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        BufferedReader br=new BufferedReader(new FileReader("test.txt"));
        String zeile="";
        int zeilenzaehler=1;
        while ((zeile=br.readLine())!=null){
            System.out.println("Zeile "+zeilenzaehler+": "+zeile);
            zeilenzaehler++;
            
        }
        jLabel1.setText("Datei test.txt wurde erfolgreich eingelesen!");
        } catch(Exception e){
            jLabel1.setText("Datei test.txt nicht gefunden!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jLabel1.setText("Mausknopf gedrückt: x="+evt.getX()+" y="+evt.getY());
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        // TODO add your handling code here:
         jLabel1.setText("Maus bewegt: x="+evt.getX()+" y="+evt.getY());
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
         jLabel1.setText("Maus bleibt gedrückt: x="+evt.getX()+" y="+evt.getY());
        Graphics g=Hintergrund.getGraphics(); 
        g.setColor(new Color(0,0,0));
        g.fillRect(evt.getX()-5,evt.getY()-5,10,10);
        jPanel1.repaint();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.setLayout(new GridLayout(5,2)); //5 spalten und 2 zeilen
        
        for (int i=0;i<10;i++){
            knopf[i]=new JButton("Knopf "+i); // das feld JButton [] knopf wurde ganz oben definiert
            knopf[i].setActionCommand(""+i); // weist jedem knopf ein actionCommand zu, so dass dieser beim drücken eindeutig identifiziert werden kann
            knopf[i].addActionListener(this); // dieses this verlangt, dass die klasse fenster den actionlistener implementiert, d.h. ganz oben steht 
            // implements ActionListener und es muss in der Klasse die Methode actionPerformed() vorkommen, was sie weiter unten auch tut
            jPanel2.add(knopf[i]); 
        }
       
        jPanel2.validate(); // macht alle neuen komponenten im jpanel2 sichtbar
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try{
        FileWriter fw=new FileWriter("test.txt");
        fw.write("Das ist ein Test\nund das ist eine zweite Zeile");
       fw.flush();
       fw.close();
            jLabel1.setText("Datei test.txt erfolgreich gespeichert");
        } catch(Exception e){
            jLabel1.setText("Fehler beim Speichern aufgetreten");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
   public void zeichneBild(Graphics g){
       if (Hintergrund!=null){
           g.drawImage(Hintergrund, 0   , 0, this);
       }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) { // hierher spring das programm, wenn ein knopf gedrückt wurde
        String befehl=ae.getActionCommand();
        jLabel1.setText("Knopf "+befehl+" wurde gedrückt!");
    }

   
    
    
    
        private class MyDispatcher implements KeyEventDispatcher { // hier landet das programm, wenn eine taste gedrückt wurde
        @Override
        public boolean dispatchKeyEvent(KeyEvent e) {
            if (e.getID() == KeyEvent.KEY_PRESSED) {
                System.out.println("Taste runtergedrückt");
                jLabel1.setText("Taste "+e.getKeyChar()+" wurde gedrückt");
            } else if (e.getID() == KeyEvent.KEY_RELEASED) {
                System.out.println("Taste wird gehalten");
            } else if (e.getID() == KeyEvent.KEY_TYPED) {
                System.out.println("Taste wurde losgelassen");
            }
            return false;
        }
    }
}
