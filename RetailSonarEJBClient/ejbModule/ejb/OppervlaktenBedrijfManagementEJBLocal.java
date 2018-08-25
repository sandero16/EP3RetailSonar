package ejb;

import javax.persistence.Query;

import data.FiliaalGegevens;
import data.OppervlaktenBedrijf;

public interface OppervlaktenBedrijfManagementEJBLocal {

	void voegOppervlakToe(OppervlaktenBedrijf oppervlaktenbedrijf);
	
	void invoegenGegevens(FiliaalGegevens gebruikerGegevens, String userName);
		
	boolean findAanwezigheid(int bedrijfid);
		
}
