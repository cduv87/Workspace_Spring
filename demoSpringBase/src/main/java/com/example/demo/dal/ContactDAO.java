package com.example.demo.dal;

import java.util.List;

import com.example.demo.bo.Contact;

public interface ContactDAO {
	public void insert(Contact contact);
	public List<Contact> getAll();
	public void delete(Contact contact);
	public void update(Contact contact);
}
