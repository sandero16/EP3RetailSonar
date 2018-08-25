package ejb;

import java.util.List;

import data.Bedrijf;
import data.Eigenschappen;
import data.Eigenschappenbedrijf;

public interface EigenschappenBedrijfManagementEJBLocal {

	List<Eigenschappenbedrijf> findAllEigenschappenBedrijf(int bedrijfId);

	void voegEigenschapToe(Eigenschappen e, Bedrijf bedrijf);

	void verwijderEigenschapBedrijf(int eigenschapId, int bedrijfId);

}
