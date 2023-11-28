package Controller;

import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import View.MenuPrinc;


public class AgendaController {
    
        // obj da (view) Agenda
    private final Agenda view;

        // construtor acessado na view
        // A partir dele o Controller controla a view
    public AgendaController(Agenda view) {
        this.view = view;
    }
    
        // método de fazer agendamento
    public void fazerAgendamento(){
        
            // Armazena em variaveis locais o que é escrito nos JTextField's
        String nomeCliente_agenda, nomeServico_agenda, valorServico_agenda, data_agenda, hora_agenda, obs_agenda;
        nomeCliente_agenda = view.getCampoNomeCliente().getText();
        nomeServico_agenda = view.getCampoNomeServico().getText();
        valorServico_agenda = view.getCampoValor().getText();
        data_agenda = view.getCampoData().getText();
        hora_agenda = view.getCampoHora().getText();
        obs_agenda = view.getCampoObservacao().getText();

            // Cria um objeto de Agendamento que recebe informações digitadas na view.
        Agendamento agenda = new Agendamento(nomeCliente_agenda, nomeServico_agenda, valorServico_agenda, data_agenda, hora_agenda, obs_agenda);
        agenda.setNome_cliente(nomeCliente_agenda);
        agenda.setNome_servico(nomeServico_agenda);
        agenda.setValor(valorServico_agenda);
        agenda.setData(data_agenda);
        agenda.setHora(hora_agenda);
        agenda.setObservacao(obs_agenda);
            // realiza método de fazer agendamento com informações de obj de Agendamento (agenda)
        AgendamentoDAO objAgendaDAO = new AgendamentoDAO();
        objAgendaDAO.adicionarAgendamento(agenda);
        
    }
        // método que fecha a view de Agendamento e direciona a view de MenuPrinc
    public void voltarMenuPrinc(){
        MenuPrinc objFrmPrincpalView = new MenuPrinc();
        objFrmPrincpalView.setVisible(true);
        view.dispose();
    }
    
    
          
}
