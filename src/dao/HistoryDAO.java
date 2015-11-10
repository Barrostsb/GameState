package dao;

import java.util.List;

import model.History;

public interface HistoryDAO extends GenericDao<History>{
	List<History> listAll();
	List<History> listAllByUser();
}
