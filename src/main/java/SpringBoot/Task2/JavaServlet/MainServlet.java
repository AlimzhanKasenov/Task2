package SpringBoot.Task2.JavaServlet;

import SpringBoot.Task2.DB.DBManager;
import SpringBoot.Task2.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainServlet {

    @GetMapping(value = "/")
    public String getStudent(Model model){
        ArrayList<Student> arr = DBManager.getListUsers();
        model.addAttribute("students", arr);
        return "MainPages";
    }
}
