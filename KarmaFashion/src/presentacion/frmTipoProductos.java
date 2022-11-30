/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entidades.Productos;
import entidades.TipoProductos;
import datos.Dt_Productos;
import datos.dt_TipoProductos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
//import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author dagui
 */

public class frmTipoProductos extends javax.swing.JFrame {

    /**
     * Creates new form frmTipoProductos
     */
    
    //Declaracion de objetos globales
    //listas
    ArrayList<TipoProductos> listaTipoProd = new ArrayList<TipoProductos>();
    
    //entidades
    TipoProductos tP = new TipoProductos();
   
    //datos
    dt_TipoProductos dtTiPr = new dt_TipoProductos();
    
    //declaramos el modelo de datos de la tabla 
    DefaultTableModel myData = new DefaultTableModel();
    //declaramos un filtro de datos para la tabla
    TableRowSorter trsfiltro;
    
    
    //constructor del formulario
    public frmTipoProductos() {
        initComponents();
        llenarTabla();
        limpiarCampos();
        
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
        jLabel1 = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_descripcion = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_suprimir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_tipoProdId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_tipo_producto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion: ");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_suprimir.setText("Suprimir");
        btn_suprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suprimirActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipos de productos de la tienda");

        jLabel4.setText("TipoProdId:");

        jtf_tipoProdId.setEditable(false);

        jtbl_tipo_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "TipoProdId", "Nombre", "Descripcion"
            }
        ));
        jtbl_tipo_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_tipo_productoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_tipo_producto);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btn_nuevo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtf_tipoProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_suprimir)))
                .addGap(41, 41, 41))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_nuevo)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_guardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtf_tipoProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_editar)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_suprimir))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if( jtf_nombre.getText().equals("") || jtf_descripcion.equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            
            //tP.setTipoProdId(Integer.parseInt(jtf_tipoProdId.getText()));
            tP.setNombre(jtf_nombre.getText());
            tP.setDescripcion(jtf_descripcion.getText());
            
            //validamos que el id no exista en la tabla de la bd
            if(dtTiPr.existeTipoProducto(tP.getTipoProdId())){
                JOptionPane.showMessageDialog(this, "El nombre de producto ya existe!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
                jtf_nombre.setText("");
                jtf_nombre.grabFocus(); 
            }
            else{
                //validamos que el metodo guardar devuelve un true
                if(dtTiPr.guardarTipoProducto(tP)){
                    JOptionPane.showMessageDialog (this, "El registro fue almacenado con éxito!", 
                      "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    actualizarTabla();
                    limpiarCampos();
                }
                else{
                   JOptionPane.showMessageDialog(this, 
                      "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                      "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if( jtf_nombre.getText().equals("") || jtf_descripcion.equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            tP.setTipoProdId(Integer.parseInt(jtf_tipoProdId.getText()));
            tP.setNombre(jtf_nombre.getText());
            tP.setDescripcion(jtf_descripcion.getText());
            
            //validamos que el metodo actualizar devuelve un true
            if(dtTiPr.editarTipoProducto(tP)){
                JOptionPane.showMessageDialog (this, "El registro fue actualizado con éxito!", 
                  "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
                limpiarCampos();
            }
            else{
               JOptionPane.showMessageDialog(this, 
                  "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                  "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }   
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_suprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suprimirActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if( jtf_nombre.getText().equals("") || jtf_descripcion.equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            
            tP.setTipoProdId(Integer.parseInt(jtf_tipoProdId.getText()));
            tP.setNombre(jtf_nombre.getText());
            tP.setDescripcion(jtf_descripcion.getText());
            
            //validamos que el metodo delete devuelve un true
            if(dtTiPr.deleteTipoProducto(tP)){
                JOptionPane.showMessageDialog (this, "El registro fue eliminado con éxito!", 
                  "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                actualizarTabla();
                limpiarCampos();
            }
            else{
               JOptionPane.showMessageDialog(this, 
                  "Revise los datos e intente nuevamente. Si el error persiste contacte al Administrador del Sistema.", 
                  "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }   
    }//GEN-LAST:event_btn_suprimirActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void jtbl_tipo_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_tipo_productoMouseClicked
        // TODO add your handling code here:
        //obtenemos la fila seleccionada del jtable
        int fila = this.jtbl_tipo_producto.getSelectedRow();
                
        //asignamos los valores a los campos del formulario
        this.jtf_tipoProdId.setText(this.jtbl_tipo_producto.getValueAt(fila, 0).toString());
        this.jtf_nombre.setText(this.jtbl_tipo_producto.getValueAt(fila, 1).toString());
        this.jtf_descripcion.setText(this.jtbl_tipo_producto.getValueAt(fila, 2).toString());
        
        
    }//GEN-LAST:event_jtbl_tipo_productoMouseClicked

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
            java.util.logging.Logger.getLogger(frmTipoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTipoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTipoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTipoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTipoProductos().setVisible(true);
            }
        });
    }
    
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTabla();
    }
    
    private void limpiarCampos(){
        this.jtf_tipoProdId.setText("");
        this.jtf_nombre.setText("");
        //this.jtf_buscar.setText("");
        this.jtf_descripcion.setText("");
    }
    
     private void llenarTabla(){        
        //llenamos la lista
        listaTipoProd = dtTiPr.listarTipoProductos();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("TipoproductoID");
        listNombreColumnas.add("Nombre");
        listNombreColumnas.add("Descripcion");
        //recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //recorremos cada elemento de la lista y creamos el objeto
        for(TipoProductos tipProd: listaTipoProd){
            Object[] dttipoproductos = new Object[]{tipProd.getTipoProdId(), tipProd.getNombre(), tipProd.getDescripcion()};
            //asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(dttipoproductos);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jtbl_tipo_producto.setModel(myData);
    }
    
    /*private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 1));
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_suprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbl_tipo_producto;
    private javax.swing.JTextField jtf_descripcion;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_tipoProdId;
    // End of variables declaration//GEN-END:variables
}
