package ejb;

import java.util.List;

import javax.ejb.Local;

import data.User;

@Local
public interface GebruikerManagementEJBLocal {
	
	public void maakGebruiker(User gebruiker);
	
	
	
	//true als login geldig is
	//false als login ongeldig is
	public boolean loginGegevensCorrect(String login, String wachtwoord);

	List<User> findAllUsers();

	User findPerson(String username);

	List<User> findAllUsersBedrijf(int bedijfid);

	String hash(String wachtwoord);

	List<User> findAllRegioManagersBedrijf(int bedrijfId, int groupId);

	User findPerson(int userId);

	void changeGebruiker(User loggedInUser);

	void verwijderGebruiker(int userId);

	List<User> findAllAdmins();
	
}
