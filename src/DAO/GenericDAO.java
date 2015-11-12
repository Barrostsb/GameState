package DAO;

public interface GenericDAO<T> {
	T create () ;
	T read(T entity);
	T update(T entity) ;
	T delete(T entity) ;
}
