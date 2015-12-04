package Model.DAO;

import java.util.List;

import Model.TempoJogo;
import Model.Usuario;

public interface TempoJogoDAO extends GenericDAO<TempoJogo>{
	List<TempoJogo> listAll();
	List<TempoJogo> listAllByUser(long user);
}
