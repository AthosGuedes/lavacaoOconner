package Model.DAO;

import Model.Servico;
import java.sql.*;
import javax.swing.JOptionPane;

public class ServicoDAO {
        // obj do tipo Connection
    Connection conexao;
    
    
        // método para cadastrar servicos
    public int adicionarServico(Servico objServico) {
            // conecta ao banco
        conexao = new Conexao().conectaBD();
        
        try {
                // variavel com comando a ser realizado pelo banco
            String sql = "INSERT INTO Servicos (nomeServ, valorServ, descServ) VALUES\n( ?, ?, ?)";
            PreparedStatement pstm = conexao.prepareStatement(sql);

                // buscando na classe (MODEL) Servico e define os parâmetros na consulta SQL.
            pstm.setString(1, objServico.getNome()); 
            pstm.setString(2, objServico.getValor());
            pstm.setString(3,objServico.getDescricao());
                // executa
            return pstm.executeUpdate();


        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }
        
        
    }
    
    
    
}
