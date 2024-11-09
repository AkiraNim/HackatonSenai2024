
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDAO {
    public Connection connectDB(){
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/db_blacklist?user=root";
			
			conn = DriverManager.getConnection(url);
			JOptionPane.showMessageDialog(null, "Conexão estabelicida");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return conn;
		
	}
}
