package com.example.tpVote.bll;

import java.util.ArrayList;
import java.util.List;

import com.example.tpVote.bo.CandidatEnum;
import com.example.tpVote.bo.Votant;


public interface VotantManager {
	
	public void addVotant(Votant votant) throws VotantException;
	
	public void delVotant(Votant votant);
	
	public void updVotant(Votant votant);
	
	public Iterable<Votant> getAllVotant();
	
	public int Count();
	
	public ArrayList<Votant> getAllByCandidat(CandidatEnum candidat);
	
	public int CountJospin();
	
	public int CountChirac();
	
	public CandidatEnum gagnant();
	
}
