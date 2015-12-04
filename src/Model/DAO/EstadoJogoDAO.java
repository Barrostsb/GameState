package Model.DAO;


import Model.EstadoJogo;
import Model.Jogo;
import Model.Usuario;

public interface EstadoJogoDAO extends GenericDAO<EstadoJogo>{
	EstadoJogo read(long jogo ,long usuario);
}
