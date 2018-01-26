package service;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PersonDAO;
import model.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDAO;

	/*
	 * Get ALL person
	 */
	public Hashtable<String, Person> getAll() {
		return personDAO.getAll();
	}

	/*
	 * Get specific person
	 */
	public Person getPerson(String id) {
		return personDAO.getPerson(id);
	}

	/*
	 * Insert Persons
	 */
	public Hashtable<String, Person> insertPerson(Person p) {
		return personDAO.insertPerson(p);
	}

	/*
	 * Update the Persons
	 */
	public Hashtable<String, Person> updatePerson(Person p) {
		return personDAO.updatePerson(p);
	}

	/*
	 * Delete a Person
	 */
	public Hashtable<String, Person> deletePerson(String id) {
		return personDAO.deletePerson(id);
	}
}
