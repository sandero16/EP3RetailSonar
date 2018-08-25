package ejb;

import java.util.List;
import data.Afstand;
import data.AfstandenBedrijf;
import data.FiliaalGegevens;

public interface AfstandenBedrijfManagementEJBLocal {
	
	void voegAfstandToe(AfstandenBedrijf afstandenbedrijf);
		
	
	void invoegenGegevens(FiliaalGegevens gebruikerGegevens, String userName);
	
	boolean findAanwezigheid(int bedrijfid);

}
