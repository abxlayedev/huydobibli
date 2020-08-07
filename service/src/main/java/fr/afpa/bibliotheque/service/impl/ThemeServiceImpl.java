package fr.afpa.bibliotheque.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.afpa.bibliotheque.repository.ThemeRepo;

import fr.afpa.bibliotheque.service.ThemeService;

@Service
public class ThemeServiceImpl implements ThemeService{

	@Autowired
	ThemeRepo repoTheme;

	@Override
	public void AddTheme(String theme) {
	
		repoTheme.AddTheme(theme);
	}
	
	
}
