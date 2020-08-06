package fr.afpa.bibliotheque.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DuplicateKeyException;

import fr.afpa.bibliotheque.repository.config.RepositoryConfig;
import fr.afpa.bibliotheque.repository.impl.LivreRepositoryImpl;
import lombok.extern.log4j.Log4j;

@Log4j
public class MainTestRepository {
	
	public static void main(String[] args) {
ApplicationContext ctx = new AnnotationConfigApplicationContext(RepositoryConfig.class);

		
		LivreRepository exempleLivre =  (LivreRepository) ctx.getBean("livreRepositoryImpl");
        try {
			exempleLivre.createLivre("blabla", "bmlal", "bmla", "bla");
		} catch (DuplicateKeyException e) {
			log.error(e.getMessage());
		}
		
		exempleLivre.deleteLivre(8);
		System.out.println(exempleLivre.findLivreByTitle("Neuf histoires"));
		System.out.println(exempleLivre.findAll());
	}

}
