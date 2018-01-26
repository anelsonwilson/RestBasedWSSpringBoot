package dao;

import java.util.Hashtable;

import org.springframework.stereotype.Repository;

import model.Person;

@Repository
public class PersonDAO {

	Hashtable<String, Person> persons = new Hashtable<>();

	public PersonDAO() {
		getDataFromDB();
	}

	/*
	 * This function acts as if this is bringing data from the database.. Values are
	 * stored in the Hashtable collection.
	 */
	private void getDataFromDB() {
		Person p = new Person();
		p.setId("1");
		p.setAge(28);
		p.setFirstName("Cris");
		p.setLastName("Baker");
		persons.put("1", p);

		p = new Person();
		p.setId("2");
		p.setAge(30);
		p.setFirstName("Fritz");
		p.setLastName("Manke");
		persons.put("2", p);
	}

	/*
	 * Get ALL person
	 */
	public Hashtable<String, Person> getAll() {
		return persons;
	}

	/*
	 * Get specific person
	 */
	public Person getPerson(String id) {
		if (persons.containsKey(id))
			return persons.get(id);
		else
			return null;
	}

	/*
	 * Insert Persons
	 */
	public Hashtable<String, Person> insertPerson(Person p) {
		Person updatePerson = new Person();

		updatePerson.setId(p.getId());
		updatePerson.setAge(p.getAge());
		updatePerson.setFirstName(p.getFirstName());
		updatePerson.setLastName(p.getLastName());

		persons.put(p.getId(), p);

		return persons;
	}

	/*
	 * Update the Persons
	 */
	public Hashtable<String, Person> updatePerson(Person p) {
		Person updatePerson = new Person();
		if (persons.containsKey(p.getId())) {

			updatePerson.setId(p.getId());
			updatePerson.setAge(p.getAge());
			updatePerson.setFirstName(p.getFirstName());
			updatePerson.setLastName(p.getLastName());

			persons.put(p.getId(), p);
		} else
			return null;

		return persons;
	}

	/*
	 * Delete a Person
	 */
	public Hashtable<String, Person> deletePerson(String id) {
		if (persons.containsKey(id)) {
			persons.remove(id);
			return persons;
		} else
			return null;
	}

}
