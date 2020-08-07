package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.AuteurRepo;
import fr.afpa.bibliotheque.repository.LivreRepository;

@Service
public class AuteurServiceImpl implements AuteurRepo{

	@Autowired
	AuteurRepo  repoAuteur;
	
	@Override
	public void AddAuteur(String auteur) {
		
		repoAuteur.AddAuteur(auteur);
	}

}
