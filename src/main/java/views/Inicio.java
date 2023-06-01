/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.mycompany.dejep.models.Funcionario;
import com.mycompany.dejep.models.Turno;
import com.mycompany.dejep.models.utils.ComboItem;
import com.mycompany.dejep.models.utils.EntityUtils;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author titib
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        funcionario_id_cbx = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        funcionario_nome_txt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        funcionario_rg_txt = new javax.swing.JFormattedTextField();
        funcionario_turno_cbx = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btn_add_funcionario = new javax.swing.JButton();
        btn_edit_funcionario = new javax.swing.JButton();
        btn_delete_funcionario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        funcionarios_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_add_turno = new javax.swing.JButton();
        btn_edit_turnos = new javax.swing.JButton();
        btn_delete_turno = new javax.swing.JButton();
        turno_id_cbx = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        turno_nome_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        turnos_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio de Escalas para DEJEP");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Escalas"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Escalas", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Funcionários"));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        funcionario_id_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionario_id_cbxActionPerformed(evt);
            }
        });

        jLabel3.setText("ID:");

        jLabel4.setText("Nome:");

        jLabel5.setText("RG:");

        try {
            funcionario_rg_txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA.AAA.AAA-AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Turno:");

        btn_add_funcionario.setText("Adicionar");
        btn_add_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_funcionarioActionPerformed(evt);
            }
        });

        btn_edit_funcionario.setText("Atualizar");
        btn_edit_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_funcionarioActionPerformed(evt);
            }
        });

        btn_delete_funcionario.setText("Deletar");
        btn_delete_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_funcionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcionario_id_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcionario_nome_txt))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcionario_rg_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcionario_turno_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add_funcionario)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit_funcionario)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete_funcionario)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcionario_id_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(funcionario_nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_delete_funcionario)
                        .addComponent(btn_edit_funcionario))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(funcionario_rg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(funcionario_turno_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(btn_add_funcionario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        funcionarios_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "RG", "Turno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(funcionarios_table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Funcionários", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Férias"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Férias", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Turnos"));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_add_turno.setText("Adicionar");
        btn_add_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_turnoActionPerformed(evt);
            }
        });

        btn_edit_turnos.setText("Atualizar");
        btn_edit_turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_turnosActionPerformed(evt);
            }
        });

        btn_delete_turno.setText("Deletar");
        btn_delete_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_turnoActionPerformed(evt);
            }
        });

        turno_id_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turno_id_cbxActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turno_id_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turno_nome_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_add_turno)
                .addGap(18, 18, 18)
                .addComponent(btn_edit_turnos)
                .addGap(18, 18, 18)
                .addComponent(btn_delete_turno)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_delete_turno)
                        .addComponent(btn_edit_turnos))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(turno_id_cbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(turno_nome_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(btn_add_turno)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        turnos_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(turnos_table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Turnos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_turnoActionPerformed
        if (turno_nome_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo \"nome\" está vazio.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Turno turno = new Turno();
        turno.setNome(turno_nome_txt.getText());

        try {
            EntityUtils.insert(turno);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Houve um erro ao tentar adicionar um novo turno.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(this, "Turno adicionado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        this.updateTurnosComponentsData();
    }//GEN-LAST:event_btn_add_turnoActionPerformed

    private void btn_edit_turnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_turnosActionPerformed
        if (turno_nome_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo \"nome\" está vazio.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int turno_id = Integer.parseInt(turno_id_cbx.getSelectedItem().toString());

        String novo_nome = turno_nome_txt.getText();

        Turno turno = EntityUtils.find(Turno.class, turno_id);

        if (novo_nome.equals(turno.getNome())) {
            JOptionPane.showMessageDialog(this, "O nome do registro já é esse!", "Ok", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        turno.setNome(novo_nome);

        try {
            EntityUtils.update(turno);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Houve um erro ao tentar editar o turno: " + turno.getNome(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(this, "Turno atualizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        this.updateTurnosComponentsData();
    }//GEN-LAST:event_btn_edit_turnosActionPerformed

    private void turno_id_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turno_id_cbxActionPerformed
        try {
            int turno_id = Integer.parseInt(turno_id_cbx.getSelectedItem().toString());

            Turno turno = EntityUtils.find(Turno.class, turno_id);

            turno_nome_txt.setText(turno.getNome());
        } catch (Exception e) {
            turno_nome_txt.setText("");
        }
    }//GEN-LAST:event_turno_id_cbxActionPerformed

    private void btn_delete_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_turnoActionPerformed
        int res = JOptionPane.showOptionDialog(null,
                "Você tem certeza que deseja excluir o turno: " + turno_nome_txt.getText() + "?",
                "Excluir Turno",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Sim", "Não"},
                "Não");

        if (res != JOptionPane.YES_OPTION) {
            return;
        }

        int turno_id = Integer.parseInt(turno_id_cbx.getSelectedItem().toString());

        Turno turno = EntityUtils.find(Turno.class, turno_id);

        try {
            EntityUtils.delete(turno);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Houve um erro ao tentar deletar o turno: " + turno.getNome(), "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Turno removido com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        this.updateTurnosComponentsData();
    }//GEN-LAST:event_btn_delete_turnoActionPerformed

    private void btn_add_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_funcionarioActionPerformed
        if (funcionario_nome_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo \"Nome\" está vazio.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (funcionario_rg_txt.getValue() == null) {
            JOptionPane.showMessageDialog(this, "O campo \"RG\" está vazio.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(funcionario_nome_txt.getText());
        funcionario.setRg(funcionario_rg_txt.getValue().toString());

        Object item = funcionario_turno_cbx.getSelectedItem();
        Integer turno_id = Integer.parseInt(((ComboItem) item).getValue());
        Turno turno = EntityUtils.find(Turno.class, turno_id);
        funcionario.setTurno(turno);

        try {
            EntityUtils.insert(funcionario);
        } catch (SQLIntegrityConstraintViolationException e) { //TODO: Tratamento de duplicate entry
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Já existe um funcionário com o RG: '" + funcionario.getRg() + "'", "Ops!", JOptionPane.WARNING_MESSAGE);
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Houve um erro ao tentar inserir o funcionário. Tente novamente mais tarde.", "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.updateFuncionariosComponentsData();

        JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_add_funcionarioActionPerformed

    private void btn_edit_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_funcionarioActionPerformed
        if (funcionario_nome_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo \"Nome\" está vazio.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (funcionario_rg_txt.getValue() == null) {
            JOptionPane.showMessageDialog(this, "O campo \"RG\" está vazio.", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String novo_nome = funcionario_nome_txt.getText();
        String novo_rg = funcionario_rg_txt.getText();
        Object item = funcionario_turno_cbx.getSelectedItem();
        Integer turno_id = Integer.parseInt(((ComboItem) item).getValue());

        int funcionario_id = Integer.parseInt(funcionario_id_cbx.getSelectedItem().toString());
        Funcionario funcionario = EntityUtils.find(Funcionario.class, funcionario_id);

        if (novo_nome.equals(funcionario.getNome()) && novo_rg.equals(funcionario.getRg()) && turno_id == funcionario.getTurno().getId()) {
            JOptionPane.showMessageDialog(this, "O registro já está atualizado!", "Ok", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Turno novo_turno = EntityUtils.find(Turno.class, turno_id);

        funcionario.setNome(novo_nome);
        funcionario.setRg(novo_rg);
        funcionario.setTurno(novo_turno);

        try {
            EntityUtils.update(funcionario);
        } catch (Exception e) { //TODO: Tratamento de duplicate entry
            JOptionPane.showMessageDialog(this, "Houve um erro ao tentar editar o funcionario: " + funcionario.getNome(), "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        this.updateFuncionariosComponentsData();

        JOptionPane.showMessageDialog(this, "Funcionário atualizado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btn_edit_funcionarioActionPerformed

    private void btn_delete_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_funcionarioActionPerformed
        int btt = JOptionPane.showOptionDialog(null,
                "Você tem certeza que deseja excluir o funcionário: '" + funcionario_nome_txt.getText() + "'?",
                "Excluir Funcionário",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Sim", "Não"},
                "Não");

        if (btt != JOptionPane.YES_OPTION) {
            return;
        }
        int funcionario_id = Integer.parseInt(funcionario_id_cbx.getSelectedItem().toString());

        Funcionario funcionario = EntityUtils.find(Funcionario.class, funcionario_id);

        try {
            EntityUtils.delete(funcionario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Houve um erro ao tentar deletar o funcionário: " + funcionario.getNome(), "Erro!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Funcionário deletado com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        this.updateFuncionariosComponentsData();
    }//GEN-LAST:event_btn_delete_funcionarioActionPerformed

    private void funcionario_id_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionario_id_cbxActionPerformed
        try {
            int funcionario_id = Integer.parseInt(funcionario_id_cbx.getSelectedItem().toString());

            Funcionario funcionario = EntityUtils.find(Funcionario.class, funcionario_id);

            funcionario_nome_txt.setText(funcionario.getNome());
            funcionario_rg_txt.setValue(funcionario.getRg());
            funcionario_turno_cbx.getModel().setSelectedItem(new ComboItem(funcionario.getTurno().getNome(), funcionario.getTurno().getId().toString()));
        } catch (Exception e) {
            funcionario_nome_txt.setText("");
            funcionario_rg_txt.setValue("");
        }
    }//GEN-LAST:event_funcionario_id_cbxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    Inicio inicio = new Inicio();

                    inicio.updateTurnosComponentsData();
                    inicio.updateFuncionariosComponentsData();

                    inicio.setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTurnosComponentsData() {
        funcionario_turno_cbx.removeAllItems();

        turno_id_cbx.removeAllItems();

        DefaultTableModel model = (DefaultTableModel) turnos_table.getModel();
        model.setRowCount(0);

        List<Turno> turnos = EntityUtils.select("SELECT t FROM Turno t ORDER BY id DESC", Turno.class);

        for (Turno turno : turnos) {
            funcionario_turno_cbx.addItem(new ComboItem(turno.getNome(), turno.getId().toString()));
            turno_id_cbx.addItem(turno.getId().toString());
            model.addRow(new Object[]{turno.getId(), turno.getNome()});
        }
    }

    public void updateFuncionariosComponentsData() {
        List<Funcionario> funcionarios = EntityUtils.select("SELECT t FROM Funcionario t ORDER BY id ASC", Funcionario.class);
        DefaultTableModel model = (DefaultTableModel) funcionarios_table.getModel();
        model.setRowCount(0);

        funcionario_id_cbx.removeAllItems();

        for (Funcionario funcionario : funcionarios) {
            funcionario_id_cbx.addItem(funcionario.getId().toString());
            model.addRow(new Object[]{funcionario.getId(), funcionario.getNome(), funcionario.getRg(), funcionario.getTurno().getNome()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_funcionario;
    private javax.swing.JButton btn_add_turno;
    private javax.swing.JButton btn_delete_funcionario;
    private javax.swing.JButton btn_delete_turno;
    private javax.swing.JButton btn_edit_funcionario;
    private javax.swing.JButton btn_edit_turnos;
    private javax.swing.JComboBox<String> funcionario_id_cbx;
    private javax.swing.JTextField funcionario_nome_txt;
    private javax.swing.JFormattedTextField funcionario_rg_txt;
    private javax.swing.JComboBox<ComboItem> funcionario_turno_cbx;
    private javax.swing.JTable funcionarios_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> turno_id_cbx;
    private javax.swing.JTextField turno_nome_txt;
    private javax.swing.JTable turnos_table;
    // End of variables declaration//GEN-END:variables
}
