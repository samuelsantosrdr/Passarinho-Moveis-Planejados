package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost/PassarinhoMoveisPlanejados?user=root&password=5940321";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoBD" + e.getMessage());
        }
        return conn;
        }
}
