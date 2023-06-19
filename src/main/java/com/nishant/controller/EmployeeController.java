package com.nishant.controller;

import com.nishant.api.EmployeeApi;
import com.nishant.model.Employee;
import com.nishant.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController implements EmployeeApi {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<Employee> retrieveEmployee(Integer id) {
        return ResponseEntity.ok(service.findEmployeeById(id));
    }

    @Override
    public ResponseEntity<Employee> saveEmployee(Employee employee) {
        return new ResponseEntity<>(service.saveEmployee(employee), HttpStatus.CREATED);
    }
}