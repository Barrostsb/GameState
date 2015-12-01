package Controller;

import java.util.List;

import com.google.gson.Gson;

import Model.TempoJogo;
import ServicoJogo.IControladorTempoJogoJ;
import ServicoPlataforma.IControladorTempoJogoP;

class ControladorTempoJogo implements IControladorTempoJogoJ, IControladorTempoJogoP {

	@Override
	public List<TempoJogo> get() {
		TempoJogo tempo = new TempoJogo();
		List<TempoJogo> lista = tempo.buscarTempoJogo();
		return lista;
	}

	@Override
	public List<TempoJogo> get(long idUsuario) {
		TempoJogo tempo = new TempoJogo();
		List<TempoJogo> lista = tempo.buscarTempoJogo(idUsuario);
		return lista;
	}

	@Override
	public TempoJogo post(String json) {
		TempoJogo tempoJogo = verificarDados(json);
		tempoJogo.adicionarTempoJogo(tempoJogo);
		return tempoJogo;
	}
	
	public TempoJogo verificarDados(String json) {
		//instancia um objeto da classe Gson	    	
		Gson gson = new Gson();
		TempoJogo tempo_jogo = gson.fromJson(json, TempoJogo.class);
		return tempo_jogo;
	}

}
