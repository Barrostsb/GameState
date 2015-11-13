package ServicoPlataforma;

import java.util.List;

import Model.Historico;

public interface IControladorHistoricoP {
	List<Historico> get();
	List<Historico> get(long idUser);
}
