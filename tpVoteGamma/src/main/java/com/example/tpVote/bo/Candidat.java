package com.example.tpVote.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.support.FormatterPropertyEditorAdapter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter 
@Setter
@ToString
@NoArgsConstructor
public class Candidat {
	
	@Id
	@GeneratedValue
	private Integer idCandidat;
	String nom;

	@OneToMany(mappedBy = "candidat")
	private Set<Votant> lstvotants = new HashSet<>();
	
	public Candidat(String nom) {
		this.nom = nom;
	}
	
	public void addVotants(Votant votant) {
		lstvotants.add(votant);
		votant.setCandidat(this);
	}

	@Override
	public String toString() {
//		String listevotants = "";
//		for (Votant votant : this.lstvotants) {
//			listevotants.concat(votant.toString());
//		}
		return "Candidat [idCandidat=" + idCandidat + ", nom=" + nom + ", lstvotants=" + lstvotants + "]";
	}



}
