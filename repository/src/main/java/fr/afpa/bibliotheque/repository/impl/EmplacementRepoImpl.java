package fr.afpa.bibliotheque.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Emplacement;
import fr.afpa.bibliotheque.repository.AuteurRepo;
import fr.afpa.bibliotheque.repository.EmplacementRepo;
import lombok.extern.log4j.Log4j;



	@Repository
	@Log4j
	public class EmplacementRepoImpl implements EmplacementRepo {

		@Autowired
		JdbcTemplate jdbcTemplate;

		@Override
		public void AddEmplacement(String emplacement) {
			  String query = "INSERT INTO emplacement (nomemplacement) VALUES (?)";
		        jdbcTemplate.update(query, emplacement);
		    }
		
		

		 private static final class EmplacementMapper implements RowMapper<Emplacement> {
		        public Emplacement mapRow(ResultSet rs, int rowNum) throws SQLException {
		        	Emplacement emplacement = new Emplacement();
		     
		        	emplacement.setNomemplacement(rs.getString("nomemplacement"));
		        	emplacement.setIdEmplacement(rs.getInt("idemplacement"));
		
		            return emplacement;
		        }
		    }
	}