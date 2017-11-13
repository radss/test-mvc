package fajfr.test6.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fajfr.test6.person.Person;
import fajfr.test6.service.PersonList;

@Component
public class PersonImpl implements PersonList {

	public List<Person> getAllPerson() {
		
		Person pers1 = new Person();
		pers1.setName("Radek");
		//pers1.getName();
		pers1.setSurname("Fajfr");
		
		Person pers2 = new Person();
		pers2.setName("Zuzanka");
		//pers2.getName();
		pers2.setSurname("Fajfrova");
		
		List<Person> pers = new ArrayList<Person>();
			pers.add(pers1);
			pers.add(pers2);
		
		return pers;
	}

}
