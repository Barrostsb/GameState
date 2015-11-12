package DAO;

import Model.Jogo;

public interface JogoDAO extends GenericDAO<Jogo>{
	Jogo read(long idUser, long idGame, long idPhase);
}
