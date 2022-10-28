package com.example.demo.controlles;

import com.example.demo.Employees;
import com.example.demo.repos.EmployeeRepo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MOdul {
    EmployeeRepo nameRepo;

    public MOdul(EmployeeRepo nameRepo) {
        this.nameRepo = nameRepo;
    }


    @RequestMapping("/index")
    public String saveEmployee(Model model) {
        return "index";


    }

    @PostMapping("/index")
    public String formPost(@RequestParam String name,
                           @RequestParam String lastname,
                           @RequestParam String secondname,
                           @RequestParam String sex,
                           @RequestParam String dateofbirth,
                           @RequestParam String Work,Model model) {
        Employees employees = new Employees(name, lastname, secondname,sex, dateofbirth, Work);
        nameRepo.save(employees);

        return "index";


    }

}
