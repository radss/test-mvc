package fajfr.test6.person;

import org.springframework.stereotype.Component;

@Component
public class Person {
private String name;
private String usrname;

public Person(){
	//setuju v konstruktoru
	this.setName("Radek");
	this.setSurname("Fajfr");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return usrname;
}

public void setSurname(String usrname) {
	this.usrname = usrname;
}

}
