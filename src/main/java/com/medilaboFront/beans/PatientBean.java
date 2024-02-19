package com.medilaboFront.beans;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PatientBean {

	private Integer id;
	private String prenom;
	private String nom;
	private Date date_de_naissance;
	private String genre;
	private String adresse_postale;
	private String numero_telephone;

}
