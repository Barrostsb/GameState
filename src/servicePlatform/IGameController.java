package servicePlatform;

import java.util.List;

import model.Game;

public interface IGameController {
	List<Game> get();
	Game post(String json);
	Game put(long id, String json);
	Game delete(long id);
}
