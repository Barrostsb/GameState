package dao;

import model.Game;

public interface GameDao extends GenericDao<Game>{
	Game read(long idUser, long idGame, long idPhase);
}
