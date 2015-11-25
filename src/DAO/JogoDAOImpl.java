package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connection.BDConexao;
import Model.Jogo;

public class JogoDAOImpl implements JogoDAO {
	
	@Override
	public Jogo create(Jogo jogo) {
		Connection connection;
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
            return jogo;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
	}

	@Override
	public Jogo read(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogo update(Jogo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogo delete(Jogo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogo read(long idUser, long idGame, long idPhase) {
		// TODO Auto-generated method stub
		return null;
	}
}
