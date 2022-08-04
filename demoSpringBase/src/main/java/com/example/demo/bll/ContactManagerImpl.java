package com.example.demo.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bo.Contact;
import com.example.demo.dal.ContactDAO;
import com.example.demo.dal.ContactDAOMock;


@Service
public class ContactManagerImpl  implements ContactManager {

	@Autowired
	private ContactDAO dao;
	
	
	@Override
	public void addContact(Contact contact) throws ContactException {
		// CT001 : Pas de Dupont
		if("Dupont".equals(contact.getNom())) {
			throw new ContactException("Pas de Dupont !!");
		}
		
		dao.insert(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		return dao.getAll();
	}

	@Override
	public void delContact(Contact contact) {
		dao.delete(contact);
	}

	@Override
	public void updateContact(Contact contact) throws ContactException {
		// CT001 : Pas de Dupont
		if("Dupont".equals(contact.getNom())) {
			throw new ContactException("Pas de Dupont !!");
		}
		dao.update(contact);
	}
	
}
