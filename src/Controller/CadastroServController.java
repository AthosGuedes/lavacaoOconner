package Controller;

import Model.DAO.ServicoDAO;
import Model.Servico;
import View.CadastroServ;
import View.MenuPrinc;

public class CadastroServController {
        // obj da (view) CadastroServ
    private final CadastroServ view;
    
        // construtor acessado na view
        // A partir dele o Controller controla a view
    public CadastroServController(CadastroServ view) {
        this.view = view;
    }

        // método para cadastrar serviço
    public void cadastrarServico(){
        
            // Armazena em variaveis locais o que é escrito nos JTextField's
        String nome_serv, valor_serv, descricao_serv;        
        nome_serv = view.getCampoServico().getText();
        valor_serv = view.getCampoValor().getText();
        descricao_serv = view.getCampoDescricao().getText();
        
            // Cria um objeto de Servico que recebe informações digitadas na view.
        Servico servico = new Servico(nome_serv, descricao_serv, valor_serv);
        servico.setNome(nome_serv);
        servico.setValor(valor_serv);
        servico.setDescricao(descricao_serv);
        
            // realiza método de adicionar servico com informações de obj de Servico (servico)
        ServicoDAO objServicoDAO = new ServicoDAO();
        objServicoDAO.adicionarServico(servico);

    }
    
        // método que fecha a view de CadastroServ e direciona a view de MenuPrinc
    public void voltarMenuPrinc(){
        MenuPrinc objFrmPrincpalView = new MenuPrinc();
        objFrmPrincpalView.setVisible(true);
        view.dispose();
    }
    
    
    
}
