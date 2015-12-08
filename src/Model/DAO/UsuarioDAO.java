package Model.DAO;

import java.util.List;

import Model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	List<Usuario> listAll();
}
