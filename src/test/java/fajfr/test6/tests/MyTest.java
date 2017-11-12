package fajfr.test6.tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

import fajfr.test6.person.Person;
import junit.framework.TestCase;

public class MyTest extends TestCase {
public String testName;
public String testSurname;
	
@Before
	public void setUp(){
		Person person = new Person();
		testName=person.getName();
		testSurname=person.getSurname();
	}
	
	@Test
	public void test(){	
		assertEquals("Radek", testName);
		assertEquals("Fajfr", testSurname);
		
	}
}
