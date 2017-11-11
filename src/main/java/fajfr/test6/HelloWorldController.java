package fajfr.test6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  

import fajfr.test6.person.Person;

@Controller  
public class HelloWorldController {
	@Autowired
	public Person person;
	
    @RequestMapping("/hello")  
    public ModelAndView hello() throws Exception {  
        String message = person.getName();//"hello this is test-mvc rep. Change";  
        //zobrazí to co je v hellopage.jsp v promìnné message také zde výše
        return new ModelAndView("hellopage", "message", message);  
    }  
} 