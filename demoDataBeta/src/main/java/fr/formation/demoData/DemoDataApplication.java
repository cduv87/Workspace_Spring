package fr.formation.demoData;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.demoData.bo.Contact;
import fr.formation.demoData.dal.ContactDAO;

@SpringBootApplication
public class DemoDataApplication implements CommandLineRunner {
	@Autowired
	private ContactDAO dao;

	public static void main(String[] args) {
		SpringApplication.run(DemoDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Contact jean = new Contact("Cérien", "Jean", "000244");
		Contact jean2 = new Contact("Cérien", "Jean2", "000244");
		Contact jean3 = new Contact("Cérien", "Jean3", "000244");
		Contact jean4 = new Contact("Cérien", "Jean4", "000244");
		dao.save(jean2);
		dao.save(jean3);
		dao.save(jean4);
		dao.save(jean);
		
		System.out.println("____________");
		System.out.println("print jean :");
		System.out.println(jean);
		System.out.println("_________");
		System.out.println("findAll :");
		dao.findAll().forEach(System.out::println);
		System.out.println("_______");
		System.out.println("count :");
		System.out.println(dao.count());
		System.out.println("_______");
		System.out.println("findbyID :");
		Contact modifjean3 = dao.findById(2).orElse(null);
		System.out.println("_______");
		System.out.println("printJean3 :");
		System.out.println(modifjean3);
		modifjean3.setTel("666666666");
		System.out.println("_______");
		System.out.println("printJean3 new phone :");
		System.out.println(modifjean3);
		System.out.println("_______");
		System.out.println("save :");
		dao.save(modifjean3);
		System.out.println("_________");
		System.out.println("findAll :");
		dao.findAll().forEach(System.out::println);
		
	}

}
