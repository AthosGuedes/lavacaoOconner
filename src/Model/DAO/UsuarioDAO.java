package Model.DAO;

import Model.Funcionario;
import java.sql.*; 
import javax.swing.JOptionPane;

public class UsuarioDAO {
    Connection conexao; 

    
        // método para fazer autenticação de usuário
    public ResultSet autenticaUsuario(Funcionario objUsuario) {
            // conecta ao banco
        conexao = new Conexao().conectaBD();

        try {
                // variavel com comando a ser realizado pelo banco
            String sql = "select * from Funcionarios where emailFunc = ? and passFunc = ?"; 
            PreparedStatement pstm = conexao.prepareStatement(sql); 

                // buscando na classe (MODEL) funcionario e define os parâmetros na consulta SQL.
            pstm.setString(1, objUsuario.getEmail()); 
            pstm.setString(2, objUsuario.getSenha()); 
                //executa
            ResultSet rs = pstm.executeQuery();

            return rs; 

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);

            return null;
        }
    }
        // método para cadastrar funcionarios
    public int adicionarFuncionario(Funcionario objFuncionario) {
        // conecta ao banco
        conexao = new Conexao().conectaBD();
        
        try {
                // variavel com comando a ser realizado pelo banco
            String sql = "INSERT INTO Funcionarios (nomeFunc, sexoFunc, dataNascFunc, cpfFunc, telefoneFunc, emailFunc, cepFunc, enderecoFunc, complementoFunc, passFunc, nivelAcessoFunc) VALUES\n( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);
          
                // buscando na classe (MODEL) funcionario e define os parâmetros na consulta SQL.
            pstm.setString(1, objFuncionario.getNome()); 
            pstm.setString(2, objFuncionario.getSexo());
            pstm.setString(3, objFuncionario.getDataNascimento());
            pstm.setString(4, objFuncionario.getCpf());
            pstm.setString(5, objFuncionario.getTelefone());
            pstm.setString(6, objFuncionario.getEmail());
            pstm.setString(7, objFuncionario.getCep());
            pstm.setString(8, objFuncionario.getEndereco());
            pstm.setString(9, objFuncionario.getComplemento());
            pstm.setString(10, objFuncionario.getSenha());
            pstm.setString(11, objFuncionario.getNivelAcesso());
                //executa
            return pstm.executeUpdate();


        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }
        
        
    }
}
