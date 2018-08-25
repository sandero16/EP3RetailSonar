package ejb;

import java.util.List;

import data.FiliaalGegevens;
import data.Oppervlakte;

public interface OppervlakteManagementEJBLocal {
	
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
		
		Oppervlakte findoppervlakte(int filiaalId);
		
		void nieuwFiliaal(Oppervlakte oppervlak);
	
		void mergeNieuweOppervlakte(Oppervlakte oppervlak);
		



	}


