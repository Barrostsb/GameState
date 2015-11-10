package servicePlatform;

import java.util.List;

import model.User;

public interface IUserController {
	List<User> get();
	User post(String json);
	User put(long id, String json);
	User delete(long id);
}
