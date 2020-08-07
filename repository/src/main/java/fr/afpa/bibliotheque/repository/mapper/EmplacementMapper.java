package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Auteur;
import fr.afpa.bibliotheque.data.Emplacement;

public class EmplacementMapper implements RowMapper<Emplacement> {
	@Override
    public Emplacement mapRow(ResultSet rs, int rowNum) throws SQLException {
		Emplacement emplacement = new Emplacement();
 
		emplacement.setNomemplacement(rs.getString("emplacement"));
		emplacement.setIdEmplacement(rs.getInt("idemplacement"));

        return emplacement;
    }}