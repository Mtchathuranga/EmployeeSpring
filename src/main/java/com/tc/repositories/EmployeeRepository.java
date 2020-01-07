package com.tc.repositories;

import com.tc.DAO.EmployeeDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeDAO,Integer> {
}
