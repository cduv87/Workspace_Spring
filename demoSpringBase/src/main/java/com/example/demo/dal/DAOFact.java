package com.example.demo.dal;

public class DAOFact {
	public static ContactDAO getContactDAO() {
		return new ContactDAOMock();
	}
}
