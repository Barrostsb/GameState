package ServicoJogoPlataforma;
import java.util.List;

import Model.Historico;


public interface IControladorHistorico {
	List<Historico> get();
	List<Historico> get(long idUser);
	Historico post(String json);
}
