package fr.afpa.bibliotheque.repository;

import java.util.List;

import fr.afpa.bibliotheque.data.Livre;

public interface LivreRepository {
	
	int getNbLivreByCategory(String categoryName);
	 List<Livre> getAllBooks();
	void createLivre(String title, String description, String isbn, String code);
	void deleteLivre(int BG);
	List<Livre> findLivreByTitle(String titre);
	List<Livre> findAll();

}
