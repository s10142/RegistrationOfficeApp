package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public class PersonManager implements ManagerInterface<Person>{

	private List<Person> persons=DatabaseContext.getPersons();
	
	@Override
	public List<Person> getAll() {

		return persons;
	}

	@Override
	public boolean save(Person person) {
		
		return persons.add(new Person(person.getName(), person.getPesel()));
	}

	@Override
	public boolean delete(Person person) {
		
		return persons.remove(person);
	}

	@Override
	public Person get() {
		// TODO Auto-generated method stub
		return null;
	}



}
