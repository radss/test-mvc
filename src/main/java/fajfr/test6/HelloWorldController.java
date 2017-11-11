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
        //zobraz� to co je v hellopage.jsp v prom�nn� message tak� zde v��e
        return new ModelAndView("hellopage", "message", message);  
    }  
} 