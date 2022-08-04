package com.example.tpVote.dal;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.tpVote.bo.Candidat;
import com.example.tpVote.bo.Votant;

public interface VotantDAO extends CrudRepository<Votant, Integer> {
	
//	Iterable<Votant> finAllByCandidat(CandidatEnum candidat);
	
//	@Query("SELECT v FROM Votant v WHERE v.candidat= :candidat")
//	ArrayList<Votant> selectByCandidat(@Param("candidat") Candidat candidat);


}
