package fr.afpa.bibliotheque.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import fr.afpa.bibliotheque.data.Auteur;
import fr.afpa.bibliotheque.data.Theme;
import fr.afpa.bibliotheque.repository.AuteurRepo;
import fr.afpa.bibliotheque.repository.ThemeRepo;
import lombok.extern.log4j.Log4j;


@Repository
@Log4j
public class ThemeRepoImpl implements ThemeRepo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	

	 private static final class ThemeMapper implements RowMapper<Theme> {
	        public Theme mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Theme theme = new Theme();
	     
	            theme.setTheme(rs.getString("theme"));
	             theme.setIdtheme(rs.getInt("idtheme"));
	
	            return theme;
	        }
	    }



	@Override
	public void AddTheme(String theme) {
		  String query = "INSERT INTO theme (theme) VALUES (\"23\")";
	        jdbcTemplate.update(query);
	}
}