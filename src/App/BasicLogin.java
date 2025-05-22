package App;

import java.util.HashMap;
import java.util.Map;

public class BasicLogin implements ILogin {
	
	private Map<String, String> userDatabase = new HashMap<>();
	
	public BasicLogin(String username, String password) {
		userDatabase.put(username, password);
	}


	@Override
	public boolean authenticate(String username, String password) {
		return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
	}
	

}
