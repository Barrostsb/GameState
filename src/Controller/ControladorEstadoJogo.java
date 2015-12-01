package Controller;

import Model.EstadoJogo;
import ServicoJogo.IControladorEstadoJogo;
import com.google.gson.Gson;

class ControladorEstadoJogo implements IControladorEstadoJogo{

	@Override
	public EstadoJogo get(long idUsuario, long idJogo) {
		EstadoJogo estJogo = new EstadoJogo();
		estJogo = estJogo.buscarEstadoJogo(idUsuario, idJogo);
		return estJogo;
	}

	@Override
	public EstadoJogo post(String json) {
		EstadoJogo estJogo = verificarDados(json);
		estJogo.armazenarEstadoJogo(estJogo);
		return estJogo;
	}
	
	public EstadoJogo verificarDados(String json) {
		//instancia um objeto da classe Gson	    	
		Gson gson = new Gson();
		EstadoJogo estJogo = gson.fromJson(json, EstadoJogo.class);
		return estJogo;
	}

}
