package DAO;

public interface GenericDAO<T> {
	boolean create (T entity) ;
	T read(long id);
	boolean update(T entity) ;
	boolean delete(T entity) ;
}
