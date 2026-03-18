package com.myapp.crud.controller;

import com.myapp.crud.model.Employee;
import com.myapp.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // LIST
    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("list", repo.findAll());
        return "index";
    }

    // ADD FORM
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("emp", new Employee());
        return "add";
    }

    // SAVE
    @PostMapping("/save")
    public String save(Employee emp) {
        repo.save(emp);
        return "redirect:/";
    }

    // EDIT FORM
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("emp", repo.findById(id).get());
        return "edit";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}