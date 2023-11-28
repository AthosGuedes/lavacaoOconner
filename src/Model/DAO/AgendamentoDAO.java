package Model.DAO;

import DTO.AgendamentoDTO;
import Model.Agendamento;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AgendamentoDAO {
    
        // objetos para servem acessados de toda a classe
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<AgendamentoDTO> lista = new ArrayList<>();
    
        // método que faz agendamento
    public int adicionarAgendamento(Agendamento objAgendamento) {
            // conecta ao banco
        conexao = new Conexao().conectaBD();
        
        try {
                // variavel com comando a ser realizado pelo banco
            String sql = "INSERT INTO Agendamentos (nomeClient, servico, valor, data, hora, obs) VALUES\n(?, ?, ?, ?, ?, ?)";
            pstm = conexao.prepareStatement(sql);

                // buscando na classe (MODEL) Agendamento e define os parâmetros na consulta SQL.
            pstm.setString(1, objAgendamento.getNome_cliente()); 
            pstm.setString(2, objAgendamento.getNome_servico());
            pstm.setString(3, objAgendamento.getValor());
            pstm.setString(4, objAgendamento.getData());
            pstm.setString(5, objAgendamento.getHora());
            pstm.setString(6, objAgendamento.getObservacao());
                // executa
            return pstm.executeUpdate();

            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
            return 0;
        }
        
        
    }
        // método que preenche tabela na view Agendamento
    public ArrayList<AgendamentoDTO> PesquisarAgendamento(){
            // variavel com comando a ser realizado pelo banco
        String sql = "Select * from agendamentos";
            // conecta ao banco
        conexao = new Conexao().conectaBD();
        
        try {
            
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();   // executa comando no banco
            
            while (rs.next()){
                    // obj de AgendamentoDTO armazena informações puxadas do banco
                AgendamentoDTO objAgendamentoDTO = new AgendamentoDTO();
                objAgendamentoDTO.setID(rs.getInt("ID"));
                objAgendamentoDTO.setNomeClient(rs.getString("nomeClient"));
                objAgendamentoDTO.setServico(rs.getString("servico"));
                objAgendamentoDTO.setValor(rs.getString("valor"));
                objAgendamentoDTO.setData(rs.getString("data"));
                objAgendamentoDTO.setHora(rs.getString("hora"));
                objAgendamentoDTO.setObs(rs.getString("obs"));
                    // adiociona a uma arrayList as infomações contida no obj de AgendamentoDTO
                lista.add(objAgendamentoDTO);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return lista;
    }
    
        // método que faz cancelamento do agendamento
    public int FazerCancelamentoAgendamento(Agendamento objAgendamento){
            // conecta ao banco
        conexao = new Conexao().conectaBD();
        
        try {
                // variavel com comando a ser realizado pelo banco
            String sql = "delete from agendamentos where ID = ? ";
            pstm = conexao.prepareStatement(sql);
                // buscando na classe (MODEL) Agendamento e define os parâmetros na consulta SQL.
            pstm.setInt(1, objAgendamento.getId()); 
                // executa
            return pstm.executeUpdate();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "agendamentoDAO "+erro);
            return 0;
        }      
    }
    
    
    
    
}
