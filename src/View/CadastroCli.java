package View;

import Controller.CadastroCliController;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CadastroCli extends javax.swing.JFrame {
        // obj de CadastroCliController para acessar métodos
    private final CadastroCliController controller;
    
    public CadastroCli() {
        initComponents();
        this.controller = new CadastroCliController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelBotaoVoltar = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        Complemento = new javax.swing.JLabel();
        campoComplemento = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        CEP = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        DataNascimento = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JTextField();
        labelFormatoData = new javax.swing.JLabel();
        Genero = new javax.swing.JLabel();
        campoGenero = new javax.swing.JComboBox<>();
        Email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        Nome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        labelTituloCadCliente = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(50, 50));
        setPreferredSize(new java.awt.Dimension(455, 539));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelBotaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Botão voltar Branco menor.png"))); // NOI18N
        getContentPane().add(labelBotaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -30, 250, 190));

        buttonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        buttonVoltar.setForeground(new java.awt.Color(242, 242, 242));
        buttonVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 50, 50));

        Complemento.setForeground(new java.awt.Color(255, 255, 255));
        Complemento.setText("Complemento:");
        getContentPane().add(Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        campoComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(campoComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 160, 30));

        Endereco.setForeground(new java.awt.Color(255, 255, 255));
        Endereco.setText("Endereço:");
        getContentPane().add(Endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, 30));

        CEP.setForeground(new java.awt.Color(255, 255, 255));
        CEP.setText("CEP:");
        getContentPane().add(CEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        getContentPane().add(campoCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 160, 30));

        DataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        DataNascimento.setText("Data de Nascimento: ");
        getContentPane().add(DataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));

        labelFormatoData.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        labelFormatoData.setForeground(new java.awt.Color(255, 255, 255));
        labelFormatoData.setText("(YYYY/MM/DD)");
        getContentPane().add(labelFormatoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        Genero.setForeground(new java.awt.Color(255, 255, 255));
        Genero.setText("Gênero:");
        getContentPane().add(Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Feminino" }));
        campoGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(campoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 30));

        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("E-mail:");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));
        getContentPane().add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 160, 30));

        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setText("Telefone:");
        getContentPane().add(Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        campoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 160, 30));

        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF:");
        getContentPane().add(CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        campoCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPFActionPerformed(evt);
            }
        });
        getContentPane().add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 30));

        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome Completo:");
        getContentPane().add(Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 280, -1));
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 290, 30));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 10));

        labelTituloCadCliente.setBackground(new java.awt.Color(255, 255, 255));
        labelTituloCadCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTituloCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloCadCliente.setText("Cadastro de Cliente");
        getContentPane().add(labelTituloCadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 230, 40));

        botaoCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        botaoCadastrar.setText("CADASTRAR");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 290, 50));

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/background cadastros.jpg"))); // NOI18N
        getContentPane().add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefoneActionPerformed

    private void campoCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPFActionPerformed

    private void campoGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoGeneroActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_campoGeneroActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
            // acessando método de CadastroCliController através de obj de CadastroCliController
        controller.cadastrarCliente();
            // Exibe Mensagem ao realizar cadastro
        JOptionPane.showMessageDialog(null,"Cadastro feito com sucesso.");
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void campoComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoComplementoActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
            // acessando método de CadastroCliController através de obj de CadastroCliController
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
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Complemento;
    private javax.swing.JLabel DataNascimento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextField campoCEP;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoComplemento;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JComboBox<String> campoGenero;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel labelBotaoVoltar;
    private javax.swing.JLabel labelFormatoData;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelTituloCadCliente;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

        // Getters e Setters dos JTextField's
    public JTextField getCampoCPF() {
        return campoCPF;
    }

    public void setCampoCPF(JTextField campoCPF) {
        this.campoCPF = campoCPF;
    }

    public JTextField getCampoCep() {
        return campoCEP;
    }

    public void setCampoCep(JTextField campoCep) {
        this.campoCEP = campoCep;
    }

    public JTextField getCampoComplemento() {
        return campoComplemento;
    }

    public void setCampoComplemento(JTextField campoComplemento) {
        this.campoComplemento = campoComplemento;
    }

    public JTextField getCampoDataNascimento() {
        return campoDataNascimento;
    }

    public void setCampoDataNascimento(JTextField campoDataNascimento) {
        this.campoDataNascimento = campoDataNascimento;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JTextField getCampoEndereco() {
        return campoEndereco;
    }

    public void setCampoEndereco(JTextField campoEndereco) {
        this.campoEndereco = campoEndereco;
    }

    public JComboBox<String> getCampoGenero() {
        return campoGenero;
    }

    public void setCampoGenero(JComboBox<String> campoGenero) {
        this.campoGenero = campoGenero;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JTextField getCampoTelefone() {
        return campoTelefone;
    }

    public void setCampoTelefone(JTextField campoTelefone) {
        this.campoTelefone = campoTelefone;
    }

    

}
