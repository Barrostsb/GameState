package DAO;


import Model.EstadoJogo;
import Model.Jogo;
import Model.Usuario;

public interface EstadoJogoDAO extends GenericDAO<EstadoJogo>{
	EstadoJogo read(Jogo jogo ,Usuario usuario);
}
