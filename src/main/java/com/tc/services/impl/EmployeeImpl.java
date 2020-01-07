package com.tc.services.impl;

import com.tc.DAO.EmployeeDAO;
import com.tc.repositories.EmployeeRepository;
import com.tc.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDAO> findAllEmployees() {
        List<EmployeeDAO> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    @Override
    public String saveEmploye(EmployeeDAO employeeData) {
        System.out.println("-->"+employeeData.getFirstName());
        employeeRepository.save(employeeData);
        return "Data Saved";
    }

    @Override
    public String updateEmployee(EmployeeDAO employeeData) {
        String msg = null;
        if(employeeData.getId() != null){
            employeeRepository.save(employeeData);
            msg = "Data Updated";
        }else{
            msg = "Error";
        }
        return msg;
    }

    @Override
    public Optional<EmployeeDAO> findEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }
}
