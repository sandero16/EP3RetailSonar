package ejb;

import java.util.List;
import data.Afstand;

import data.FiliaalGegevens;

public interface AfstandManagementEJBLocal {
	
	void invoegenGegevens(FiliaalGegevens gebruikerGegevens, String userName);
	
	List<FiliaalGegevens> findAllFilialenBedrijf(int bedrijfId);
		
	FiliaalGegevens findFiliaalGegevens(int filiaalId);

	void wijzigFiliaal(FiliaalGegevens filiaalGegevens);
		
	List<FiliaalGegevens> findAllFilialenRegioManager(int userId);

	FiliaalGegevens findProject(int filiaalId);

	void verwijderFiliaal(int filiaalId);

	List<String> findAlleFilialen(String username);

	List<String> findAddressenVanAlleFilialen(String username);

	List<String> findIdVanAlleFilialen(String username);
	
	void nieuwFiliaal(Afstand afstand);
	
	void mergeNieuweAfstand(Afstand afstand);
	
	Afstand findAfstand(int filiaalId);
	
	boolean findAanwezigheid(int filiaalid);



}
