package com.example.tpVote.bll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.tpVote.bo.CandidatEnum;
import com.example.tpVote.bo.Votant;
import com.example.tpVote.dal.VotantDAO;

@Component
public class VotantManagerImpl implements VotantManager {

	@Autowired
	private VotantDAO dao;
	
	@Override
	public void addVotant(Votant votant) throws VotantException {
		if(votant.getAge() < 18) {
			String message = votant.getNom() + " n'as pas 18 ans !!! ";
			throw new VotantException(message);
		}
		if(!votant.getNat().equals("Français")) {
			String message = votant.getNom() + " n'es pas Français !!! ";
			throw new VotantException(message);
		}
		dao.save(votant);
	}

	@Override
	public void delVotant(Votant votant) {
		dao.delete(votant);
		
	}

	@Override
	public void updVotant(Votant votant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterable<Votant> getAllVotant() {
 		
		return dao.findAll();
	}

	@Override
	public int Count() {
		
		return (int) dao.count();
	}

	@Override
	public int CountJospin() {
		
		return getAllByCandidat(CandidatEnum.JOSPIN).size();
	}

	@Override
	public int CountChirac() {
		// TODO Auto-generated method stub
		return getAllByCandidat(CandidatEnum.CHIRAC).size();
	}

	@Override
	public ArrayList<Votant> getAllByCandidat(CandidatEnum candidat) {
		// TODO Auto-generated method stub
		return dao.selectByCandidat(candidat);
	}
	
	@Override
	public CandidatEnum gagnant() {
		CandidatEnum vainqueur = null;
		int chichi = this.CountChirac();
		int jojo = this.CountJospin();
		if (chichi<jojo) {
			vainqueur = CandidatEnum.JOSPIN;
		}
		if (chichi>jojo) {
			vainqueur = CandidatEnum.CHIRAC;
		}
		return vainqueur;
		
	}

}
