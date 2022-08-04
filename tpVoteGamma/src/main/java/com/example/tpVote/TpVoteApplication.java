package com.example.tpVote;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.tpVote.bll.ElectionException;
import com.example.tpVote.bll.ElectionManager;
import com.example.tpVote.bll.ElectionManagerImpl;
import com.example.tpVote.bo.Candidat;
import com.example.tpVote.bo.Votant;
import com.example.tpVote.dal.VotantDAO;

@SpringBootApplication
public class TpVoteApplication implements CommandLineRunner {
	@Autowired
	private ElectionManagerImpl manager;

	public static void main(String[] args) {
		SpringApplication.run(TpVoteApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		//crea votants
		Votant v1 = new Votant("Proutus", 16, "Français");
		Votant v2 = new Votant("Altus", 19, "Français");
		Votant v3 = new Votant("Brutus", 18, "Congolais");
		Votant v4 = new Votant("Foutrus", 19, "Français");
		Votant v5 = new Votant("Petrus", 20, "Français");
		Votant v6 = new Votant("Ziggus", 21, "Français");
		Votant v7 = new Votant("Fatus", 18, "Français");
		Votant v8 = new Votant("Jesus", 2000, "Alien");
		
		Candidat c1 = new Candidat("JOSPIN");
		Candidat c2 = new Candidat("CHIRAC");
		

		
		//print de la liste
		System.out.println("____________________________________\n print list :");
		manager.getAllCandidat().forEach(System.out::println);
		
		c1.addVotants(v2);
		c1.addVotants(v4);
		c1.addVotants(v5);
		c2.addVotants(v6);
		c2.addVotants(v7);
		
		manager.addCandidat(c1);
		manager.addCandidat(c2);
		
		//print votant
		System.err.println("____________________________________\n print jesus :");
		System.out.println(v8);
		
		//insertion votants
		try {
			manager.addVotant(v1);
		} catch (ElectionException e) {
			System.err.println(e.getMessage());			
		}
		manager.addVotant(v2);
		try {
			manager.addVotant(v3);
		} catch (ElectionException e) {
			System.err.println(e.getMessage());
		}
		manager.addVotant(v4);
		manager.addVotant(v5);
		manager.addVotant(v6);
		manager.addVotant(v7);

		//compter la totalité des votants
				System.err.println("____________________________________\n print count VOTANTS :");
				System.out.println(manager.countVotant());
				
				//print de la liste
				System.err.println("____________________________________\n print list VOTANTS :");
				manager.getAllVotant().forEach(System.out::println);
				
				//print de la liste
				System.err.println("____________________________________\n print list CANDIDATS :");
				manager.getAllCandidat().forEach(System.out::println);
				
				
				//print liste votant jospin
				System.err.println("____________________________________\n print listByJospin :");
				manager.getAllByCandidat("JOSPIN").forEach(System.out::println);
//				
				//comptage votant jospin
				System.out.println("____________________________________\n print CountByJospin :");
				System.out.println(manager.CountJospin());
//				
//				//methode renvoyer gagnant
//				System.err.println("____________________________________\n print ET LE GAGNANT EST :");
//				System.out.println(manager.gagnant());
	}

}
