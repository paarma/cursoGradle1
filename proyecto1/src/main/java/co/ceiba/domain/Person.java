package co.ceiba.domain;

public class Person {
	
	private String name;
	private String lastName;
	
	public Person(String name, String lasName){
		this.name = name;
		this.lastName = lasName;
	}
	
	public String getName(){
		return name;
	}
	
	public String getLastName(){
		return lastName;
	}
	
}
