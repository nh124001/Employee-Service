package com.nishant.service;

import com.nishant.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee findEmployeeById(Integer id) {
        return new Employee(id, "Nishant Handa", 33, "PRIVATE");
    }

    public Employee saveEmployee(Employee employee) {
        return employee;
    }
}