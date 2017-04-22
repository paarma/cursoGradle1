package co.ceiba.testdatabuilder;

import co.ceiba.domain.Person;

public class PersonTestDataBuilder {
	
	private String name;
	private String lastName;
	
	public PersonTestDataBuilder(){
		this.name = "Ceiba";
		this.name = "Software House";
	}
	
	public PersonTestDataBuilder whithName(String name){
		this.name = name;
		return this;
	}
	
	public Person build(){
		return new Person(this.name, this.lastName);
	}
}
