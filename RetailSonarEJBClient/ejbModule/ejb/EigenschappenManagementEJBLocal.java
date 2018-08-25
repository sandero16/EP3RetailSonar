package ejb;

import java.util.List;

import data.Eigenschappen;

public interface EigenschappenManagementEJBLocal {

	void voegEigenschapToe(Eigenschappen eig);

	List<Eigenschappen> findAllEigenschappen();

	Eigenschappen findEigenschap(int id);

	List<Eigenschappen> findAllEigenschappenCategorie(int categorieId);

	void verwijderEigenschap(int eigenschapId);

}
