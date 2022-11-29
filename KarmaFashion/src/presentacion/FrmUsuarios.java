/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import datos.Dt_rol;
import datos.Dt_usuarios;
import entidades.Roles;
import presentacion.FrmAgregarUser;



import entidades.Usuarios;
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
 * @author Francisco de Jesus Melendez Simplina
 */
public class FrmUsuarios extends javax.swing.JFrame {
    
    private FrmAgregarUser AgregarUsuario = new FrmAgregarUser();
    ArrayList<Roles> listaRol = new ArrayList<Roles>();
    
    Roles r = new Roles();
    Usuarios u = new Usuarios();
    
    Dt_rol dtR = new Dt_rol();
    private Usuarios users = new Usuarios();
    private Dt_usuarios dt_user = new Dt_usuarios();
    private ArrayList<Usuarios> listUser = new ArrayList<Usuarios>();
    
    //declaramos un filtro de datos para la tabla
    TableRowSorter trsfiltro;
    DefaultTableModel myData = new DefaultTableModel();
    
    /**
     * Creates new form FrmUsuarios
     */
    public FrmUsuarios() {
        initComponents();
        llenarTablaUsuarios();
        llenarComboRol();
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
        jtUsuarios = new javax.swing.JTable();
        jbAgregar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcRol = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtUsuarioID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtClave = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jtbuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jtUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        jtUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario ID", "Rol ID", "Usuario", "Clave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtUsuarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtUsuariosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jtUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtUsuarios);

        jbAgregar.setBackground(new java.awt.Color(153, 153, 153));
        jbAgregar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jbAgregar.setText("Agregar usuario");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(153, 153, 153));
        jbEliminar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jbEliminar.setText("Eliminar Usuario");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbEditar.setBackground(new java.awt.Color(153, 153, 153));
        jbEditar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setText("Editar Usuario");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuarios");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario ID:");

        jtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jtUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Rol:");

        jcRol.setBackground(new java.awt.Color(204, 204, 204));
        jcRol.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jcRol.setForeground(new java.awt.Color(0, 0, 0));
        jcRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione..." }));
        jcRol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcRolMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");

        jtUsuarioID.setEditable(false);
        jtUsuarioID.setBackground(new java.awt.Color(204, 204, 204));
        jtUsuarioID.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jtUsuarioID.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Clave:");

        jtClave.setBackground(new java.awt.Color(204, 204, 204));
        jtClave.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jtClave.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtUsuarioID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcRol, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtUsuarioID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jcRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jbLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        jbLimpiar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiar.setText("Limpiar campos");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jtbuscar.setBackground(new java.awt.Color(204, 204, 204));
        jtbuscar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N
        jtbuscar.setForeground(new java.awt.Color(0, 0, 0));
        jtbuscar.setText("Buscar...");
        jtbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbuscarMouseClicked(evt);
            }
        });
        jtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbuscarActionPerformed(evt);
            }
        });
        jtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtbuscarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtbuscar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtUsuario.getText().equals("") || jtClave.getText().equals("") || jcRol.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //construimos nuestro objeto con los valores del formulario
            users.setUsuarioID(Integer.parseInt(jtUsuarioID.getText()));
            users.setUsername(jtUsuario.getText());
            users.setClave(jtClave.getText());
            r = (Roles)this.jcRol.getSelectedItem();
            users.setRolID(r.getRolID());
            
            
            
            //validamos que el metodo delete devuelve un true
            if(dt_user.eliminarUsuario(users.getUsuarioID())){
                JOptionPane.showMessageDialog (this, "El Usuario fue eliminado con éxito!", 
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
        
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtUsuariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtUsuariosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuariosAncestorAdded

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        if(jtUsuario.getText().equals("") || jtClave.getText().equals("") || jcRol.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(jtUsuario.getText().length() > 15){
                mostrarLength("Usuario", 15, jtUsuario.getText().length());
            }else if(jtClave.getText().length() > 15){
                mostrarLength("Clave", 15, jtClave.getText().length());
            }else{
                //construimos nuestro objeto con los valores del formulario
                //r=(Usuarios);
                r = (Roles)this.jcRol.getSelectedItem();
                u.setRolID(r.getRolID());
                u.setUsername(jtUsuario.getText());
                u.setClave(jtClave.getText());

                //validamos que el id no exista en la tabla de la bd
                if(dt_user.existeUsuario(u.getUsername())){
                    JOptionPane.showMessageDialog(this, "El nombre de Usuario ya existe, digite otro nombre!", 
                        "ERROR", JOptionPane.WARNING_MESSAGE);
                    jtUsuario.setText("");
                    jtUsuario.grabFocus(); 
                    actualizarTabla();
                    limpiarCampos();
                }
                else{

                    //validamos que el metodo guardar devuelve un true
                    if(dt_user.guardarUsuario(u)){
                        JOptionPane.showMessageDialog (this, "El Usuario fue almacenado con éxito!", 
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
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuariosMouseClicked
        // TODO add your handling code here:
        int fila = jtUsuarios.getSelectedRow();

        //asignamos los valores a los campos del formulario
        jtUsuarioID.setText(jtUsuarios.getValueAt(fila, 0).toString());
         
        jcRol.setSelectedIndex(Integer.parseInt(jtUsuarios.getValueAt(fila, 1).toString()));  
        jtUsuario.setText(jtUsuarios.getValueAt(fila, 2).toString());
        jtClave.setText(jtUsuarios.getValueAt(fila, 3).toString());
             
    }//GEN-LAST:event_jtUsuariosMouseClicked

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        
        //validamos que todos los campos sean ingresados por el usuario      
        if(jtUsuario.getText().equals("") || jtClave.getText().equals("") || jcRol.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Todos los campos son requeridos!", 
                    "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(jtUsuario.getText().length() > 15){
                mostrarLength("Usuario", 15, jtUsuario.getText().length());
            }else if(jtClave.getText().length() > 15){
                mostrarLength("Clave", 15, jtClave.getText().length());
            }else{
                //construimos nuestro objeto con los valores del formulario
                users.setUsuarioID(Integer.parseInt(jtUsuarioID.getText()));
                users.setUsername(jtUsuario.getText());
                users.setClave(jtClave.getText());
                r = (Roles)this.jcRol.getSelectedItem();
                users.setRolID(r.getRolID());


                //validamos que el metodo delete devuelve un true
                if(dt_user.editarUsuario(users)){
                    JOptionPane.showMessageDialog (this, "El Usuario fue editado con éxito!", 
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

    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbuscarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtbuscarActionPerformed

    private void jtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbuscarKeyTyped
        // TODO add your handling code here:
        jtbuscar.addKeyListener(new KeyAdapter(){
            //Se ejecuta cuando el usuario libera una tecla
            @Override
            public void keyReleased(final KeyEvent e){
                String cadena = (jtbuscar.getText());
                jtbuscar.setText(cadena);
                repaint();
                filtrarTabla();
            }
        });
        trsfiltro = new TableRowSorter(jtUsuarios.getModel());
        jtUsuarios.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtbuscarKeyTyped

    private void jtbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbuscarMouseClicked
        // TODO add your handling code here:
        jtbuscar.setText("");
    }//GEN-LAST:event_jtbuscarMouseClicked

    private void jcRolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcRolMouseClicked
        // TODO add your handling code here:
        llenarComboRol();
    }//GEN-LAST:event_jcRolMouseClicked

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
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuarios().setVisible(true);
            }
        });
    }
    
     private void llenarTablaUsuarios()
    {
         //llenamos la lista
        listUser = dt_user.listarUsuarios();
        
        //creamos un arraylist con las columnas del modelo
        ArrayList<Object> listNombreColumnas = new ArrayList<Object>();
        listNombreColumnas.add("UsuarioID");
        listNombreColumnas.add("RolID");
        listNombreColumnas.add("Username");
        listNombreColumnas.add("Clave");
  

        
        //recorremos cada elemento del arraylist y creamos un objeto
        for(Object column : listNombreColumnas){
            //asignamos las columnas al modelo
            myData.addColumn(column);
        }
        
       //recorremos cada elemento de la lista y creamos el objeto
        for(Usuarios user: listUser){
            Object[] datosUser = new Object[]{user.getUsuarioID(),user.getRolID(), user.getUsername(), user.getClave()};
            //asignamos un arreglo de objetos a una fila del modelo
            myData.addRow(datosUser);
        }
        //Asignamos el modelo y/o coleccion de datos a la tabla
        jtUsuarios.setModel(myData);
    }
     
     private void llenarComboRol(){
        //llenamos la lista
        listaRol = dtR.listarRol();

        //recorremos cada elemento de la lista y creamos el objeto
        for(Roles rl: listaRol){
            //asignamos el objeto creado al combobox
            this.jcRol.addItem(rl);   
        }
        
        
    }
     
     private void filtrarTabla(){
       trsfiltro.setRowFilter(RowFilter.regexFilter(jtbuscar.getText(), 2));
    }
     
     private void actualizarTabla(){
        myData.setColumnCount(0);
        myData.setRowCount(0);
        llenarTablaUsuarios();
    }
     
     private void limpiarCampos(){
        this.jtUsuario.setText("");
        this.jtUsuarioID.setText("");
        this.jtClave.setText("");
        this.jcRol.setSelectedIndex(0);
    }
     
     
    public JPanel getFondo(){
        return jPanel1;
    }
    
    private void mostrarLength(String nombre, int lengthOriginal, int lengthActual){
        JOptionPane.showMessageDialog(this, "El limite de caracteres de "+ nombre +" es de "+ lengthOriginal +", usted ingresó " + lengthActual,"Limite de caracteres",JOptionPane.ERROR_MESSAGE);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<Object> jcRol;
    private javax.swing.JTextField jtClave;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JTextField jtUsuarioID;
    private javax.swing.JTable jtUsuarios;
    private javax.swing.JTextField jtbuscar;
    // End of variables declaration//GEN-END:variables
}
