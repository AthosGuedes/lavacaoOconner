package View;

import Controller.CadastroServController;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CadastroServ extends javax.swing.JFrame {
        // obj de CadastroServController para acessar métodos
    private final CadastroServController controller;

    public CadastroServ() {
        initComponents();   
        this.controller = new CadastroServController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBotaoVoltar = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        labelTituloCadServ = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        Servico = new javax.swing.JLabel();
        campoServico = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        Descricao = new javax.swing.JLabel();
        scrollCampoDescricao = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(465, 449));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Botão voltar Branco menor.png"))); // NOI18N
        getContentPane().add(labelBotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, -60, -1, -1));

        buttonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        buttonVoltar.setForeground(new java.awt.Color(242, 242, 242));
        buttonVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 50, 50));

        botaoCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 290, 50));

        labelTituloCadServ.setBackground(new java.awt.Color(255, 255, 255));
        labelTituloCadServ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTituloCadServ.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloCadServ.setText("Cadastro de Serviço");
        getContentPane().add(labelTituloCadServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 230, 40));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 10));

        Servico.setForeground(new java.awt.Color(255, 255, 255));
        Servico.setText("Serviço:");
        getContentPane().add(Servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 10));
        getContentPane().add(campoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 180, 30));

        Valor.setForeground(new java.awt.Color(255, 255, 255));
        Valor.setText("Valor:");
        getContentPane().add(Valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 30));

        Descricao.setForeground(new java.awt.Color(255, 255, 255));
        Descricao.setText("Descrição:");
        getContentPane().add(Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, -1));

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        scrollCampoDescricao.setViewportView(campoDescricao);

        getContentPane().add(scrollCampoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 390, 110));

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/background cadastros.jpg"))); // NOI18N
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
            // acessando método de CadastroServController através de obj de CadastroServController
        controller.cadastrarServico();
            // Exibe mensagem de cadastro realizado
        JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso.");
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
            // acessando método de CadastroServController através de obj de CadastroServController
        controller.voltarMenuPrinc();
    }//GEN-LAST:event_buttonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroServ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descricao;
    private javax.swing.JLabel Servico;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoServico;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel labelBotaoVoltar;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelTituloCadServ;
    private javax.swing.JScrollPane scrollCampoDescricao;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

        // Getters e Setters dos JTextField's
    public JTextArea getCampoDescricao() {
        return campoDescricao;
    }

    public void setCampoDescricao(JTextArea campoDescricao) {
        this.campoDescricao = campoDescricao;
    }

    public JTextField getCampoServico() {
        return campoServico;
    }

    public void setCampoServico(JTextField campoServico) {
        this.campoServico = campoServico;
    }

    public JTextField getCampoValor() {
        return campoValor;
    }

    public void setCampoValor(JTextField campoValor) {
        this.campoValor = campoValor;
    }


    
}
