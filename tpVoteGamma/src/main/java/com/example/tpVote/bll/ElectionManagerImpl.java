package com.example.tpVote.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.tpVote.bo.Candidat;
import com.example.tpVote.bo.Votant;
import com.example.tpVote.dal.CandidatDAO;
import com.example.tpVote.dal.VotantDAO;

@Component
public class ElectionManagerImpl implements ElectionManager {
	
	@Autowired
	private VotantDAO Vdao;
	
	@Autowired
	private CandidatDAO Cdao;
	
	@Override
	public void addVotant(Votant votant) throws ElectionException {
		if(votant.getAge() < 18) {
			String message = votant.getNom() + " n'as pas 18 ans !!! ";
			throw new ElectionException(message);
		}
		if(!votant.getNat().equals("Français")) {
			String message = votant.getNom() + " n'es pas Français !!! ";
			throw new ElectionException(message);
		}
		Vdao.save(votant);
	}

	@Override
	public int countVotant() {
		
		return (int) Vdao.count();
	}

	@Override
	public int CountJospin() {
		
		return 0;
	}

	@Override
	public int CountChirac() {
		
		return 0;
	}

	@Override
	public void delVotant(Votant votant) {
		Vdao.delete(votant);
		
	}

	@Override
	public Iterable<Votant> getAllVotant() {
		
		return Vdao.findAll();
	}

	@Override
	public Iterable<Votant> getAllByCandidat(String nom) {

		return Cdao.votantsOfCandidat(nom);
	}

	@Override
	public Candidat gagnant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCandidat(Candidat candidat) {
		Cdao.save(candidat);
		
	}

	@Override
	public void delCandidat(Candidat candidat) {
		Cdao.delete(candidat);
		
	}

	@Override
	public Iterable<Candidat> getAllCandidat() {
		// TODO Auto-generated method stub
		return Cdao.findAll();
	}

	@Override
	public int countCandidat() {
		
		return (int) Cdao.count();
	}


}
