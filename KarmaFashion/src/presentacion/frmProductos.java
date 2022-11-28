/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entidades.Productos;
import datos.Dt_Productos;
import entidades.TipoProductos;
import datos.dt_TipoProductos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author dagui
 */
public class FrmProductos extends javax.swing.JFrame {
    
    //Declaracion de objetos globlales
    
    //entidades
    private Productos p = new Productos();
    private TipoProductos tp = new TipoProductos();
    
    //clases
    private Dt_Productos dt_p = new Dt_Productos();
    private dt_TipoProductos dTP = new dt_TipoProductos();
    
    //listas
    private ArrayList<Productos> listProductos = new ArrayList<Productos>();
    private ArrayList<TipoProductos> listTipoProductos = new ArrayList<TipoProductos>();
     
    
    //se declara el modelo de datos de la tabla
    DefaultTableModel myData = new DefaultTableModel();
    //se declara un filtro para los datos de la tabla
    TableRowSorter trsfiltro;
    
    

    /**
     * Creates new form frmProductos
     */
    //constructor
    public FrmProductos() {
        initComponents();
        llenarComboTipProd();
        llenarTablaProd();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_prod_id = new javax.swing.JTextField();
        jtf_inventario_id = new javax.swing.JTextField();
        jcb_producto_id = new javax.swing.JComboBox<>();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSuprimir = new javax.swing.JButton();
        jtf_nombre = new javax.swing.JTextField();
        jtf_precio = new javax.swing.JTextField();
        jtf_marca = new javax.swing.JTextField();
        jtf_fecha_ingreso = new javax.swing.JTextField();
        jtf_descripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_productos = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("frmProductos");
        setName("frmProductos"); // NOI18N
        setResizable(false);

        jLabel1.setText("producto_id: ");

        jLabel2.setText("tipo_producto_id: ");

        jLabel3.setText("inventario_id: ");

        jLabel4.setText("nombre:");

        jLabel5.setText("descripcion:");

        jLabel6.setText("precio:");

        jLabel7.setText("marca:");

        jLabel8.setText("fecha_ingreso:");

        jtf_prod_id.setEditable(false);
        jtf_prod_id.setPreferredSize(new java.awt.Dimension(50, 25));
        jtf_prod_id.setRequestFocusEnabled(false);
        jtf_prod_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_prod_idActionPerformed(evt);
            }
        });

        jtf_inventario_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_inventario_idActionPerformed(evt);
            }
        });

        jcb_producto_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jcb_producto_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_producto_idActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSuprimir.setText("Suprimir");
        jbSuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSuprimirActionPerformed(evt);
            }
        });

        jtf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombreKeyTyped(evt);
            }
        });

        jLabel9.setText("Buscar:");

        jtf_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_buscarActionPerformed(evt);
            }
        });
        jtf_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_buscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcb_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtf_inventario_id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtf_precio, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(jtf_marca)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtf_fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbGuardar)
                                    .addComponent(jbNuevo)
                                    .addComponent(jbEditar)
                                    .addComponent(jbSuprimir)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_nombre)
                        .addGap(504, 504, 504))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jbNuevo)
                            .addComponent(jtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSuprimir))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtf_inventario_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jcb_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jtbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "producto_id", "inventario_id", "tipo_producto_id", "nombre", "descripcion", "precio", "marca", "fecha_ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl_productos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_inventario_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_inventario_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_inventario_idActionPerformed

    private void jtf_prod_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_prod_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_prod_idActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtf_inventario_id.getText().equals("") || jtf_nombre.getText().equals("") || jtf_precio.getText().equals("") || jtf_marca.getText().equals("") || jtf_fecha_ingreso.getText().equals("") || jtf_descripcion.getText().equals("") || jcb_producto_id.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
      
            p.setProducto_id(Integer.parseInt(jtf_prod_id.getText()));
            p.setInventario_id(Integer.parseInt(jtf_inventario_id.getText()));
            p.setNombre(jtf_nombre.getText());
            p.setDescripcion(jtf_descripcion.getText());
            p.setPrecio(Float.parseFloat(jtf_precio.getText()));
            p.setMarca(jtf_marca.getText());
            p.setFecha_ingreso(jtf_fecha_ingreso.getText());
            tp = (TipoProductos)this.jcb_producto_id.getItemAt(this.jcb_producto_id.getSelectedIndex());
            p.setTipo_producto(tp.getTipoProdId());
            //p.setPrecio(TOP_ALIGNMENT);
            
           
            //validamos que el metodo guardar devuelve un true
            if(dt_p.editarProductos(p)){
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
        
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtbl_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_productosMouseClicked
        // TODO add your handling code here:
        //obtenemos la fila seleccionada
        /*int fila = jtbl_productos.getSelectedRow();*/
        
        //obtenemos la fila seleccionada del jtable
        int fila = this.jtbl_productos.getSelectedRow();
        int idProd = 0; //guarda el idProductos que se obtiene de la tabla
        int size = 0; //guarda la cantidad de elementos que hay en el jcombobx de Locations
        int pos = 1; //variable de control para recorrer las posiciones de los elementos en el jcombobox
        
        //asignamos los valores a los campos del formulario
        this.jtf_prod_id.setText(jtbl_productos.getValueAt(fila, 0).toString());
        this.jtf_inventario_id.setText(jtbl_productos.getValueAt(fila, 1).toString());
        this.jtf_nombre.setText(jtbl_productos.getValueAt(fila, 3).toString());
        this.jtf_descripcion.setText(jtbl_productos.getValueAt(fila, 4).toString());
        this.jtf_precio.setText(jtbl_productos.getValueAt(fila, 5).toString());
        this.jtf_marca.setText(jtbl_productos.getValueAt(fila, 6).toString());
        this.jtf_fecha_ingreso.setText(jtbl_productos.getValueAt(fila, 7).toString());
        
        //obtenemos el idProductos del jtable
        idProd = Integer.parseInt(this.jtbl_productos.getValueAt(fila, 2).toString());
        System.out.println("idProd: "+idProd);
        
        size = this.jcb_producto_id.getItemCount(); //obtenemos la cantidad de elementos contenidos en el jcombobox
        System.out.println("size: "+size);
        do{
            
            tp = (TipoProductos)this.jcb_producto_id.getItemAt(pos);
            if(tp.getTipoProdId()==idProd){
                //selecciono el objeto del jcombobox
                this.jcb_producto_id.setSelectedIndex(pos);
                System.out.println("pos: "+pos);
                break;
            }
            pos++;
        }
        while(pos<=size);
        /*

        //asignamos los valores a los campos del formulario
        jtf_prod_id.setText(jtbl_productos.getValueAt(fila, 0).toString());
        jtf_inventario_id.setText(jtbl_productos.getValueAt(fila, 1).toString());
        jtf_nombre.setText(jtbl_productos.getValueAt(fila, 3).toString());
        jtf_precio.setText(jtbl_productos.getValueAt(fila, 5).toString());
        jtf_marca.setText(jtbl_productos.getValueAt(fila, 6).toString());
        jtf_fecha_ingreso.setText(jtbl_productos.getValueAt(fila, 7).toString());
        jtf_descripcion.setText(jtbl_productos.getValueAt(fila, 4).toString());
        jcb_producto_id.setSelectedIndex(Integer.parseInt(jtbl_productos.getValueAt(fila, 2).toString())-1);
        */
    }//GEN-LAST:event_jtbl_productosMouseClicked

    private void jcb_producto_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_producto_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_producto_idActionPerformed

    private void jtf_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarKeyTyped
        // TODO add your handling code here:
        
        jtf_buscar.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            
            @Override
            public void keyReleased(final KeyEvent e){
                String caden = (jtf_buscar.getText()).toUpperCase();
                jtf_buscar.setText(caden);
                repaint(); //actualiza los componentes
                filtrarTabla();
            }
        });
        trsfiltro = new TableRowSorter(jtbl_productos.getModel());
        jtbl_productos.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtf_buscarKeyTyped

    private void jtf_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_buscarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtf_inventario_id.getText().equals("") || jtf_nombre.getText().equals("") || jtf_precio.getText().equals("") || jtf_marca.getText().equals("") || jtf_fecha_ingreso.getText().equals("") || jtf_descripcion.getText().equals("") || jcb_producto_id.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            
            //p.setInventario_id(Integer.parseInt(jtf_inventario_id.getText()));
            p.setNombre(jtf_nombre.getText());
            tp = (TipoProductos)this.jcb_producto_id.getItemAt(this.jcb_producto_id.getSelectedIndex());//dif
            p.setTipo_producto(tp.getTipoProdId());
            p.setInventario_id(Integer.parseInt(jtf_inventario_id.getText()));
            p.setPrecio(Float.parseFloat(jtf_precio.getText()));
            p.setMarca(jtf_marca.getText());
            p.setFecha_ingreso(jtf_fecha_ingreso.getText());
            p.setDescripcion(jtf_descripcion.getText());
            
            if(dt_p.existeProducto(p)){
                JOptionPane.showMessageDialog(this, "El departamento que intenta ingresar ya existe, por favor revise sus datos e intente nuevamente!", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }else{ 
                //validamos que el metodo guardar devuelve un true
                if(dt_p.guardarProductos(p)){
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
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombreKeyTyped
        // TODO add your handling code here:
        jtf_nombre.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtf_nombre.getText()).toUpperCase();
                jtf_nombre.setText(cadena);
                repaint();
            }
        });
        
    }//GEN-LAST:event_jtf_nombreKeyTyped

    private void jbSuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSuprimirActionPerformed
        // TODO add your handling code here:
        
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtf_inventario_id.getText().equals("") || jtf_nombre.getText().equals("") || jtf_precio.getText().equals("") || jtf_marca.getText().equals("") || jtf_fecha_ingreso.getText().equals("") || jtf_descripcion.getText().equals("") || jcb_producto_id.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un registro de la tabla!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            p.setInventario_id(Integer.parseInt(jtf_inventario_id.getText()));
            p.setTipo_producto(jcb_producto_id.getSelectedIndex());
            p.setNombre(jtf_nombre.getText());
            p.setPrecio(Float.parseFloat(jtf_precio.getText()));
            p.setMarca(jtf_marca.getText());
            p.setFecha_ingreso(jtf_fecha_ingreso.getText());
            //p.setPrecio(TOP_ALIGNMENT);
            p.setDescripcion(jtf_descripcion.getText());

                //validamos que el metodo editar devuelve un true
                if(dt_p.deleteProductos(p.getProducto_id())){
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
        
    }//GEN-LAST:event_jbSuprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductos().setVisible(true);
            }
        });
    }
    
    //metodos
    private void llenarTablaProd(){
        //listamos la lista
        listProductos = dt_p.listarProductos();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("producto_id");
        listNombreColumnas.add("inventario_id");
        listNombreColumnas.add("tipo_producto");
        listNombreColumnas.add("nombre");
        listNombreColumnas.add("descripcion");
        listNombreColumnas.add("precio");
        listNombreColumnas.add("marca");
        listNombreColumnas.add("fecha_ingreso");
        
        
        for(Object column: listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
            
        }
      
        
        //recorremos cada elemento de la lista y creamos el objeto
        for(Productos prod: listProductos){
            //Object[] datosDep = new Object[]{dep.getDepartment_id(), dep.getDepartment_name(), dep.getLocation_id()};
            Object[] datosProd = new Object[]{prod.getProducto_id(), prod.getInventario_id(), prod.getTipo_producto(), prod.getNombre(), prod.getDescripcion(), prod.getPrecio(), prod.getMarca(), prod.getFecha_ingreso()};
            //asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosProd);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jtbl_productos.setModel(myData);
    }
    
    
    private void llenarComboTipProd(){
        //llenamos la lista
        listTipoProductos = dTP.listarTipoProductos();
        /* removemos los ítems precargados en el combobox
        this.jcb_region.removeAllItems(); */
        //recorremos cada elemento de la lista y creamos el objeto
        for(TipoProductos tp: listTipoProductos){
            //asignamos el objeto creado al combobox
            this.jcb_producto_id.addItem(tp);
        }
        
        /*
        Iterator iterator = listaRegion.iterator();
        while(iterator.hasNext()){
           r = (Region) iterator.next();
           this.jcb_region.addItem(r);
        }
        */
        
    }
    
    
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaProd();
    }
    
    private void limpiarCampos(){
        this.jtf_prod_id.setText("");
        this.jtf_inventario_id.setText("");
        this.jtf_nombre.setText("");
        this.jtf_precio.setText("");
        this.jtf_marca.setText("");
        this.jtf_fecha_ingreso.setText("");
        this.jtf_descripcion.setText("");
        //this.jtf_buscar.setText("");
        //this.jcb_producto_id.setSelectedIndex(0);
    }

    private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 3)); //el 3 inidica la col del nombre de la columna
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSuprimir;
    private javax.swing.JComboBox<Object> jcb_producto_id;
    private javax.swing.JTable jtbl_productos;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_descripcion;
    private javax.swing.JTextField jtf_fecha_ingreso;
    private javax.swing.JTextField jtf_inventario_id;
    private javax.swing.JTextField jtf_marca;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_precio;
    private javax.swing.JTextField jtf_prod_id;
    // End of variables declaration//GEN-END:variables
}
