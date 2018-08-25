package ejb;

import java.util.List;

import data.Categorie;

public interface CategorieManagementEJBLocal {

	List<Categorie> findAllCategorie();

	void voegCategorieToe(Categorie categorie);

	void verwijderCategorie(int catId);

	Categorie zoekCategorie(int catId);

}
