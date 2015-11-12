package ServicoPlataforma;

import java.util.List;

import Model.Jogo;

public interface IControladorJogo {
	List<Jogo> get();
	Jogo post(String json);
	Jogo put(long id, String json);
	Jogo delete(long id);
}
