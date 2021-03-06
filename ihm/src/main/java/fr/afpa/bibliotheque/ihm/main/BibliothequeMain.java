/**
 * 
 */
package fr.afpa.bibliotheque.ihm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import fr.afpa.bibliotheque.business.LivreBusiness;
import fr.afpa.bibliotheque.business.TestBusiness;
import fr.afpa.bibliotheque.business.impl.LivreBusinessImpl;
import fr.afpa.bibliotheque.ihm.config.MainConfig;
import fr.afpa.bibliotheque.repository.impl.LivreRepositoryImpl;
import javafx.application.Application;
import javafx.stage.Stage;
import lombok.extern.log4j.Log4j;




/**
 * @author bilonjea
 *
 */

@Log4j
public class BibliothequeMain {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		log.info("--------------------------------------"
				+"---------------------------------------"
				+"-------------Bibliothe-----------------"
				+"---------------------------------------"
				+"---------------------------------------");
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

	//	TestBusiness test = (TestBusiness) ctx.getBean("testBusiness");
	//	test.sayHello();
		
		//	livre.getLibreByCategory("losirs");
	//	System.out.println(livre.getLibreByCategory("losirs"));
		
		
		
		LivreBusiness livre =  (LivreBusiness) ctx.getBean("livreBusinessImpl");

		livre.createLivre("to6t998o75234", "is67b9n82534", "des69cr7ipt58ion34", "c6ode54", "aut6e57u98r34", "th5e9m867e34", "nome89mp5lac6em7ent34");
		
	}


}
