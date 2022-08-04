package com.example.tpVote.dal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.tpVote.bo.Candidat;
import com.example.tpVote.bo.Votant;

public interface CandidatDAO extends CrudRepository<Candidat, Integer> {


	@Query("SELECT c.lstvotants FROM Candidat c WHERE c.nom= :nom")
	Iterable<Votant> votantsOfCandidat(@Param("nom") String nom);
}
