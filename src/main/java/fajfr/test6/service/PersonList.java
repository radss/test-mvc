package fajfr.test6.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fajfr.test6.person.Person;


public interface PersonList {
	
	public List<Person> getAllPerson();
	
}
