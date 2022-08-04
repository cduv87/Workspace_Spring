package com.example.tpVote.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.example.tpVote.bo.Candidat;
import com.example.tpVote.bo.Votant;


public interface ElectionManager {
	
	public void addVotant(Votant votant) throws ElectionException;
	
	public void delVotant(Votant votant);
	
	public void addCandidat(Candidat candidat);
	
	public void delCandidat(Candidat candidat);
	
	public Iterable<Votant> getAllVotant();
	
	public Iterable<Candidat> getAllCandidat();
	
	public int countVotant();
	
	public int countCandidat();
	
	public Iterable<Votant> getAllByCandidat(String nom);
	
	public int CountJospin();
	
	public int CountChirac();
	
	public Candidat gagnant();
	
}
