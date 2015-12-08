package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Model.Jogo;

public class JogoDAOImpl implements JogoDAO {
	Connection connection;
	@Override
	public boolean create(Jogo jogo) {
		
		try {
			connection = BDConexao.getInstance().open();

            PreparedStatement preparedStatement = connection.prepareStatement(
            		"INSERT INTO "
            		+ "jogo"
            		+ " (id ,nome) "
            		+ "VALUES"
            		+ " (? , ?)");
            preparedStatement.setLong(1,  jogo.getId());
            preparedStatement.setString(2,  jogo.getNome());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
	}

	@Override
	public Jogo read(long id) {
		Jogo jogo = new Jogo();
        try {
        	Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM jogo WHERE id =" + id);
            
            jogo.setId(Integer.parseInt(resultSet.getString("id")));
            jogo.setNome(resultSet.getString("nome"));
            resultSet.close();
            statement.close();
            return jogo;
                
       } catch (SQLException e) {
           e.printStackTrace();
           return null;
       }
		
	}

	@Override
	public boolean update(Jogo jogo) {
		try {
			connection = BDConexao.getInstance().open();
			Statement stmt = connection.createStatement(); 
			String sql = "UPDATE jogo"
					+ "SET nome = '" + jogo.getNome() +"'"
					+ "WHERE id = " + jogo.getId() + "';";
					 
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Jogo jogo) {
		
		try {
			connection = BDConexao.getInstance().open();
			Statement stmt = connection.createStatement(); 
			String sql = "DELETE FROM jogo WHERE id= " + jogo.getId(); 
			stmt.executeUpdate(sql);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public List<Jogo> listAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
