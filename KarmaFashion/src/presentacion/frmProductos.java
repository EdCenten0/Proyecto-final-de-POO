/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entidades.Productos;
import datos.Dt_Productos;
import entidades.TipoProductos;
import datos.Dt_TipoProductos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Isabel Denisse Aguilar Vilchez 
 */
public class FrmProductos extends javax.swing.JFrame {
    
    //Declaracion de objetos globlales
    
    //entidades
    private Productos p = new Productos();
    private TipoProductos tp = new TipoProductos();
    
    //clases
    private Dt_Productos dt_p = new Dt_Productos();
    private Dt_TipoProductos dTP = new Dt_TipoProductos();
    
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
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtf_prod_id = new javax.swing.JTextField();
        jcb_producto_id = new javax.swing.JComboBox<>();
        jtf_nombre = new javax.swing.JTextField();
        jtf_precio = new javax.swing.JTextField();
        jtf_marca = new javax.swing.JTextField();
        jtf_fecha_ingreso = new javax.swing.JTextField();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jbSuprimir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbl_productos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jtf_buscar = new javax.swing.JTextField();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Buscar:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 212, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ProductoID:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TipoProductoID:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descripcion:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Marca:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de ingreso:");

        jtf_prod_id.setEditable(false);
        jtf_prod_id.setBackground(new java.awt.Color(204, 204, 204));
        jtf_prod_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtf_prod_id.setPreferredSize(new java.awt.Dimension(50, 25));
        jtf_prod_id.setRequestFocusEnabled(false);
        jtf_prod_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_prod_idActionPerformed(evt);
            }
        });

        jcb_producto_id.setBackground(new java.awt.Color(204, 204, 204));
        jcb_producto_id.setForeground(new java.awt.Color(0, 0, 0));
        jcb_producto_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jcb_producto_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jcb_producto_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_producto_idActionPerformed(evt);
            }
        });

        jtf_nombre.setBackground(new java.awt.Color(204, 204, 204));
        jtf_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombreKeyTyped(evt);
            }
        });

        jtf_precio.setBackground(new java.awt.Color(204, 204, 204));
        jtf_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtf_marca.setBackground(new java.awt.Color(204, 204, 204));
        jtf_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtf_fecha_ingreso.setBackground(new java.awt.Color(204, 204, 204));
        jtf_fecha_ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(jtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_prod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcb_producto_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jtf_fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 800, 150));

        jbSuprimir.setBackground(new java.awt.Color(102, 102, 102));
        jbSuprimir.setForeground(new java.awt.Color(0, 0, 0));
        jbSuprimir.setText("Eliminar");
        jbSuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSuprimirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSuprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jbEditar.setBackground(new java.awt.Color(102, 102, 102));
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jbGuardar.setBackground(new java.awt.Color(102, 102, 102));
        jbGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jbNuevo.setBackground(new java.awt.Color(102, 102, 102));
        jbNuevo.setForeground(new java.awt.Color(0, 0, 0));
        jbNuevo.setText("Vaciar campos");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jtbl_productos.setBackground(new java.awt.Color(204, 204, 204));
        jtbl_productos.setForeground(new java.awt.Color(0, 0, 0));
        jtbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ProductoID", "TipoProductoID", "Nombre", "Descripcion", "Marca", "Precio", "Fecha de ingreso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbl_productos);
        if (jtbl_productos.getColumnModel().getColumnCount() > 0) {
            jtbl_productos.getColumnModel().getColumn(0).setResizable(false);
            jtbl_productos.getColumnModel().getColumn(1).setResizable(false);
            jtbl_productos.getColumnModel().getColumn(2).setResizable(false);
            jtbl_productos.getColumnModel().getColumn(3).setResizable(false);
            jtbl_productos.getColumnModel().getColumn(4).setResizable(false);
            jtbl_productos.getColumnModel().getColumn(5).setResizable(false);
            jtbl_productos.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 800, 260));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtf_buscar.setBackground(new java.awt.Color(204, 204, 204));
        jtf_buscar.setForeground(new java.awt.Color(0, 0, 0));
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 700, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        if(jtf_nombre.getText().equals("") || jtf_precio.getText().equals("") || jtf_marca.getText().equals("") || jtf_fecha_ingreso.getText().equals("") || jTextArea1.getText().equals("") || jcb_producto_id.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un registro de la tabla!",
                "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            p.setProducto_id(Integer.parseInt(jtf_prod_id.getText()));

            p.setNombre(jtf_nombre.getText());
            p.setPrecio(Float.parseFloat(jtf_precio.getText()));
            p.setMarca(jtf_marca.getText());
            p.setFecha_ingreso(jtf_fecha_ingreso.getText());
            p.setDescripcion(jTextArea1.getText());
            tp = (TipoProductos)this.jcb_producto_id.getItemAt(this.jcb_producto_id.getSelectedIndex());
            p.setTipo_producto(tp.getTipoProdId());

            //validamos que el metodo editar devuelve un true
            if(dt_p.deleteProductos(p)){
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

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:

        //validamos que todos los campos sean ingresados por el usuario
        if(jtf_nombre.getText().equals("") || jtf_precio.getText().equals("") || jtf_marca.getText().equals("") || jtf_fecha_ingreso.getText().equals("") || jTextArea1.getText().equals("") || jcb_producto_id.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!",
                "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario

            p.setProducto_id(Integer.parseInt(jtf_prod_id.getText()));
            p.setNombre(jtf_nombre.getText());
            p.setDescripcion(jTextArea1.getText());
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

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        //validamos que todos los campos sean ingresados por el usuario
        if(jtf_nombre.getText().equals("") || jtf_precio.getText().equals("") || jtf_marca.getText().equals("") || jtf_fecha_ingreso.getText().equals("") || jTextArea1.getText().equals("") || jcb_producto_id.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!",
                "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario

            //p.setInventario_id(Integer.parseInt(jtf_inventario_id.getText()));
            p.setNombre(jtf_nombre.getText());
            tp = (TipoProductos)this.jcb_producto_id.getItemAt(this.jcb_producto_id.getSelectedIndex());//dif
            p.setTipo_producto(tp.getTipoProdId());
            p.setMarca(jtf_marca.getText());
            p.setPrecio(Float.parseFloat(jtf_precio.getText()));
            p.setFecha_ingreso(jtf_fecha_ingreso.getText());
            p.setDescripcion(jTextArea1.getText());

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

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jcb_producto_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_producto_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_producto_idActionPerformed

    private void jtf_prod_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_prod_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_prod_idActionPerformed

    private void jtbl_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_productosMouseClicked
        // TODO add your handling code here:
        int fila = this.jtbl_productos.getSelectedRow();
        int idProd = 0; //guarda el idProductos que se obtiene de la tabla
        int size = 0; //guarda la cantidad de elementos que hay en el jcombobx de Locations
        int pos = 1; //variable de control para recorrer las posiciones de los elementos en el jcombobox
        
        //asignamos los valores a los campos del formulario
        this.jtf_prod_id.setText(jtbl_productos.getValueAt(fila, 0).toString());
        this.jtf_nombre.setText(jtbl_productos.getValueAt(fila, 2).toString());
        this.jTextArea1.setText(jtbl_productos.getValueAt(fila, 3).toString());
        this.jtf_precio.setText(jtbl_productos.getValueAt(fila, 5).toString());
        this.jtf_marca.setText(jtbl_productos.getValueAt(fila, 4).toString());
        this.jtf_fecha_ingreso.setText(jtbl_productos.getValueAt(fila, 6).toString());
        
        
        //obtenemos el idProductos del jtable
        idProd = Integer.parseInt(this.jtbl_productos.getValueAt(fila, 1).toString());
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
    }//GEN-LAST:event_jtbl_productosMouseClicked

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
        listNombreColumnas.add("ProductoID");
        listNombreColumnas.add("TipoproductoId");
        listNombreColumnas.add("Nombre");
        listNombreColumnas.add("Descripcion");
        listNombreColumnas.add("Marca");
        listNombreColumnas.add("Precio");
        listNombreColumnas.add("Fecha_ingreso");
      
        
        
        for(Object column: listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
            
        }
      
        
        //recorremos cada elemento de la lista y creamos el objeto
        for(Productos prod: listProductos){
            //Object[] datosDep = new Object[]{dep.getDepartment_id(), dep.getDepartment_name(), dep.getLocation_id()};
            Object[] datosProd = new Object[]{prod.getProducto_id(), prod.getTipo_producto(), prod.getNombre(), prod.getDescripcion(), prod.getMarca(), prod.getPrecio(), prod.getFecha_ingreso(), prod.getEstado()};
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
        this.jtf_nombre.setText("");
        this.jtf_precio.setText("");
        this.jtf_marca.setText("");
        this.jtf_fecha_ingreso.setText("");
        this.jTextArea1.setText("");
        
        //this.jtf_buscar.setText("");
        //this.jcb_producto_id.setSelectedIndex(0);
    }

    private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 2)); //el 3 inidica la col del nombre de la columna
    }
    
    public JPanel getFondo(){
        return jPanel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSuprimir;
    private javax.swing.JComboBox<Object> jcb_producto_id;
    private javax.swing.JTable jtbl_productos;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextField jtf_fecha_ingreso;
    private javax.swing.JTextField jtf_marca;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_precio;
    private javax.swing.JTextField jtf_prod_id;
    // End of variables declaration//GEN-END:variables
}
