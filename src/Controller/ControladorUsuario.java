package Controller;

import java.util.List;

import com.google.gson.Gson;

import Model.Jogo;
import Model.Usuario;
import ServicoPlataforma.IControladorUsuario;

class ControladorUsuario implements IControladorUsuario{

	@Override
	public List<Usuario> get() {
		Usuario usuario = new Usuario();
		List<Usuario> lista = usuario.buscarUsuarios();
		return lista;
	}

	@Override
	public Usuario post(String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario put(long id, String json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Usuario verificarDados(String json) {
		//instancia um objeto da classe Gson	    	
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(json, Usuario.class);
		return usuario;
	}

}
