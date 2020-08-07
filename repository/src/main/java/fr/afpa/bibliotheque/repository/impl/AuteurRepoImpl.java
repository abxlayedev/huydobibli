package fr.afpa.bibliotheque.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Auteur;

import fr.afpa.bibliotheque.repository.AuteurRepo;
import lombok.extern.log4j.Log4j;

@Repository
@Log4j
public class AuteurRepoImpl implements AuteurRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void AddAuteur(String auteur) {
		  String query = "INSERT INTO auteur (auteur) VALUES (?)";
	        jdbcTemplate.update(query, auteur);
	    }
	
	

	 private static final class AuteurMapper implements RowMapper<Auteur> {
	        public Auteur mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Auteur auteur = new Auteur();
	     
	            auteur.setAuteur(rs.getString("auteur"));
	             auteur.setId(rs.getInt("idauteur"));
	
	            return auteur;
	        }
	    }
}
