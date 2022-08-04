package com.example.demo.dal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Repository;

import com.example.demo.bo.Contact;


@Repository
public class ContactDAOMock implements ContactDAO {
	List<Contact> lst = new ArrayList<>();
	

	@Override
	public void insert(Contact contact) {
		lst.add(contact);
	}

	@Override
	public List<Contact> getAll() {
		return lst;
	}

	@Override
	public void delete(Contact contact) {
		lst.remove(contact);
	}

	@Override
	public void update(Contact contact) {
		// rien à faire
	}
}
