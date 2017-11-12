package fajfr.test6;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  

import fajfr.test6.person.Person;
import fajfr.test6.serviceImp.PersonImpl;



import fajfr.test6.person.Person;

@Controller  
public class HelloWorldController {
	
	@Autowired
	public Person person;
	
	/*	@Autowired
	public PersonImpl personImpl;
	*/
	
    @RequestMapping(value="hello")  
    public ModelAndView hello() throws Exception {  
        String message = person.getName() + " " + person.getSurname(); 
        
        //zobrazí to co je v hellopage.jsp v promìnné message také zde výše
        return new ModelAndView("hellopage", "message", message);  
        
        
    	

    /*    @RequestMapping(value="showPersons")
        public ModelAndView showPersons(){
        	List<Person> persons = personImpl.getAllPerson();
    		
        	ModelAndView mav = new ModelAndView("demo1");
    			mav.addObject("persons", persons);
    				return mav;
        }
        */
    }  
} 