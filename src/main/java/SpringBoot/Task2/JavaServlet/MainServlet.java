package SpringBoot.Task2.JavaServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainServlet {

    @GetMapping(value = "/")
    public String index(){
        return "MainPages";
    }
}
