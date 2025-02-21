package Messaging_App.Messaging_App;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello (){
        return "Hello From Bridgelabz";
    }
}
