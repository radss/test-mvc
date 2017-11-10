package fajfr.test6;


import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView hello() {  
        String message = "HELLO SPRING MVC HOW R U";  
        //zobrazí to co je v hellopage.jsp v promìnné message také zde výše
        return new ModelAndView("hellopage", "message", message);  
    }  
} 