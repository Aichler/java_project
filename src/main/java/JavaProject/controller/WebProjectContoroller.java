package JavaProject.controller;

import JavaProject.SimplePOJOClass.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebProjectContoroller {

    @RequestMapping(value="/Hello", method=RequestMethod.GET)

    public String greetingForm(Model model) {
        model.addAttribute("Hello", new Hello());
        return "Hello";
    }

    @RequestMapping(value="/Hello.html", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Hello hello, Model model) {
        model.addAttribute("Hello", hello);
        return "result";
    }


}
