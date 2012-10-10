package registerOffice.management;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import registerOffice.businessObjects.persons.Person;

public class PersonManagerTests {

	@Test
	public void save_method_should_correctly_add_person_to_database() {
		
		Person p = new Person("Adam");
		
		List<Person> persons = DatabaseContext.getPersons();
		
		PersonManager mgr = new PersonManager();
		mgr.save(p);
		assertTrue("Size is still zero",persons.size()>0);
		
		assertEquals("Names do not match",p.getName(), persons.get(0).getName());
		assertNotSame("It shouldn't be the same place in memory",p, persons.get(0));
		
		persons.clear();
	}
	
	@Test
	public void delete()
	{
		
		Person p = new Person("Patryk");
		
		List<Person> persons = DatabaseContext.getPersons();
		
		PersonManager mgr = new PersonManager();
		
		mgr.save(p);
		
		mgr.delete(p);
		
		assertNotSame("Person exist",p, persons.get(0));
		
		persons.clear();
	}
	
	@Test
	public void pesel() {
		
		Person p = new Person("Patryk", "90112709537");
		
		List<Person> persons = DatabaseContext.getPersons();
		
		PersonManager mgr = new PersonManager();
		
		mgr.save(p);
		
		assertTrue("Pesel is null",p.getPesel()!=null);
		
		assertEquals("Pesels do not match",p.getPesel(), persons.get(0).getPesel());
		
		
		persons.clear();
	}
	
	@Test
	public void get_all()
	{
		Person p1 = new Person("Patryk", "90112709537");
		
		List<Person> persons = DatabaseContext.getPersons();
		
		PersonManager mgr = new PersonManager();
		
		mgr.save(p1);
		
		Person p2 = new Person("Patryk", "90112709537");
		
		PersonManager mgr2 = new PersonManager();
		
		mgr.save(p2);
		
		assertTrue(mgr.getAll()==persons);
		
		persons.clear();
		
	}

}
