/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import inventario.Inventario;
import inventario.Producto;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    Inventario i;
    DefaultListModel modelo;
    public Interfaz() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        i =  new Inventario();
        modelo = new DefaultListModel();
        listaProductosAgotados.setModel(modelo);
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
        btnVenderProducto = new javax.swing.JButton();
        btnOrdenarPedido = new javax.swing.JButton();
        btnMostrarEstadisticas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextUnidadesDisponibles = new javax.swing.JTextField();
        jTextLimite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextPrecioBase = new javax.swing.JTextField();
        botonAgregarProducto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductosAgotados = new javax.swing.JList<>();
        botonSeleccion = new javax.swing.JButton();
        botonListaProductosAgotados = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVenderProducto.setText("Vender Producto");
        btnVenderProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderProductoActionPerformed(evt);
            }
        });

        btnOrdenarPedido.setText("Ordenar Pedido");
        btnOrdenarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPedidoActionPerformed(evt);
            }
        });

        btnMostrarEstadisticas.setText("Mostrar Estadisticas");
        btnMostrarEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEstadisticasActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.jpg"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setText("Nombre");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        jTextNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Tipo");

        jCTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papeleria", "Supermercado", "Drogueria" }));
        jCTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Unidades");

        jTextUnidadesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUnidadesDisponiblesActionPerformed(evt);
            }
        });
        jTextUnidadesDisponibles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUnidadesDisponiblesKeyTyped(evt);
            }
        });

        jTextLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLimiteActionPerformed(evt);
            }
        });
        jTextLimite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextLimiteKeyTyped(evt);
            }
        });

        jLabel5.setText("Limite Nuevo Pedido");

        jLabel6.setText("Precio Base");

        jTextPrecioBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrecioBaseActionPerformed(evt);
            }
        });
        jTextPrecioBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPrecioBaseKeyTyped(evt);
            }
        });

        botonAgregarProducto.setText("Agregar Producto");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNombre)
                                .addComponent(jCTipo, 0, 125, Short.MAX_VALUE)
                                .addComponent(jTextLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextUnidadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregarProducto)
                        .addGap(55, 55, 55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextUnidadesDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregarProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos Agotados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPane1.setViewportView(listaProductosAgotados);

        botonSeleccion.setText("Ordenar Seleccion");
        botonSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botonSeleccion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSeleccion))
        );

        botonListaProductosAgotados.setText("Mostrar Lista Productos Agotados");
        botonListaProductosAgotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaProductosAgotadosActionPerformed(evt);
            }
        });

        btnProductos.setText("Ver productos disponibles");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMostrarEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrdenarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenderProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonListaProductosAgotados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenderProducto)
                        .addGap(8, 8, 8)
                        .addComponent(btnOrdenarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMostrarEstadisticas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonListaProductosAgotados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderProductoActionPerformed
        
        String nombreProducto = JOptionPane.showInputDialog("nombre del producto");
        String cantidad = JOptionPane.showInputDialog("Cantidad");
        int cantidadInt = Integer.parseInt(cantidad);
        boolean vendio = i.venderProducto(cantidadInt, nombreProducto);
        if(vendio){
            JOptionPane.showMessageDialog(this, "Se vendio el Producto");
            actualizarLista();
        } else  {
            JOptionPane.showMessageDialog(this, "El producto esta agotado, No se pudo Vender");
        }
        
        
    }//GEN-LAST:event_btnVenderProductoActionPerformed

    private void btnOrdenarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPedidoActionPerformed

      String nombre = JOptionPane.showInputDialog(this,"Nombre");
      int cantidad  = Integer.parseInt(JOptionPane.showInputDialog(this,"Cantidad a Recargar"));
          
          recargar(nombre, cantidad);
    }//GEN-LAST:event_btnOrdenarPedidoActionPerformed

    private void btnMostrarEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEstadisticasActionPerformed
        InterfasPrueba interfas = new InterfasPrueba();
        interfas.setBounds(0,0,540,400);
        interfas.setVisible(true);
        interfas.setResizable(false);
        interfas.setLocationRelativeTo(null);
        
        interfas.textArea.setText(i.estadisticas());
    }//GEN-LAST:event_btnMostrarEstadisticasActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jCTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipoActionPerformed

    private void jTextUnidadesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUnidadesDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUnidadesDisponiblesActionPerformed

    private void jTextLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLimiteActionPerformed

    private void jTextPrecioBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrecioBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrecioBaseActionPerformed

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed
       
        if(!jTextNombre.getText().isEmpty() && !jTextLimite.getText().isEmpty() && !jTextLimite.getText().isEmpty()
                
                && !jTextUnidadesDisponibles.getText().isEmpty()){
           
            Producto e = new Producto(jTextNombre.getText(),jCTipo.getSelectedItem().toString(),
                    Integer.parseInt(jTextUnidadesDisponibles.getText()),Integer.parseInt(jTextLimite.getText()),
                    Double.parseDouble(jTextPrecioBase.getText()));
            if(i.getProductos().add(e)){
                JOptionPane.showMessageDialog(this,"Se Agrego el Prodcuto");
            } 
            else JOptionPane.showMessageDialog(this,"No se pudo agregar");
            jTextNombre.setText("");jTextLimite.setText("");jTextPrecioBase.setText("");jTextUnidadesDisponibles.setText("");
                
        } else{
            JOptionPane.showMessageDialog(this, "Campos Vacios");
        }
        
    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void jTextNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_jTextNombreKeyTyped

    private void jTextUnidadesDisponiblesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUnidadesDisponiblesKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_jTextUnidadesDisponiblesKeyTyped

    private void jTextLimiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLimiteKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_jTextLimiteKeyTyped

    private void jTextPrecioBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPrecioBaseKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_jTextPrecioBaseKeyTyped

    private void botonListaProductosAgotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaProductosAgotadosActionPerformed
        
            actualizarLista();
        
    }//GEN-LAST:event_botonListaProductosAgotadosActionPerformed

    private void actualizarLista(){
        modelo.clear();
        Hashtable<String, Producto> agotados = i.getProductosAgotados();
        Enumeration e = agotados.keys();
        while(e.hasMoreElements()){
            modelo.addElement(agotados.get(e.nextElement().toString()).getNombre());
        }
    }
    private void botonSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionActionPerformed
        
        if(!listaProductosAgotados.isSelectionEmpty()){
            String nombre = listaProductosAgotados.getSelectedValue();
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la cantidad de " + nombre));
            recargar(nombre, cantidad);
        }
    }//GEN-LAST:event_botonSeleccionActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos p = new Productos(i.getProductos());
        p.setVisible(true);
        p.setLocation(200, 100);
    }//GEN-LAST:event_btnProductosActionPerformed
    private void soloNumeros(java.awt.event.KeyEvent evt){
        char presion = evt.getKeyChar();
        if(Character.isLetter(presion)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo Numeros!");
            evt.consume();
        }
    }
      private void soloLetras(java.awt.event.KeyEvent evt){
    
        char presion = evt.getKeyChar();
        if(Character.isDigit(presion)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Solo letras!");
            evt.consume();
            
        }
    }
      private void recargar(String nombre, int cantidad){
          if(i.recargarProducto(nombre, cantidad)){
          JOptionPane.showMessageDialog(this, "Se Recargo el Producto");
          actualizarLista();
          
          } else JOptionPane.showMessageDialog(this, "No hay Dinero suficiente para recargar el Producto");
          
      }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonListaProductosAgotados;
    private javax.swing.JButton botonSeleccion;
    private javax.swing.JButton btnMostrarEstadisticas;
    private javax.swing.JButton btnOrdenarPedido;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVenderProducto;
    private javax.swing.JComboBox<String> jCTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextLimite;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecioBase;
    private javax.swing.JTextField jTextUnidadesDisponibles;
    private javax.swing.JList<String> listaProductosAgotados;
    // End of variables declaration//GEN-END:variables
}
