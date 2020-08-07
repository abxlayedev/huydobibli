package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Auteur;
import fr.afpa.bibliotheque.data.Livre;

public class AuteurMapper implements RowMapper<Auteur> {
	
	@Override
    public Auteur mapRow(ResultSet rs, int rowNum) throws SQLException {
        Auteur auteur = new Auteur();
 
        auteur.setAuteur(rs.getString("auteur"));
         auteur.setId(rs.getInt("idauteur"));

        return auteur;
    }}