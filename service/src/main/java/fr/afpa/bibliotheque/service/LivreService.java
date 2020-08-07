package fr.afpa.bibliotheque.service;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreService {

	int getNbLivreByCategorySrv(String categoryName);
	List<Livre> getAllBooksSrv();
	void createLivreSrv(String title, String description, String isbn, String code);
	void deleteLivreSrv(int BG);
	List<Livre> findLivreByTitleSrv(String titre);
	List<Livre> findAllSrv();
}
