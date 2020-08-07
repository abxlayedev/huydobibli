package fr.afpa.bibliotheque.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.afpa.bibliotheque.data.Auteur;
import fr.afpa.bibliotheque.data.Theme;

public class ThemeMapper implements RowMapper<Theme> {
	@Override
    public Theme mapRow(ResultSet rs, int rowNum) throws SQLException {
    	Theme theme = new Theme();
 
    	theme.setTheme(rs.getString("theme"));
    	theme.setIdtheme(rs.getInt("idtheme"));

        return theme;
    }
    }