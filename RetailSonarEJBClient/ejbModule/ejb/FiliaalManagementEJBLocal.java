package ejb;

import java.util.List;

import data.FiliaalGegevens;
public interface FiliaalManagementEJBLocal {

	int invoegenGegevens(FiliaalGegevens gebruikerGegevens, String userName);

	List<FiliaalGegevens> findAllFilialenBedrijf(int bedrijfId);

	FiliaalGegevens findFiliaalGegevens(int filiaalId);

	void wijzigFiliaal(FiliaalGegevens filiaalGegevens);

	List<FiliaalGegevens> findAllFilialenRegioManager(int userId);

	FiliaalGegevens findProject(int filiaalId);

	void verwijderFiliaal(int filiaalId);

	List<String> findAlleFilialen(String username);

	List<String> findAddressenVanAlleFilialen(String username);

	List<String> findIdVanAlleFilialen(String username);

	int findIdBedrijf(int filiaalId);


}
