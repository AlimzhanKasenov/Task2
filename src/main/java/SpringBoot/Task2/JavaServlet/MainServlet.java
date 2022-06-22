package SpringBoot.Task2.JavaServlet;

import SpringBoot.Task2.DB.DBManager;
import SpringBoot.Task2.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MainServlet {

    @GetMapping(value = "/")
    public String getStudent(Model model){
        ArrayList<Student> arr = DBManager.getListUsers();
        model.addAttribute("students", arr);
        return "MainPages";
    }

    @GetMapping(value = "/addStudent")
    public String addStudent(){
        return "AddStuddentPage";
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(Model model,
                             @RequestParam(value = "name") String name,
                             @RequestParam(value = "surname") String surname,
                             @RequestParam(value = "exam") int exam){
        DBManager.addStudent(name, surname, exam);
        ArrayList<Student> arr = DBManager.getListUsers();
        model.addAttribute("students", arr);
        return "redirect:/";
    }
}
