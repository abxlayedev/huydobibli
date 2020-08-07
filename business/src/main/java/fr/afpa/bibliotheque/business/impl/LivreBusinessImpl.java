/**
 * 
 */
package fr.afpa.bibliotheque.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.service.LivreService;

/**
 * @author bilonjea
 *
 */
@Component
public class LivreBusinessImpl implements LivreBusiness{
	
	@Autowired
	LivreService serviceLivre;
	
	public int getLibreByCategory(String cat) {
		return serviceLivre.getNbLivreByCategorySrv(cat);
	}

	@Override
	public void createLivre(String titre, String isbn, String description, String code, String auteur, String theme,
			String nomemplacement) {
		serviceLivre.createLivreSrv(titre, description, isbn, code);
		
	}

}
