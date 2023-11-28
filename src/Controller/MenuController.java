package Controller;

import View.Agenda;
import View.CadastroServ;
import View.MenuPrinc;
import View.CadastroCli;
import View.CadastroFunc;
import View.Cancelamento;

public class MenuController {

        // obj da (view) MenuPrinc
    private final MenuPrinc view;
    
        // construtor acessado na view
        // A partir dele o Controller controla a view
    public MenuController(MenuPrinc view) {
              this.view = view;
    }
    
        // método para acessar a view CadastroFunc
    public void cadFuncionario() {
        CadastroFunc cadastro = new CadastroFunc();
        cadastro.setVisible(true);
        view.dispose();
    }
        // método para acessar a view CadastroCli
    public void cadCliente() {
        CadastroCli cadastro = new CadastroCli();
        cadastro.setVisible(true);
        view.dispose();
    }
        // método para acessar a view CadastroServ
    public void cadServico() {
        CadastroServ cadastro = new CadastroServ();
        cadastro.setVisible(true);
        view.dispose();
    }
        // método para acessar a view Agenda
    public void agendamento() {
        Agenda agendamento = new Agenda();
        agendamento.setVisible(true);
        view.dispose();
    }
        // método para acessar a view Cancelamento
    public void cancelamento() {
        Cancelamento cancelaAgendamento = new Cancelamento();
        cancelaAgendamento.setVisible(true);
        view.dispose();
    }
    
    
}

