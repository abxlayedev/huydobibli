/**
 * 
 */
package fr.afpa.bibliotheque.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.data.Livre;
import fr.afpa.bibliotheque.repository.LivreRepository;
import fr.afpa.bibliotheque.service.LivreService;

/**
 * @author bilonjea
 *
 */
@Service
public class LivreServiceImpl implements LivreService {
	
	@Autowired
	LivreRepository  repoLivre;

	@Override
	public int getNbLivreByCategorySrv(String categoryName) {
		
		return repoLivre.getNbLivreByCategory(categoryName);
	}

	@Override
	public List<Livre> getAllBooksSrv() {
		
		return repoLivre.getAllBooks();
	}

	@Override
	public void createLivreSrv(String title, String description, String isbn, String code) {
		
		repoLivre.createLivre(title, description, isbn, code);
	}

	@Override
	public void deleteLivreSrv(int BG) {
		
		repoLivre.deleteLivre(BG);
	}

	@Override
	public List<Livre> findLivreByTitleSrv(String titre) {
		
		return repoLivre.findLivreByTitle(titre);
	}

	@Override
	public List<Livre> findAllSrv() {
		
		return repoLivre.findAll();
	}

	



}
