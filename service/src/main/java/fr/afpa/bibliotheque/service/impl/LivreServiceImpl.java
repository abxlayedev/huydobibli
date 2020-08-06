/**
 * 
 */
package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public int getNbLivre(String category) {

		return repoLivre.getNbLivreByCategory(category);
	}

}
