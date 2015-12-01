package Controller;

import java.util.List;

import com.google.gson.Gson;

import Model.Jogo;
import ServicoPlataforma.IControladorJogo;

class ControladorJogo implements IControladorJogo{

	@Override
	public List<Jogo> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jogo post(String json) {
		Jogo jogo = verificarDados(json);
		jogo.salvar(jogo);
		return jogo;
	}

	@Override
	public Jogo put(long id, String json) {
		Jogo jogo = verificarDados(json);
		jogo.salvar(jogo);
		return jogo;
	}

	@Override
	public Jogo delete(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Jogo verificarDados(String json) {
		//instancia um objeto da classe Gson	    	
		Gson gson = new Gson();
		Jogo jogo = gson.fromJson(json, Jogo.class);
		return jogo;
	}

}
