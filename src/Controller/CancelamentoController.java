package Controller;

import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Cancelamento;
import View.MenuPrinc;

public class CancelamentoController {
        // obj da (view) Cancelamento
    private final Cancelamento view;

        // construtor acessado na view
        // A partir dele o Controller controla a view
    public CancelamentoController(Cancelamento view) {
        this.view = view;
    }
    
        // médoto para fazer cancelamento
    public void CancelarAgendamento(){
        
        int ID;
        String id;
            // Armazena em variavel local o que é escrito nos JTextField's
        id = view.getCampoId().getText();
        ID = Integer.parseInt(id);
        
            // Cria um objeto de Agendamento que recebe informações digitadas na view.
        Agendamento objAgenda = new Agendamento(ID);
        objAgenda.setId(ID);
        
            // realiza método de fazer cancelamento com informações de obj de Agendamento (objAgenda)
        AgendamentoDAO objAgendamentoDAO = new AgendamentoDAO();
        objAgendamentoDAO.FazerCancelamentoAgendamento(objAgenda);
        
    }
    
        // método que fecha a view de Cancelamento e direciona a view de MenuPrinc
    public void voltarMenuPrinc(){
        MenuPrinc objFrmPrincpalView = new MenuPrinc();
        objFrmPrincpalView.setVisible(true);
        view.dispose();
    }
}
    
   
