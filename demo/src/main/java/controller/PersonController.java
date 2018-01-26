package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService ps;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Person getAll(@PathVariable String id) {
		return ps.getPerson(id);
	}

	@RequestMapping("/all")
	public Hashtable<String, Person> getAll() {
		return ps.getAll();
	}

	@RequestMapping(value = "/{personId}", method = RequestMethod.PUT)
	public Hashtable<String, Person> updatePerson(@PathVariable int personId, @RequestBody Person p) {
		Hashtable<String, Person> updatedPerson = ps.updatePerson(p);
		return updatedPerson;
	}

	@RequestMapping(value = "/insertPerson", method = RequestMethod.POST)
	public Hashtable<String, Person> insertPerson(@RequestBody Person p) {
		Hashtable<String, Person> insertPerson = ps.insertPerson(p);
		return insertPerson;
	}

	@RequestMapping(value = "/{personId}", method = RequestMethod.DELETE)
	public Hashtable<String, Person> deletePerson(@PathVariable String personId) {
		Hashtable<String, Person> updatedPerson = ps.deletePerson(personId);
		return updatedPerson;
	}
}
