package DAO;

import java.util.List;

import Model.Historico;

public interface HistoricoDAO extends GenericDAO<Historico>{
	List<Historico> listAll();
	List<Historico> listAllByUser();
}
