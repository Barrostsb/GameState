package servicePlatformGame;
import java.util.List;

import model.History;


public interface IHistoryController {
	List<History> get();
	List<History> get(long idUser);
	History post(String json);
}
