package fajfr.test6.person;

import org.springframework.stereotype.Component;

@Component
public class Person {
private String name;
private String usrname;

public Person(){
	this.setName("Radek");
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getUsrname() {
	return usrname;
}

public void setUsrname(String usrname) {
	this.usrname = usrname;
}

}
