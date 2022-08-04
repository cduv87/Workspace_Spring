package com.example.tpVote.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	CandidatEnum candidat;
	
	public Votant(String nom, int age, String nat, CandidatEnum candidat) {
		this.nom = nom;
		this.age = age;
		this.nat = nat;
		this.candidat = candidat;
	}
	
}
