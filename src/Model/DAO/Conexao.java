package Model.DAO;

import java.sql.Connection;
import javax.swing.JOptionPane; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class Conexao {

    public Connection conectaBD() {

            // Cria obj do tipo Connection
        Connection conector = null;

        try {
                // variavel(url) com informações para acessar banco.
            String url = "jdbc:mysql://localhost:3306/lavacaooconner?user=root&password=" ;

                // acessa banco
            conector = DriverManager.getConnection(url);


        } catch (SQLException erro) {


            JOptionPane.showMessageDialog(null, erro.getMessage());


        }

        return conector;

    }
}

