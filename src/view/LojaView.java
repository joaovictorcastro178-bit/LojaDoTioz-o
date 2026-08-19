
package view;

import dao.UsuarioLoja;
import javax.swing.JOptionPane;
import model.LojaModel;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;

public class LojaView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LojaView.class.getName());

    private Connection connection;


    public LojaView() {
        initComponents();
        leiaTable();
    }
    
    
    public void limpar() {
        jtfNome.setText("");
        jtfPlataforma.setText("");
        jtfPreco.setText("");
        
    }
    
    public void leiaTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtJogos.getModel();
        modelo.setNumRows(0);

        UsuarioLoja dao = new UsuarioLoja(connection);

        for (LojaModel usuario : dao.leitura()) {
            modelo.addRow(new Object[]{
                usuario.getIdJogo(),
                usuario.getNome(),
                usuario.getPlataforma(),
                usuario.getPreco(),
                
            });

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlPlataforma = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfPlataforma = new javax.swing.JTextField();
        jtfPreco = new javax.swing.JTextField();
        jbAtualizar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jlIDJogo = new javax.swing.JLabel();
        jtfIDJogo = new javax.swing.JTextField();
        jbSair = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtJogos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlTitulo.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jlTitulo.setText("Gerenciador de Jogos");

        jlNome.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlNome.setText("Nome:");

        jlPlataforma.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlPlataforma.setText("Plataforma:");

        jlPreco.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlPreco.setText("Preço:");

        jtfPlataforma.addActionListener(this::jtfPlataformaActionPerformed);

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(this::jbAtualizarActionPerformed);

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(this::jbCadastrarActionPerformed);

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(this::jbExcluirActionPerformed);

        jlIDJogo.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jlIDJogo.setText("ID:");

        jtfIDJogo.setEditable(false);
        jtfIDJogo.setEnabled(false);
        jtfIDJogo.setFocusable(false);
        jtfIDJogo.addActionListener(this::jtfIDJogoActionPerformed);

        jbSair.setText("Sair");
        jbSair.addActionListener(this::jbSairActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPreco))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPlataforma)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jlIDJogo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfIDJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPlataforma))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jlTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbExcluir)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jbCadastrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbAtualizar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTitulo)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPreco))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPlataforma)
                    .addComponent(jtfPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIDJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIDJogo))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbAtualizar)
                    .addComponent(jbCadastrar))
                .addGap(30, 30, 30)
                .addComponent(jbSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Plataforma", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtJogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtJogosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtJogos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPlataformaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPlataformaActionPerformed

    private void jtJogosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtJogosMouseClicked
        if (jtJogos.getSelectedRow() != -1) {

            jtfIDJogo.setText(jtJogos.getValueAt(jtJogos.getSelectedRow(), 0).toString());
            jtfNome.setText(jtJogos.getValueAt(jtJogos.getSelectedRow(), 1).toString());
            jtfPlataforma.setText(jtJogos.getValueAt(jtJogos.getSelectedRow(), 2).toString());
            jtfPreco.setText(jtJogos.getValueAt(jtJogos.getSelectedRow(), 3).toString());

        }
    }//GEN-LAST:event_jtJogosMouseClicked

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
      
        LojaModel u = new LojaModel();
        
        try {
            u.setNome(jtfNome.getText());
            u.setPlataforma(jtfPlataforma.getText());
            u.setPreco(Double.parseDouble(jtfPreco.getText()));
            
            UsuarioLoja dao = new UsuarioLoja(connection);
            dao.adicionar(u);
        } catch (Exception e) {
        }

        leiaTable();
        limpar();  
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtfIDJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIDJogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIDJogoActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        if (jtJogos.getSelectedRow() != -1) {
            LojaModel u = new LojaModel();
            u.setNome(jtfNome.getText());
            u.setPlataforma(jtfPlataforma.getText());
            u.setPreco(Double.parseDouble(jtfPreco.getText()));
            u.setIdJogo((int) jtJogos.getValueAt(jtJogos.getSelectedRow(), 0));
            UsuarioLoja dao = new UsuarioLoja(connection);
            dao.atualizar(u);
            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso");
            limpar();
            leiaTable();
        }
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if(jtJogos.getSelectedRow()!= -1){
        LojaModel u = new LojaModel();
        u.setIdJogo((int)jtJogos.getValueAt(jtJogos.getSelectedRow(), 0));
        UsuarioLoja dao = new UsuarioLoja(connection);
        dao.deletar(u);
        JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso");
        limpar();
        leiaTable();
        }else{
                JOptionPane.showMessageDialog(null, "Selecione um usuario");
                }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LojaView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlIDJogo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPlataforma;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtJogos;
    private javax.swing.JTextField jtfIDJogo;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPlataforma;
    private javax.swing.JTextField jtfPreco;
    // End of variables declaration//GEN-END:variables
}
