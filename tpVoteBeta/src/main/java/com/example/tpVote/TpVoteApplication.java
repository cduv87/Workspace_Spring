package com.example.tpVote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tpVote.bll.VotantException;
import com.example.tpVote.bll.VotantManager;
import com.example.tpVote.bll.VotantManagerImpl;
import com.example.tpVote.bo.CandidatEnum;
import com.example.tpVote.bo.Votant;
import com.example.tpVote.dal.VotantDAO;

@SpringBootApplication
public class TpVoteApplication implements CommandLineRunner {
	@Autowired
	private VotantManager manager;

	public static void main(String[] args) {
		SpringApplication.run(TpVoteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.err.println(CandidatEnum.JOSPIN.ordinal());
		System.err.println(CandidatEnum.CHIRAC.ordinal());
//		//crea votants
//		Votant v1 = new Votant("Proutus", 16, "Français", CandidatEnum.CHIRAC);
//		Votant v2 = new Votant("Altus", 17, "Français", CandidatEnum.JOSPIN);
//		Votant v3 = new Votant("Brutus", 18, "Congolais", CandidatEnum.CHIRAC);
//		Votant v4 = new Votant("Foutrus", 19, "Français", CandidatEnum.JOSPIN);
//		Votant v5 = new Votant("Petrus", 20, "Français", CandidatEnum.CHIRAC);
//		Votant v6 = new Votant("Ziggus", 21, "Français", CandidatEnum.JOSPIN);
//		Votant v7 = new Votant("Fatus", 18, "Français", CandidatEnum.JOSPIN);
//		Votant v8 = new Votant("Jesus", 2000, "Alien", CandidatEnum.JOSPIN);
//		
//		//print votant
//		System.out.println("____________________________________\n print jesus :");
//		System.out.println(v8);
//		
//		//insertion votants
//		try {
//			manager.addVotant(v1);
//		} catch (VotantException e) {
//			System.err.println("_______________\n" + e.getMessage());
//		}
//		try {
//			manager.addVotant(v2);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		try {
//			manager.addVotant(v3);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		try {
//			manager.addVotant(v4);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		try {
//			manager.addVotant(v5);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		try {
//			manager.addVotant(v6);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		try {
//			manager.addVotant(v7);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		try {
//			manager.addVotant(v8);
//		} catch (VotantException e) {
//			
//			System.err.println("_______________\n" + e.getMessage());		}
//		
//		//compter la totalité des votants
//		System.out.println("____________________________________\n print count :");
//		System.out.println(manager.Count());
//		
//		//print de la liste
//		System.out.println("____________________________________\n print list :");
//		manager.getAllVotant().forEach(System.out::println);
//		
//		//print liste votant jospin
//		System.out.println("____________________________________\n print listByJospin :");
//		manager.getAllByCandidat(CandidatEnum.JOSPIN).forEach(System.out::println);
//		
//		//comptage votant jospin
//		System.out.println("____________________________________\n print CountByJospin :");
//		System.out.println(manager.CountJospin());
//		
//		//methode renvoyer gagnant
//		System.err.println("____________________________________\n print ET LE GAGNANT EST :");
//		System.out.println(manager.gagnant());
		
	}

}
