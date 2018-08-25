package ejb;

import java.util.List;

import data.Afbeeldingen;

public interface AfbeeldingManagementEJBLocal {

	void invoegen(Afbeeldingen afb);

	List<Afbeeldingen> findAllAfbeeldingenFiliaal(int filiaalId);


}
