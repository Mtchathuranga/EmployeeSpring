package com.tc.controllers;

import com.tc.DAO.EmployeeDAO;
import com.tc.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class Employee {

    @Autowired
    private EmployeeService employeeServices;

    @GetMapping("/all")
    public List<EmployeeDAO> allEmployees(){

        return employeeServices.findAllEmployees();
    }

    @PostMapping("/addEmployee")
    public String addEmplyee(@RequestBody EmployeeDAO employeeData){

        return employeeServices.saveEmploye(employeeData);
    }

    @PutMapping("/updateEmployee")
    public String updateData(@RequestBody EmployeeDAO employeeData){

        return employeeServices.updateEmployee(employeeData);
    }

    @GetMapping("/find/{id}")
    public Optional<EmployeeDAO> findEmployeeId(@PathVariable(name = "id") Integer Id){
        return employeeServices.findEmployeeById(Id);
    }

}
