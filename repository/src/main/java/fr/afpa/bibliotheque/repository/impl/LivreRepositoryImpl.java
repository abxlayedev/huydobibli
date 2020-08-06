package fr.afpa.bibliotheque.repository.impl;

import fr.afpa.bibliotheque.data.Livre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.repository.LivreRepository;
import lombok.extern.log4j.Log4j;





@Repository
@Log4j
public class LivreRepositoryImpl implements LivreRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Livre> getAllBooks() {
        String query = "SELECT * FROM livre";
        return jdbcTemplate.query(query, new LivresMapper());
    }
	  private static final class LivresMapper implements RowMapper<Livre> {
	        public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Livre livre = new Livre();
	            livre.setDescription(rs.getString("description"));
	            livre.setTitre(rs.getString("titre"));
	            livre.setId(rs.getInt("idlivre"));
	            livre.setIsbn(rs.getString("isbn"));
	            livre.setCode(rs.getString("code"));
	            return livre;
	        }
	    }

        
    
    
	@Override
	public int getNbLivreByCategory(String categoryName) {
        //TODO Faire les requetes
		
		//INSERT INTO ;
		return 15;
	}


    // createLivre (pour insert un nouveau livre bbd)
	@Override
    public void createLivre(String title, String description, String isbn, String code) {
        String query = "INSERT INTO livre (titre, description, isbn, code) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(query, title, description, isbn, code);
    }

    // deleteLivre (supprimer un livre) 
	@Override
    public void deleteLivre(int BG) {
        String query = "DELETE FROM livre WHERE idlivre = "+BG;
        jdbcTemplate.execute(query);
    }


    // findLivreByTitle (pour trouver un livre en fonction d’un critère par exemle le titre 
	@Override
    public List<Livre> findLivreByTitle(String titre) {
        String query = "SELECT * FROM livre WHERE titre = \""+titre+"\"";
        return jdbcTemplate.query(query, new LivresMapper());
    }


    // findAll  (pour trouver tous les livres)
	@Override
    public List<Livre> findAll() {
        String query = "SELECT * FROM livre";
        return jdbcTemplate.query(query, new LivresMapper());
    }
}
