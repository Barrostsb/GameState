package DAO;

public interface GenericDAO<T> {
	T create (T entity) ;
	T read(long id);
	T update(T entity) ;
	T delete(T entity) ;
}
