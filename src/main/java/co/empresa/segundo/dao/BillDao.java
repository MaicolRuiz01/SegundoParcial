package co.empresa.segundo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.empresa.segundo.model.Bill;
import co.empresa.segundo.model.Usuario;
import co.empresa.segundo.util.Conexion;


public class BillDao {
	
	private Conexion conexion;
	private static final String INSERT_BILL_SQL = "INSERT INTO bill (date_bill, user_id, value, type) VALUES (?,?,?,?);";
    private static final String DELETE_BILL_SQL = "DELETE FROM bill WHERE id = ?;";
    private static final String SELECT_BILL_BY_ID = "SELECT * FROM bill WHERE id=?;";
    private static final String SELECT_ALL_BILLS = "SELECT * FROM bill;";
    
    
	public BillDao() {
		
		this.conexion = Conexion.getConexion();
	}
	
	public void insert(Bill bill) throws SQLException{
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(INSERT_BILL_SQL);
			java.util.Date utilDate = bill.getDate_bill();
	        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	        
	        preparedStatement.setDate(1, sqlDate);
			preparedStatement.setInt(2, bill.getUserId());
			preparedStatement.setInt(3, bill.getValue());
			preparedStatement.setInt(4, bill.getType());
			conexion.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	public void delete(int id) throws SQLException{
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(DELETE_BILL_SQL);
			preparedStatement.setInt(1, id);
			conexion.execute();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
public List<Bill> selectAll()throws SQLException{
		
		List <Bill> bills = new ArrayList<>();
		
		try {
			PreparedStatement preparedStatement = (PreparedStatement) conexion.setPreparedStatement(SELECT_ALL_BILLS);
			ResultSet rs = conexion.query();
			
			while (rs.next()) {
				int id= rs.getInt("id");
				java.sql.Date dateSQL = rs.getDate("date"); // Obtiene la fecha como java.sql.Date
				java.util.Date date = null;

				if (dateSQL != null) {
				    date = new java.util.Date(dateSQL.getTime()); // Convierte java.sql.Date a java.util.Date
				}
				int userid = rs.getInt("userid");
				int valor = rs.getInt("valor");
				int type = rs.getInt("type");
				bills.add(new Bill (id, date, userid, valor, type));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		return bills;
	}
	
	
    
    

}
