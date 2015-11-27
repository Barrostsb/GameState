package ServicoPlataforma;

import java.util.List;

import Model.TempoJogo;

public interface IControladorTempoJogoP {
	List<TempoJogo> get();
	List<TempoJogo> get(long idUser);
}
