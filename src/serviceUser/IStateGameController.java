package serviceUser;

import java.util.List;

import model.StateGame;

public interface IStateGameController {
	List<StateGame> get();
	List<StateGame> get(long idUser);
	StateGame post(String json);
}
