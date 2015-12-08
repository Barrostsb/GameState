package Controller;

import java.util.List;

import com.google.gson.Gson;

import Model.EstadoJogo;
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
		Usuario usu = verificarDados(json);
		usu.salvar(usu);
		return usu;
	}

	@Override
	public Usuario put(long id, String json) {
		Usuario usu = verificarDados(json);
		usu.salvar(usu);
		return usu;
	}

	@Override
	public boolean delete(long id) {
		Usuario usu = new Usuario();
		return usu.excluir(id);
	}
	
	public Usuario verificarDados(String json) {
		//instancia um objeto da classe Gson	    	
		Gson gson = new Gson();
		Usuario usuario = gson.fromJson(json, Usuario.class);
		return usuario;
	}

}
