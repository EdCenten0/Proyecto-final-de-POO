/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import entidades.Clientes;
import datos.Dt_clientes;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

// Filter 
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

/**
 *
 * @author cchav
 */
public class FrmClientes extends javax.swing.JFrame {

    private Clientes clientes = new Clientes();
    private Dt_clientes dt_clientes = new Dt_clientes();
    private ArrayList<Clientes> listClientes = new ArrayList<Clientes>();
    
    DefaultTableModel myData = new DefaultTableModel();
    TableRowSorter trsfiltro;
    /**
     * Creates new form Clientes
     */
    public FrmClientes() {
        initComponents();
        llenarTablaClientes();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_clienteID = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_cedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_numero_telefonico = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_sexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_direccion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jtf_buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable_clientes.setBackground(new java.awt.Color(204, 204, 204));
        jTable_clientes.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jTable_clientes.setForeground(new java.awt.Color(0, 0, 0));
        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ClienteID", "Cedula", "Nombre", "Numero telefonico", "Email", "Sexo", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jTable_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_clientes);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ClienteID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 80, 50, -1));

        tf_clienteID.setEditable(false);
        tf_clienteID.setBackground(new java.awt.Color(204, 204, 204));
        tf_clienteID.setForeground(new java.awt.Color(0, 0, 0));
        tf_clienteID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_clienteIDActionPerformed(evt);
            }
        });
        jPanel3.add(tf_clienteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 100, -1));

        tf_nombre.setBackground(new java.awt.Color(204, 204, 204));
        tf_nombre.setForeground(new java.awt.Color(0, 0, 0));
        tf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nombreKeyTyped(evt);
            }
        });
        jPanel3.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, -1));

        tf_cedula.setBackground(new java.awt.Color(204, 204, 204));
        tf_cedula.setForeground(new java.awt.Color(0, 0, 0));
        tf_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cedulaActionPerformed(evt);
            }
        });
        jPanel3.add(tf_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cedula:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 50, 40, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Numero telefonico:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 109, -1, -1));

        tf_numero_telefonico.setBackground(new java.awt.Color(204, 204, 204));
        tf_numero_telefonico.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(tf_numero_telefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 106, 124, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        tf_email.setBackground(new java.awt.Color(204, 204, 204));
        tf_email.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sexo:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        tf_sexo.setBackground(new java.awt.Color(204, 204, 204));
        tf_sexo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(tf_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Direccion:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        ta_direccion.setBackground(new java.awt.Color(204, 204, 204));
        ta_direccion.setColumns(20);
        ta_direccion.setForeground(new java.awt.Color(0, 0, 0));
        ta_direccion.setRows(5);
        jScrollPane2.setViewportView(ta_direccion);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 242, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Clientes");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btn_editar.setBackground(new java.awt.Color(153, 153, 153));
        btn_editar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        btn_editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        bt_eliminar.setBackground(new java.awt.Color(153, 153, 153));
        bt_eliminar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        bt_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });

        bt_guardar.setBackground(new java.awt.Color(153, 153, 153));
        bt_guardar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        bt_guardar.setForeground(new java.awt.Color(0, 0, 0));
        bt_guardar.setText("Guardar");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Vaciar campos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtf_buscar.setBackground(new java.awt.Color(204, 204, 204));
        jtf_buscar.setForeground(new java.awt.Color(0, 0, 0));
        jtf_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
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

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_guardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btn_editar)
                    .addComponent(bt_eliminar)
                    .addComponent(bt_guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 495));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cedulaActionPerformed

    private void tf_clienteIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_clienteIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_clienteIDActionPerformed

    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
        // TODO add your handling code here:
        if(tf_cedula.getText().equals("") || tf_nombre.getText().equals("") || tf_numero_telefonico.getText().equals("") || tf_email.getText().equals("") || tf_sexo.getText().equals("") || ta_direccion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(tf_cedula.getText().length() > 30){
                mostrarLength("Cedula",30 , tf_cedula.getText().length());
            }else if(tf_nombre.getText().length() > 50){
                mostrarLength("Nombre",50 , tf_nombre.getText().length());
            }else if(tf_numero_telefonico.getText().length() > 20){
                mostrarLength("Numero telefonico", 20, tf_numero_telefonico.getText().length());
            }else if(tf_email.getText().length() > 30){
                mostrarLength("Email", 30, tf_email.getText().length());
            }else if(ta_direccion.getText().length() > 200){
                mostrarLength("Direccion", 200, ta_direccion.getText().length());
            }else if(Integer.parseInt(tf_sexo.getText()) != 1 || Integer.parseInt(tf_sexo.getText()) != 2 ){
                JOptionPane.showMessageDialog(this, "Opciones validas para sexo: 1 (Hombre) o 2 (Mujer)","Opciones no validas",JOptionPane.ERROR_MESSAGE);
            }else{
                clientes.setTienda_id(1);
                clientes.setCedula(tf_cedula.getText());
                clientes.setNombre(tf_nombre.getText());
                clientes.setNumero_telefonico(tf_numero_telefonico.getText());
                clientes.setEmail(tf_email.getText());
                clientes.setSexo(Integer.parseInt(tf_sexo.getText()));
                clientes.setDireccion(ta_direccion.getText());


    //            VAlIDACION DE NOMBRES NO IGUALES
    //            if(dtc.existePais(c.getCountry_id())){
    //                JOptionPane.showMessageDialog(this, "El Id de pais ya existe!", 
    //                    "ERROR", JOptionPane.WARNING_MESSAGE);
    //                jtf_id.setText("");
    //                jtf_id.grabFocus(); 
    //            }

                if(dt_clientes.guardarClientes(clientes)){
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
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void jtf_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscarKeyTyped
        // TODO add your handling code here:
        jtf_buscar.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(final KeyEvent e){
               String cadena = (jtf_buscar.getText()).toUpperCase();
               jtf_buscar.setText(cadena);
               repaint();
               filtrarTabla();
                
                
            }
        
        });
        trsfiltro = new TableRowSorter(jTable_clientes.getModel());
        jTable_clientes.setRowSorter(trsfiltro);
    
    }//GEN-LAST:event_jtf_buscarKeyTyped

    private void jtf_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_buscarActionPerformed
        // TODO add your handling code here:
        jtf_buscar.setText("");
    }//GEN-LAST:event_jtf_buscarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        if(tf_clienteID.getText().equals("") || tf_cedula.getText().equals("") || tf_nombre.getText().equals("") || tf_numero_telefonico.getText().equals("") || tf_email.getText().equals("") || tf_sexo.getText().equals("") || ta_direccion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            if(tf_cedula.getText().length() > 30){
                mostrarLength("Cedula",30 , tf_cedula.getText().length());
            }else if(tf_nombre.getText().length() > 50){
                mostrarLength("Nombre",50 , tf_nombre.getText().length());
            }else if(tf_numero_telefonico.getText().length() > 20){
                mostrarLength("Numero telefonico", 20, tf_numero_telefonico.getText().length());
            }else if(tf_email.getText().length() > 30){
                mostrarLength("Email", 30, tf_email.getText().length());
            }else if(ta_direccion.getText().length() > 200){
                mostrarLength("Direccion", 200, ta_direccion.getText().length());
            }else if(Integer.parseInt(tf_sexo.getText()) != 1 || Integer.parseInt(tf_sexo.getText()) != 2 ){
                JOptionPane.showMessageDialog(this, "Opciones validas para sexo: 1 (Hombre) o 2 (Mujer)","Opciones no validas",JOptionPane.ERROR_MESSAGE);
            }else{
                clientes.setCliente_id(Integer.parseInt(tf_clienteID.getText()));
                clientes.setCedula(tf_cedula.getText());
                clientes.setNombre(tf_nombre.getText());
                clientes.setNumero_telefonico(tf_numero_telefonico.getText());
                clientes.setEmail(tf_email.getText());
                clientes.setSexo(Integer.parseInt(tf_sexo.getText()));
                clientes.setDireccion(ta_direccion.getText());

                if(dt_clientes.editarCliente(clientes)){
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
        }
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        // TODO add your handling code here:
        if(tf_clienteID.getText().equals("") || tf_cedula.getText().equals("") || tf_nombre.getText().equals("") || tf_numero_telefonico.getText().equals("") || tf_email.getText().equals("") || tf_sexo.getText().equals("") || ta_direccion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            clientes.setCliente_id(Integer.parseInt(tf_clienteID.getText()));
            clientes.setCedula(tf_cedula.getText());
            clientes.setNombre(tf_nombre.getText());
            clientes.setNumero_telefonico(tf_numero_telefonico.getText());
            clientes.setEmail(tf_email.getText());
            clientes.setSexo(Integer.parseInt(tf_sexo.getText()));
            clientes.setDireccion(ta_direccion.getText());
            
            if(dt_clientes.borrarCliente(clientes.getCliente_id())){
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
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void jTable_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_clientesMouseClicked
        // TODO add your handling code here:
        int fila = jTable_clientes.getSelectedRow();

        tf_clienteID.setText(jTable_clientes.getValueAt(fila, 0).toString());
        tf_nombre.setText(jTable_clientes.getValueAt(fila, 2).toString());
        tf_cedula.setText(jTable_clientes.getValueAt(fila, 1).toString());
        tf_numero_telefonico.setText(jTable_clientes.getValueAt(fila, 3).toString());
        tf_email.setText(jTable_clientes.getValueAt(fila, 4).toString());
        tf_sexo.setText(jTable_clientes.getValueAt(fila, 5).toString());
        ta_direccion.setText(jTable_clientes.getValueAt(fila, 6).toString());

    }//GEN-LAST:event_jTable_clientesMouseClicked

    private void tf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nombreKeyTyped
        // TODO add your handling code here:
        tf_nombre.addKeyListener(new KeyAdapter() {
            
            @Override
            public void keyReleased(final KeyEvent e){
               String cadena = (tf_nombre.getText()).toUpperCase();
               tf_nombre.setText(cadena);
               
                
                
            }
        
        });
        
    }//GEN-LAST:event_tf_nombreKeyTyped

    
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
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClientes().setVisible(true);
            }
        });
    }
    
    private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        this.llenarTablaClientes();
    }
    
    private void llenarTablaClientes()
    {
         //llenamos la lista
        listClientes = dt_clientes.listarClientes();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("ClienteID");
        listNombreColumnas.add("Cedula");
        listNombreColumnas.add("Nombre");
        listNombreColumnas.add("Numero_telefonico");
        listNombreColumnas.add("Email");
        listNombreColumnas.add("Sexo");
        listNombreColumnas.add("Direccion");
        
        //recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //recorremos cada elemento de la lista y creamos el objeto
        for(Clientes cli: listClientes){
            Object[] datosCli = new Object[]{cli.getCliente_id(), cli.getCedula(), cli.getNombre(), cli.getNumero_telefonico(),cli.getEmail(), cli.getSexo(), cli.getDireccion()};
            //asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosCli);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jTable_clientes.setModel(myData);
    }
    
        private void limpiarCampos(){
        this.tf_clienteID.setText("");
        this.tf_cedula.setText("");
        this.tf_nombre.setText("");
        this.tf_email.setText("");
        this.tf_numero_telefonico.setText("");
        this.tf_sexo.setText("");
        this.ta_direccion.setText("");
        
        
    }
    
    
    
    private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtf_buscar.getText(), 2));
    }
    
    public JPanel getFondo(){
        return jPanel1;
    }
    
    private void mostrarLength(String nombre, int lengthOriginal, int lengthActual){
        JOptionPane.showMessageDialog(this, "El limite de caracteres de "+ nombre +" es de "+ lengthOriginal +", usted ingresó " + lengthActual,"Limite de caracteres",JOptionPane.ERROR_MESSAGE);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JTable jTable_clientes;
    private javax.swing.JTextField jtf_buscar;
    private javax.swing.JTextArea ta_direccion;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_clienteID;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_numero_telefonico;
    private javax.swing.JTextField tf_sexo;
    // End of variables declaration//GEN-END:variables
}
