package DAO;

import java.util.List;

import Model.Historico;
import Model.Usuario;

public interface HistoricoDAO extends GenericDAO<Historico>{
	List<Historico> listAll();
	List<Historico> listAllByUser(Usuario user);
}
