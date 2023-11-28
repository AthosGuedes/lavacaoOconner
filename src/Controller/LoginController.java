package Controller;

import java.sql.*;
import View.MenuPrinc;
import View.Login;
import Model.DAO.UsuarioDAO;
import Model.Funcionario;
import javax.swing.JOptionPane;

public class LoginController {

        // obj da (view) Login
    private final Login view;

        // construtor acessado na view
        // A partir dele o Controller controla a view
    public LoginController(Login view) {
        this.view = view;
    }

        // método de fazer login
    public void entraNoSistema() {

        try {
            // Armazena em variaveis locais o que é escrito nos JTextField's
            String usuario_nome, senha_usuario;
            usuario_nome = view.getCampologin1().getText();
            senha_usuario = view.getCamposenha().getText();

            // Cria um objeto de Funcionario com as informações, usuário e senha, digitadas na view.
            Funcionario pessoa = new Funcionario(usuario_nome, senha_usuario);
            pessoa.setEmail(usuario_nome);
            pessoa.setSenha(senha_usuario);

            // Cria um objeto de UsuarioDAO para poder acessar métodos de UsuarioDAO.
            UsuarioDAO objUsuarioDao = new UsuarioDAO();
            // realiza método de autenticação de usuário com informações de obj de Funcionario (pessoa)
            ResultSet rsUsuarioDAO = objUsuarioDao.autenticaUsuario(pessoa);

            if (rsUsuarioDAO.next()) {
                // Se houver um resultado na consulta, redireciona para a próxima tela(MenuPrinc).
                MenuPrinc objFrmPrincpalView = new MenuPrinc();
                objFrmPrincpalView.setVisible(true);
                view.dispose();
               
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha Incorretos!"); // Exibe uma mensagem de erro.
            }
             
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro); // Trata exceções do banco de dados e exibe mensagens de erro.
        }
       
    }
}
