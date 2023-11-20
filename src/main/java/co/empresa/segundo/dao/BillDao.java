package co.empresa.segundo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.empresa.segundo.model.Bill;
import co.empresa.segundo.model.Usuario;
import co.empresa.segundo.util.Conexion;

public class BillDao {
	
	private Conexion conexion;
	private static final String INSERT_BILL_SQL = "INSERT INTO bill (date_bill, user_id, value, type) VALUES (?,?,?,?);";
    private static final String DELETE_BILL_SQL = "DELETE FROM bill WHERE id = ?;";
    private static final String SELECT_BILL_BY_ID = "SELECT * FROM bill WHERE id=?;";
    private static final String SELECT_ALL_BILLS = "SELECT * FROM bill;";
    
    
	public BillDao(Conexion conexion) {
		
		this.conexion = conexion;
	}
	
	public void insert(Bill bill) throws SQLException{
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(INSERT_BILL_SQL);
			preparedStatement.setString(1, usuario.getUsername());
			preparedStatement.setString(2, usuario.getPass());
			preparedStatement.setString(3, usuario.getEmail());
			conexion.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
    
    

}
