/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/AWTForms/Frame.java to edit this template
 */
package vistas;

import Control.ProductosControlBD;
import Modelo.Productos;
import java.awt.BorderLayout;
import java.awt.Color;
import vistas.GestionProductos;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;



/**
 *
 * @author astuard
 */
public class Interfas extends java.awt.Frame {
    int xMause,yMause;
    
    ProductosControlBD productos = new ProductosControlBD();
   
    
    

        /**
         * Creates new form Interfas
         */
        public Interfas() {
            initComponents();
            SetDate();
            llenarTabla();
    }
    
    

       
   
    
    private void IniStyles(){
        dateText.putClientProperty("FlatLaf.style","font: 14 $light.font");
    }
    
    private void SetDate(){
    LocalDate now = LocalDate.now();
    Locale spanishLocale = new Locale("es", "ES");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'del' yyyy", spanishLocale);
    dateText.setText(now.format(formatter)); 
//LocalDate now =LocalDate.now();
    //Locale spanishLocale=new Locale ("es","ES");
    //dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'del' yyyy ")));
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cafe = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jblEditar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelx = new javax.swing.JPanel();
        lbx = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtbc = new javax.swing.JTextField();
        dateText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLocation(new java.awt.Point(650, 220));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cafe.setBackground(new java.awt.Color(160, 117, 93));
        cafe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cafeMouseDragged(evt);
            }
        });
        cafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cafeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cafeMousePressed(evt);
            }
        });
        cafe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png.png"))); // NOI18N
        cafe.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jPanel1.add(cafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flechai.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, 40, 20));

        content.setBackground(new java.awt.Color(153, 153, 153));
        content.setLayout(new java.awt.BorderLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precios", "Cantidad", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        content.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 820, 450));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Reportes.png.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 40, -1));

        jblEditar.setBackground(new java.awt.Color(255, 255, 255));
        jblEditar.setForeground(new java.awt.Color(255, 255, 255));
        jblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carpeta.png.png"))); // NOI18N
        jblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jblEditarMouseClicked(evt);
            }
        });
        jPanel1.add(jblEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Search_32px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 30, 40));

        panelx.setBackground(new java.awt.Color(204, 204, 204));

        lbx.setBackground(new java.awt.Color(204, 204, 204));
        lbx.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        lbx.setText("   x");
        lbx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbxMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelxLayout = new javax.swing.GroupLayout(panelx);
        panelx.setLayout(panelxLayout);
        panelxLayout.setHorizontalGroup(
            panelxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelxLayout.setVerticalGroup(
            panelxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelxLayout.createSequentialGroup()
                .addComponent(lbx, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(panelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 60, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 280, 20));

        txtbc.setBorder(null);
        txtbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbcActionPerformed(evt);
            }
        });
        jPanel1.add(txtbc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 280, 30));

        dateText.setText("Hoy es {dayname} {day} de {month} del {year}");
        jPanel1.add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, 280, -1));

        jButton1.setText("Recargar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    

    
    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
 
    }//GEN-LAST:event_exitForm

    private void cafeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafeMousePressed
        // TODO add your handling code here:
        xMause=evt.getX();
        yMause=evt.getY();
    }//GEN-LAST:event_cafeMousePressed

    private void cafeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafeMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMause,y-yMause);
    
    }//GEN-LAST:event_cafeMouseDragged

    private void lbxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbxMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbxMouseClicked

    private void lbxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbxMouseEntered
        // TODO add your handling code here:
        panelx.setBackground(Color.red);
        
    }//GEN-LAST:event_lbxMouseEntered

    private void cafeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cafeMouseExited

    }//GEN-LAST:event_cafeMouseExited

    private void lbxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbxMouseExited
        // TODO add your handling code here:
        panelx.setBackground(Color.white);
    }//GEN-LAST:event_lbxMouseExited

    private void txtbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbcActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
 
  

         
        
    }//GEN-LAST:event_jLabel4MouseClicked
//C:\\Users\\astuard\\Documents\\NetBeansProjects\\Sistema\\src\\main\\java\\Reportes"
    private void jblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblEditarMouseClicked
        // TODO add your handling code here:'
    GestionProductos vtn=new GestionProductos();
    vtn.setVisible(true);
    this.setVisible(false);
              
  
    }//GEN-LAST:event_jblEditarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    
        String NombreProducto = txtbc.getText();
            
        boolean encontrado = false;
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        List<Productos> productosLista = productos.listado();
        for (Productos producto : productosLista) {
            if (NombreProducto.equals(producto.getNombreProducto())) {
                encontrado = true;
                Object[] fila = {
                    producto.getIdProducto(),
                    producto.getNombreProducto(),
                    producto.getPrecio(),  
                    producto.getCantidad(),    
                    producto.getCategoria(),   
                    
                };
                modelo.addRow(fila);
            }

            // Asignar el modelo al JTable
            jTable2.setModel(modelo);
        }
        
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No se encontro ningun estudiante con esa cédula", "Sin Resultados", JOptionPane.INFORMATION_MESSAGE);
        }
      
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        List<Productos> productosLista = ProductosControlBD.listado();
        for (Productos producto : productosLista) {
            Object[] fila = {
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getPrecio(),  
                producto.getCantidad(),    
                producto.getCategoria(),   
                   
            };
            modelo.addRow(fila);
        }

        // Asignar el modelo al JTable
        jTable2.setModel(modelo);
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cafe;
    private javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jblEditar;
    private javax.swing.JLabel lbx;
    private javax.swing.JPanel panelx;
    private javax.swing.JTextField txtbc;
    // End of variables declaration//GEN-END:variables
}
