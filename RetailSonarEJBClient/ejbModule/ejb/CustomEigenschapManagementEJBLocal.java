package ejb;

import java.util.List;

import data.Customeigenschap;

public interface CustomEigenschapManagementEJBLocal {

	void voegCustomEigenschapToe(Customeigenschap customEigenschap);

	List<Customeigenschap> findAllCustomEigenschappenBedrijf(int bedrijfId);

	void verwijderEigenschap(int customEigenschapId, int bedrijfId);

}
