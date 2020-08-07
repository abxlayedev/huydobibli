/**
 * 
 */
package fr.afpa.bibliotheque.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.service.AuteurService;
import fr.afpa.bibliotheque.service.EmplacementService;
import fr.afpa.bibliotheque.service.LivreService;
import fr.afpa.bibliotheque.service.ThemeService;
import lombok.extern.log4j.Log4j;

/**
 * @author bilonjea
 *
 */
@Log4j
@Component
public class LivreBusinessImpl implements LivreBusiness{
	
	@Autowired
	LivreService serviceLivre;
	EmplacementService serviceEmplacement;
	ThemeService serviceTheme;
	AuteurService serviceAuteur;
	
	@Override
	public void createLivre(String titre, String isbn, String description, String code, String auteur, String theme,
			String nomemplacement) {
		//	serviceLivre.createLivreSrv(titre, description, isbn, code);
		//	System.out.println("tuant");
		//	log.debug("Tuan");
			serviceTheme.AddTheme(theme);
			//System.out.println("mick");
		//	serviceAuteur.AddAuteur(auteur);
		//	serviceEmplacement.AddEmplacement(nomemplacement);
			
		
	}
	



}
