package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Auteur;
import fr.afpa.bibliotheque.data.Livre;


public class LivreMapper implements RowMapper<Livre>{

	@Override
	public Livre mapRow(ResultSet rs, int rowNum) throws SQLException {
		Livre exempleLivre = new Livre();
		
		exempleLivre.setDescription(rs.getString("description"));
		exempleLivre.setTitre(rs.getString("titre"));
		exempleLivre.setId(rs.getInt("idlivre"));
		exempleLivre.setIsbn(rs.getString("isbn"));
		exempleLivre.setCode(rs.getString("code"));
		return exempleLivre;
		
	}

}
