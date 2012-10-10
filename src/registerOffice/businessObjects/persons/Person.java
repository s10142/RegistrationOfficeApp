package registerOffice.businessObjects.persons;

import java.util.ArrayList;
import java.util.List;

import registerOffice.businessObjects.cars.*;

public class Person {

	private String name;
	private List<Car> cars;
	private String pesel;
	
	public Person(String name, String pesel)
	{
		this.name=name;
		this.pesel=pesel;
		this.cars=new ArrayList<Car>();
	}
	
	public Person(String name) {
		
		this(name,"");
	}
	
	public Person()
	{
		this("","");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	
	
	
}
