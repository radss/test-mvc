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
		
		Person pers3 = new Person();
		pers3.setName("Milanek");
		//pers2.getName();
		pers3.setSurname("Fajfrů");
		
		Person pers4 = new Person();
		pers4.setName("Fanda");
		//pers2.getName();
		pers4.setSurname("Fajfr");
		
		Person pers5 = new Person();
		pers5.setName("Martin");
		//pers2.getName();
		pers5.setSurname("Fajfr");
		
		Person pers6 = new Person();
		pers6.setName("Jirka");
		//pers2.getName();
		pers6.setSurname("Mrazek");
		
		List<Person> pers = new ArrayList<Person>();
			pers.add(pers1);
			pers.add(pers2);
			pers.add(pers3);
			pers.add(pers4);
			pers.add(pers5);
			pers.add(pers6);
		
		return pers;
	}

}
