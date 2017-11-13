package fajfr.test6;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  

import fajfr.test6.person.Person;
import fajfr.test6.service.PersonList;
import fajfr.test6.serviceImp.PersonImpl;



import fajfr.test6.person.Person;

@Controller  
public class HelloWorldController {
	
	@Autowired
	public PersonList personList;
	
	
	@Autowired
	public Person person;
	
	
    @RequestMapping("/hello")  
    public ModelAndView hello() throws Exception {  
        String message = person.getName() + " " + person.getSurname(); 
        
        //zobrazí to co je v hellopage.jsp v promìnné message také zde výše
        return new ModelAndView("hellopage", "message", message);  
        
    }
    	
    	//https://www.journaldev.com/1933/java-servlet-filter-example-tutorial
        @RequestMapping(value="/showPersons")
        public ModelAndView showPersons() throws Exception{
        	List<Person> persons = personList.getAllPerson();
    		
        	ModelAndView mav = new ModelAndView("demo1");
    			mav.addObject("persons", persons);
    				return mav;
        }
        
    }  
