/**
 * 
 */
package fr.afpa.bibliotheque.business;

/**
 * @author bilonjea
 *
 */
public interface LivreBusiness {

	public int getLibreByCategory(String cat);
	public void createLivre (String titre, String isbn, String description, String code, String auteur, String theme, String nomemplacement); // apl ecran 
}
