package ServicoJogo;

import Model.EstadoJogo;

public interface IControladorEstadoJogo {
	EstadoJogo get(long idUsuario, long idJogo);
	EstadoJogo post(String json);
}
