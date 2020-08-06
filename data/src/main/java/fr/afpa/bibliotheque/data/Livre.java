package fr.afpa.bibliotheque.data;

import java.util.Date;

import lombok.Data;

@Data
public class Livre {
	
	private int id;
	private String titre;
	private String description;
	private String  isbn;
	private String code;

}
