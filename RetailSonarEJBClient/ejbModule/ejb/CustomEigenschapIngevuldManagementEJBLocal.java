package ejb;

import java.util.List;

import data.Customeigenschap;
import data.Customeigenschapingevuld;
import data.FiliaalGegevens;

public interface CustomEigenschapIngevuldManagementEJBLocal {

	void wijzigEigenschap(Customeigenschapingevuld c);

	void verwijderCustomEigenschap(int customEigenschapId, int bedrijfId);

	void createCustomEigenschapIngevuld(Customeigenschap newEig, FiliaalGegevens filiaal);

	List<Customeigenschapingevuld> findAllEigenschappen(int filiaalId, int catId);

	List<Customeigenschapingevuld> findAllEigenschappen(int filiaalId);

	void createCustomEigenschapIngevuld(List<Customeigenschap> newEig, FiliaalGegevens filiaal);

	void mergeEigenschappen(List<Customeigenschapingevuld> eigenschappen);

}
