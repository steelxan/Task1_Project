package citibank.task1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller

public class HelloController {

    @GetMapping(value = "/")
    public String hello() {
        return "Hello Citibank, in my first Spring controller.";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Citibank") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    //http://localhost:8080/greeting?name=Citibank
}