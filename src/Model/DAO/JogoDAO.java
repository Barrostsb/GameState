package Model.DAO;

import java.util.List;

import Model.Jogo;

public interface JogoDAO extends GenericDAO<Jogo>{
	List<Jogo> listAll();
}
