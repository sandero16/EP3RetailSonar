package ejb;

import data.Bedrijf;

import java.util.List;

import javax.ejb.Local;

@Local
public interface BedrijfManagementEJBLocal {

	void maakBedrijf(Bedrijf bedrijf);

	List<Bedrijf> findAllBedrijven();

	Bedrijf findBedrijf(int id);

	Bedrijf findBedrijf(String naam);

	void wijzigBedrijf(Bedrijf bedrijf);

}
