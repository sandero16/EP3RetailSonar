package ejb;

import java.util.List;

import data.Eigenschappen;
import data.Eigenschappenbedrijf;
import data.Eigenschappenbedrijfingevuld;
import data.FiliaalGegevens;

public interface EigenschappenBedrijfIngevuldManagementEJBLocal {

	void wijzigEigenschap(Eigenschappenbedrijfingevuld ebi);

	void verwijderEigenschapBedrijfIngevuld(int eigenschapId, int bedrijfId);

	List<Eigenschappenbedrijfingevuld> findAllEigenschappenCategorie(int filiaalId, int catId);

	List<Eigenschappenbedrijfingevuld> findAllEigenschappen(int filiaalId);

	void createEigenschapIngevuld(Eigenschappen eb, FiliaalGegevens f);

	void createEigenschapIngevuld(Eigenschappenbedrijf eb, FiliaalGegevens f);

	void createEigenschapIngevuld(List<Eigenschappenbedrijf> list, FiliaalGegevens filiaal);

	void mergeEigenschappen(List<Eigenschappenbedrijfingevuld> eigenschappen);

}
