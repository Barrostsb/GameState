package BDConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {
	//atributte private and static for Singleton pattern
	private static BDConnection uniqueInstance;
	
	private final String ADAPTER = "mysql";
	private final String HOST = "";
	private final String PORT = "3306";
	private final String DATABASE = "";
	private final String USERNAME = "";
	private final String PASSWORD = "";
	protected Connection connection;
	
	//private contructor for Singleton pattern
	private BDConnection() throws SQLException {
		this.connection = null;
		open();
	}
	
	//public method for Singleton pattern
	public static synchronized BDConnection getInstance(){
		if (uniqueInstance == null)
			try {
				uniqueInstance = new BDConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return uniqueInstance;
	}

	//Open connection with database
	public void open() throws SQLException {
		if (this.connection == null) {
			String connection = 
							"jdbc:" + this.ADAPTER + 	
							"://" 	+ this.HOST + 
							":" 	+ this.PORT + 
							"/" 	+ this.DATABASE;
			this.connection = DriverManager.getConnection(connection,this.USERNAME,this.PASSWORD);
		}
	}

	//Close connection with database
	public void close() throws SQLException {
		if (this.connection != null) {
			this.connection.close();
		}
	}	
}
