package ejb;

import java.util.List;

import data.Taak;

public interface TakenManagementEJBLocal {

	List<Taak> findAllTakenFiliaal(int filiaalId);

	void voegTakenToe(Taak taak);

	void verwijderTaak(int taakId);

	Taak findTaak(int taakId);

	void updateTaken(Taak t);

	void setIngevuld(List<Taak> taken);

}
