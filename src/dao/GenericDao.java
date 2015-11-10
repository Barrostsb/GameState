package dao;

public interface GenericDao<T> {
	T create () ;
	T read(T entity);
	T update(T entity) ;
	T delete(T entity) ;
}
