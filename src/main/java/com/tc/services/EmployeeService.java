package com.tc.services;

import com.tc.DAO.EmployeeDAO;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeDAO> findAllEmployees();

    String saveEmploye(EmployeeDAO employeeData);

    String updateEmployee(EmployeeDAO employeeData);

    Optional<EmployeeDAO> findEmployeeById(Integer id);
}
