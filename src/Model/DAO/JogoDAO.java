package Model.DAO;

import Model.Jogo;

public interface JogoDAO extends GenericDAO<Jogo>{
	Jogo readAll();
}
