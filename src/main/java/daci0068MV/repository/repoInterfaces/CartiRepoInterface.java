package daci0068MV.repository.repoInterfaces;

import daci0068MV.model.Carte;
import java.util.List;

public interface CartiRepoInterface {
	void adaugaCarte(Carte c);
	void modificaCarte(Carte nou, Carte vechi);
	void stergeCarte(Carte c);
	List<Carte> cautaCarte(String autor);
	List<Carte> getCarti();
	List<Carte> getCartiOrdonateDinAnul(String an);
}
