package ServicoPlataforma;

import java.util.List;

import Model.Usuario;

public interface IControladorUsuario {
	List<Usuario> get();
	Usuario post(String json);
	Usuario put(long id, String json);
	boolean delete(long id);
}
