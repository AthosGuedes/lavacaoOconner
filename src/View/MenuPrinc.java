package View;

import Controller.MenuController;

public class MenuPrinc extends javax.swing.JFrame {
        // obj de MenuController para acessar métodos
    private final MenuController controller;
    
    public MenuPrinc() {
        initComponents();
        controller = new MenuController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAgendamento = new javax.swing.JToggleButton();
        buttonCadServiço = new javax.swing.JToggleButton();
        buttonCadFuncionario = new javax.swing.JToggleButton();
        buttonCancelamento = new javax.swing.JToggleButton();
        buttonCadCliente = new javax.swing.JToggleButton();
        teladefundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAgendamento.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonAgendamento.setText("Agendamento");
        buttonAgendamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 260, 60));

        buttonCadServiço.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonCadServiço.setText("Cadastro de Serviço");
        buttonCadServiço.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCadServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadServiçoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadServiço, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 260, 60));

        buttonCadFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonCadFuncionario.setText("Cadastro de Funcionário");
        buttonCadFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 260, 60));

        buttonCancelamento.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonCancelamento.setText("Cancelamento de serviço");
        buttonCancelamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCancelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelamentoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCancelamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 260, 60));

        buttonCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        buttonCadCliente.setText("Cadastro de Cliente");
        buttonCadCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadClienteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 260, 60));

        teladefundo.setBackground(new java.awt.Color(0, 0, 0));
        teladefundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Backgorund MenuPrincipal.jpg"))); // NOI18N
        teladefundo.setMaximumSize(new java.awt.Dimension(3000, 1500));
        getContentPane().add(teladefundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1540, 1080));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendamentoActionPerformed
            // acessando método de MenuController através de obj de MenuController
        controller.agendamento();
    }//GEN-LAST:event_buttonAgendamentoActionPerformed

    private void buttonCadServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadServiçoActionPerformed
            // acessando método de MenuController através de obj de MenuController
        controller.cadServico();
    }//GEN-LAST:event_buttonCadServiçoActionPerformed

    private void buttonCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadFuncionarioActionPerformed
            // acessando método de MenuController através de obj de MenuController
        controller.cadFuncionario();
    }//GEN-LAST:event_buttonCadFuncionarioActionPerformed

    private void buttonCancelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelamentoActionPerformed
            // acessando método de MenuController através de obj de MenuController
        controller.cancelamento();
    }//GEN-LAST:event_buttonCancelamentoActionPerformed

    private void buttonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadClienteActionPerformed
            // acessando método de MenuController através de obj de MenuController
        controller.cadCliente();
    }//GEN-LAST:event_buttonCadClienteActionPerformed

    public static void main(String args[]) {
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrinc().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonAgendamento;
    private javax.swing.JToggleButton buttonCadCliente;
    private javax.swing.JToggleButton buttonCadFuncionario;
    private javax.swing.JToggleButton buttonCadServiço;
    private javax.swing.JToggleButton buttonCancelamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel teladefundo;
    // End of variables declaration//GEN-END:variables
}
