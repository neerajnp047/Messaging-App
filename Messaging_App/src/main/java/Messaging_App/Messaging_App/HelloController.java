package Messaging_App.Messaging_App;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class    HelloController {
    //UC-1 Use GET Request Method
    @RequestMapping("/hello")
    public String hello (){
        return "Hello From Bridgelabz";
    }

    //UC-2 Use GET Request Method and pass name as query parameter
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam(defaultValue = "Neeraj") String name){
        return "Hello " + name;

    }
    //UC-3 Get request with path variable
    @GetMapping("/hello/param/{name}")
    public String sayWithPath(@PathVariable String name){
        return "Hello " + name + " from Bridgelabz";
    }

    //UC-4 Post request with JSON body
    @PostMapping("/hello/post")
    public String sayWithPost(@RequestBody UserData user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from Bridgelabz";
    }

}
