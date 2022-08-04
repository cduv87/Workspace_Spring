package com.example.tpVote.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Votant {
	@Id
	@GeneratedValue
	Integer idVotant;
	String nom;
	int age;
	String nat;
	
	@ManyToOne // il faudra une sauvegarde l'entreprise
	private Candidat candidat;
	
	public Votant(String nom, int age, String nat) {
		this.nom = nom;
		this.age = age;
		this.nat = nat;
		
	}

	@Override
	public String toString() {
		return "Votant [idVotant=" + idVotant + ", nom=" + nom + ", age=" + age + ", nat=" + nat + "]";
	}
	
	

	
	
}
