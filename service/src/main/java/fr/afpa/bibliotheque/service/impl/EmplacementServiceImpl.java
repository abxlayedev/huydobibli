package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bibliotheque.repository.EmplacementRepo;

import fr.afpa.bibliotheque.service.EmplacementService;

@Service
public class EmplacementServiceImpl implements EmplacementService{

	@Autowired
	EmplacementRepo repoEmplacement;

	@Override
	public void AddEmplacement(String nomemplacement) {
		
		repoEmplacement.AddEmplacement(nomemplacement);
	}
}
